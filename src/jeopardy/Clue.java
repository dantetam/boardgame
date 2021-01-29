package jeopardy;

public class Clue {

	public int value;
	public boolean isDailyDouble;
	public String clue, answer;
	
	public Clue(int value, boolean isDailyDouble, String clue, String answer) {
		super();
		this.value = value;
		this.isDailyDouble = isDailyDouble;
		this.clue = clue;
		this.answer = answer;
	}
	
}
