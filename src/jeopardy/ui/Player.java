package jeopardy.ui;

import java.util.ArrayList;
import java.util.List;

import jeopardy.JackTriviaBoard.Card;

public class Player {

	public String name;
	
	public List<Card> items;
	public int health;
	
	public Player(String name) {
		this.name = name;
		this.items = new ArrayList<>();
		this.health = 3;
	}
	
}
