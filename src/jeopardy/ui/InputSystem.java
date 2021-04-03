package jeopardy.ui;

public class InputSystem {

	public static void processClick(GameButtonFactory buttonFactory, float mouseX, float mouseY) {
		for (GameButton button: buttonFactory.allButtons) {
			if (button.containsPixel(mouseX, mouseY)) {
				button.onClick.run();
			}
		}
	}
	
}
