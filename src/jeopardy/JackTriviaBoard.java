package jeopardy;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jeopardy.ui.GameButton;
import jeopardy.ui.GameButtonFactory;
import jeopardy.ui.ImageButton;
import jeopardy.ui.Player;
import processing.core.PApplet;
import processing.core.PImage;

public class JackTriviaBoard extends PApplet {
	
	private GameButtonFactory buttonFactory; //Contains all the buttons visible in this class
	private Map<String, PImage> images;
	private List<Card> cards;
	private List<Card> activeCards;
	
	private List<Player> players;
	
	public static void main(String args[]) {
		PApplet.main(new String[] { JackTriviaBoard.class.getName() });
	} 
	
	public void settings() {
		size(2560,1440);
		//noLoop();
	}
	
	public void setup() {
		buttonFactory = new GameButtonFactory(this.width, this.height);
		images = new HashMap<>();
		
		cards = new CardProcessor().init("./data/output");
		Collections.shuffle(cards);
		activeCards = new ArrayList<>();
		
		players = new ArrayList<>();
		
		GameButton testButton = buttonFactory.newButton("worldCircle", 0.4f, 0.25f, 0.3f, 0.25f);
		System.out.println(testButton.toString());
		testButton.setOnClick(() -> {
			System.out.println("Clicked test button");
		});
		
		for (int i = 0; i < 7; i++) {
			drawCardIntoHand();
		}
		
		background(255);
		drawGame();
	}

	public void draw() {
		
	}
	
	public void mousePressed() {
		System.out.println("mouse click");
		try {
			int i = mouseX / (this.width / this.activeCards.size());
			System.out.println(i + " " + activeCards.get(i).toString());
			
			if (mouseY > 1000) {
				activeCards.remove(i);
				drawCardIntoHand();
			}
			/*
			 * for (GameButton button: buttonFactory.allButtons) { if
			 * (button.containsPixel(mouseX, mouseY)) { button.onClick.run();
			 * System.out.println("Button clicked: " + button.toString()); } }
			 */
		} catch (Exception e) {
			
		}
	}
	
	public void drawGame() {
		System.out.println("Drawing All Cards");
		for (int i = 0; i < activeCards.size(); i++) {
			Card card = activeCards.get(i);
			System.out.println("Card " + i + ": " + card.toString());
		}
		
		background(255,255,255);
		
		buttonFactory.clearAll();
		
		for (int i = 0; i < activeCards.size(); i++) {
			Card card = activeCards.get(i);
			float width = 1.0f / (float) activeCards.size();
			float height = (float) (width * this.width * 1.4 / this.height);
			ImageButton cardButton = buttonFactory.newImageButton(
					card.name, i * width, 1 - height - 0.05f, width, height, card.name);
			System.out.println(cardButton.toString());
			cardButton.img = card.pImage;
			final int j = i;
			cardButton.setOnClick(() -> {
				/*
				activeCards.remove(j);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				*/
				//drawCardIntoHand();
			});
		}
		
		for (GameButton button: buttonFactory.allButtons) {
			if (button instanceof ImageButton) {
				ImageButton imageButton = (ImageButton) button;
				if (imageButton.img == null) {
					PImage pImage = loadOrRetrievePImage(imageButton.url);
					imageButton.img = pImage;
				}
				image(imageButton.img, button.x, button.y, button.width, button.height);
			}
			else {
				fill(button.fill.r, button.fill.g, button.fill.b);
				rect(button.x, button.y, button.width, button.height);
				if (button.text != null && button.text.trim().length() > 0) {
					text(button.text, button.x, button.y);
				}
			}
		}
	}
	
	public PImage loadOrRetrievePImage(String fileName) {
		PImage pImage = images.get(fileName);
		if (pImage == null) {
			System.out.println(fileName);
			pImage = loadImage(fileName);
			images.put(fileName, pImage);
		}
		return pImage;
	}
	
	public void drawCardIntoHand() {
		if (cards.size() > 0) {
			Card topOfDeck = cards.remove(0);
			activeCards.add(topOfDeck);
			System.out.println("Drew a card");
		}
		else {
			GameButton button = buttonFactory.newButton("worldCircle", 0.4f, 0.25f, 0.3f, 0.25f);
			button.text = "No more cards in the deck!";
		}
		drawGame();
	}
	
	public class CardProcessor {
		
		public List<Card> init(String cardDir) {
			List<Card> cards = new ArrayList<>();
			File dir = new java.io.File(cardDir);
			for (File file: dir.listFiles()) {
			 	if (!file.isDirectory()) {
			 		String fullName = "./data/output/" + file.getName();
			 		String[] tokens = file.getName().split(";");
			 		int count = Integer.parseInt(tokens[1].split("\\.")[0]);
					PImage pImage = loadImage(fullName);
					Card card = new Card(fullName, pImage);
					for (int i = 0; i < count; i++) {
						cards.add(card);
					}
			 	}
			}
			return cards;
		}
		
	}
	
	public class Card {
		public String name;
		public PImage pImage;
		public Card(String name, PImage pImage) {
			super();
			this.name = name;
			this.pImage = pImage;
		}
		public String toString() {
			return name;
		}
	}
	
}
