package jeopardy.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameButtonFactory {
	
	public List<GameButton> allButtons;
	public Map<String, GameButton> buttonsById;
	public float screenWidth, screenHeight;
	
	public GameButtonFactory(float screenWidth, float screenHeight) {
		allButtons = new ArrayList<>();
		buttonsById = new HashMap<>();
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
	}
	
	/**
	 * @return A new GameButton, with coords a-d scaled from 0 to 1 representing 0 to ScreenWidth
	 */
	public GameButton newButton(String id, float a, float b, float c, float d) {
		GameButton button = new GameButton(id,a*screenWidth,b*screenHeight,c*screenWidth,d*screenHeight);
		allButtons.add(button);
		if (buttonsById.containsKey(id)) {
			System.err.println("Warning, duplicate id button: " + id);
		} else {
			buttonsById.put(id, button);
		}
		return button;
	}
	
	public ImageButton newImageButton(String id, float a, float b, float c, float d, String url) {
		ImageButton button = new ImageButton(id,a*screenWidth,b*screenHeight,c*screenWidth,d*screenHeight, url);
		allButtons.add(button);
		if (buttonsById.containsKey(id)) {
			System.err.println("Warning, duplicate id (image) button: " + id);
		} else {
			buttonsById.put(id, button);
		}
		return button;
	}
	
	public void clearAll() {
		buttonsById.clear();
		allButtons.clear();
	}
	
	
	
}
