package support;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class supportController {
	@FXML
	private Button getSupport;
	@FXML
	private Button contacts;
	@FXML
	private WebView video;
	//default classes that open browser
	public void getSupportOnAction(ActionEvent event) {
		String url = "https://www.uschess.org/index.php/beta-FAQs/Frequently-Asked-Questions-FAQs.html";
		System.out.println("Opening URL: " + url);
		try {
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
		} catch (java.io.IOException e) {
			System.out.println("Failed to open link " + url);
		}
	}

	public void contactsOnAction(ActionEvent event) {
		String url = "https://new.uschess.org/about/staff-2";
		System.out.println("Opening URL: " + url);
		try {
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
		} catch (java.io.IOException e) {
			System.out.println("Failed to open link " + url);
		}
	}
	
	public void initialize() {
        WebEngine engine = video.getEngine();
        engine.load("https://www.youtube.com/embed/ej_fnsdsksA");
    }

}