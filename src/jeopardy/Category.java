package jeopardy;

public class Category extends Clue {

	public String category;
	
	public Category(String category) {
		super(-1, false, "", "");
		this.category = category;
	}
	
}
