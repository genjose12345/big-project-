package support;

import javafx.fxml.FXML;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class supportController {

	@FXML
	private WebView video;
	

	public void initialize() {
		WebEngine engine = video.getEngine();
		engine.load("https://www.youtube.com/embed/ej_fnsdsksA");
	}

}