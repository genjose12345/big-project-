package dashBoard;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class dashController {
    @FXML
    private AnchorPane anchorpane;
    @FXML
    private Button tournamentButton;
    @FXML
    private Button supportButton;
    @FXML
    private StackPane content;

    private Node currentContent;

    @FXML
    private void tournamentButtonOnAction(ActionEvent event) throws IOException {
        AnchorPane newContent = FXMLLoader.load(getClass().getResource("/ChessOfficialEditor.fxml"));
        setContent(newContent);
    }

    @FXML
    private void supportButtonOnAction(ActionEvent event) throws IOException {
        AnchorPane newContent = FXMLLoader.load(getClass().getResource("/support.fxml"));
        setContent(newContent);
    }

    private void setContent(Node newContent) {
        if (currentContent != null) {
            content.getChildren().remove(currentContent);
        }
        content.getChildren().add(newContent);
        currentContent = newContent;
    }
}
