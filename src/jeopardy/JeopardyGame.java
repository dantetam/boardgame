package jeopardy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import processing.core.PApplet;

public class JeopardyGame extends PApplet {
	
	public static void main(String args[]) {
		PApplet.main(new String[] { "--present", JeopardyGame.class.getName() });
	} 
	
	public void settings() {
		size(1920,1080);
	}
	
	public void setup() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("./clues.txt"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void draw() {
		background(0,120,255);
	}
	
}
