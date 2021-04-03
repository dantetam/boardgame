package jeopardy.ui;

public class GameButton {
	
	public String name;
	public float x,y;
	public float width,height;
	public Runnable onClick;
	
	public Color3f fill;
	
	public int textSize = 12;
	
	public String text;
	
	GameButton(String name, float a, float b, float c, float d) {
		this.name = name;
		x = a;
		y = b;
		width = c;
		height = d;
	}
	
	public boolean containsPixel(float mouseX, float mouseY) {
		return mouseX >= x && mouseY >= y && x <= mouseX + width && y <= mouseY + height;
	}
	
	public void setOnClick(Runnable runnable) {
		onClick = runnable;
	}
	
	public String toString() {
		return "Button, name: " + name + ", pixels: [" + x + " " + y + " " + width + " " + height + "]";
	}
	
}
