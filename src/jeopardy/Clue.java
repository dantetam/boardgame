package jeopardy;

public class Clue {

	public int value;
	public boolean isDailyDouble;
	public String clue, answer;
	public boolean active;
	
	public Clue(int value, boolean isDailyDouble, String clue, String answer) {
		super();
		this.value = value;
		this.isDailyDouble = isDailyDouble;
		this.clue = clue;
		this.answer = answer;
		active = true;
	}

	@Override
	public String toString() {
		return "Clue [value=" + value + ", isDailyDouble=" + isDailyDouble + ", clue=" + clue + ", answer=" + answer
				+ "]";
	}
	
	public String shortString() {
		return "Clue: " + value + " " + clue.substring(0,10);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		result = prime * result + ((clue == null) ? 0 : clue.hashCode());
		result = prime * result + (isDailyDouble ? 1231 : 1237);
		result = prime * result + value;
		return result;
	}
	
}
