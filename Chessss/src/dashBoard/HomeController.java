
package dashBoard;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeController {
    @FXML
    private Label userText;

    public void setUserText(String username) {
        userText.setText(username);
    }
}
