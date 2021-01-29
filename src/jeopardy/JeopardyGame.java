package jeopardy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import processing.core.PApplet;

public class JeopardyGame extends PApplet {
	
	public List<String> categories;
	public List<List<Clue>> allClues;
	
	public GameMode mode = GameMode.BOARD;
	public Clue currentClue = null;
	
	public static void main(String args[]) {
		PApplet.main(new String[] { "--present", JeopardyGame.class.getName() });
	} 
	
	public void settings() {
		size(1920,1080);
		noLoop();
	}
	
	public void setup() {
		categories = new ArrayList<>();
		allClues = new ArrayList<>();
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("./clues.txt"));
			String line;
			
			int curValue = -1;
			String curClue = "";
			boolean isDailyDouble = false;
			
			while ((line = reader.readLine()) != null) {
				line = line.trim().toUpperCase();
				if (line.length() > 0) {
					if (line.startsWith("CATEGORY:")) {
						String category = line.split(":")[1].trim();
						categories.add(category);
						allClues.add(new ArrayList<>());
					}
					else if (line.contains("ANSWER:")) {
						String answer = line.split(":")[1].trim();
						Clue clue = new Clue(curValue, isDailyDouble, curClue, answer);
						allClues.get(allClues.size() - 1).add(clue);
					}
					else if (line.contains("DAILY DOUBLE") || isNumeric(line)) {						
						curClue = "";
						isDailyDouble = line.contains("DAILY DOUBLE");
						if (isDailyDouble) {
							curValue = Integer.parseInt(line.split(" ")[0].trim());
						}
						else {
							curValue = Integer.parseInt(line);
						}
					}
					else {
						curClue += line;
					}
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void draw() {
		if (mode == GameMode.BOARD || mode == GameMode.BOARD_REVEALED_DAILY_DOUBLE) {
			drawBoard();
		}
		else { //READING_CLUE, SHOW_CLUE_ANSWER
			drawClue();
		}
	}
	
	public void drawBoard() {
		background(255);
		stroke(0);
		strokeWeight(15);

		int clueWidth = width / allClues.size();
		int clueHeight = height / allClues.get(0).size();
		for (int c = 0; c < allClues.size(); c++) {
			for (int r = 0; r < allClues.get(0).size(); r++) {
				textSize(120);
				Clue clue = allClues.get(c).get(r);
				if (clue.active) {
					fill(0,120,255);
					rect(c*clueWidth, r*clueHeight, clueWidth, clueHeight);
					fill(255);
					if (mode == GameMode.BOARD_REVEALED_DAILY_DOUBLE && clue.equals(currentClue)) {
						textSize(80);
						text("DAILY\nDOUBLE", (c+0.1f)*clueWidth, (r+0.3f)*clueHeight);
					}
					else
						text(clue.value, (c+0.25f)*clueWidth, (r+0.5f)*clueHeight);
				}
				else {
					
				}
			}
		}
	}
	
	public void drawClue() {
		background(0,120,255);
		fill(255);
		strokeWeight(5);
		stroke(0);
		text(currentClue.clue, 0, 120, width, height - 500);
		if (mode == GameMode.SHOW_CLUE_ANSWER) {
			text(currentClue.answer, 0, height - 500 + 120, width, 500);
		}
	}
	
	public void mousePressed() {
		if (mode == GameMode.BOARD_REVEALED_DAILY_DOUBLE) {
			mode = GameMode.READING_CLUE;
			currentClue.active = false;
		}
		else if (mode == GameMode.READING_CLUE) {
			mode = GameMode.SHOW_CLUE_ANSWER;
		}
		else if (mode == GameMode.SHOW_CLUE_ANSWER) {
			mode = GameMode.BOARD;
			drawBoard();
		}
		else {
			int clueWidth = width / allClues.size();
			int clueHeight = height / allClues.get(0).size();
			int category = mouseX / clueWidth;
			int clueIndex = mouseY / clueHeight;
			System.out.println(category + " " + clueIndex);
			Clue clue = allClues.get(category).get(clueIndex);
			if (clue.active) {
				currentClue = clue;
				if (clue.isDailyDouble) {
					mode = GameMode.BOARD_REVEALED_DAILY_DOUBLE;
					drawBoard();
				}
				else {
					mode = GameMode.READING_CLUE;
					clue.active = false;
				}
			}
		}
		redraw();
	}
	
	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
	}
	
}
