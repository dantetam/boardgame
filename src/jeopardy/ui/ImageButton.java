package jeopardy.ui;

import processing.core.PImage;

public class ImageButton extends GameButton {

	public String url;
	public PImage img;
	
	ImageButton(String name, float a, float b, float c, float d, String url) {
		super(name, a, b, c, d);
		this.url = url;
	}
	
}
