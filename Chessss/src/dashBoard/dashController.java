package dashBoard;

import java.io.IOException;

import application.MainController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class dashController {
    @FXML
    private AnchorPane anchorpane;
    @FXML
    private ScrollPane scrollpane;
    @FXML
    private Button tournamentButton;
    @FXML
    private Button supportButton;
    @FXML
    private Button statsButton;
    @FXML
    private Button admin;
    @FXML
    private Button logout;
    @FXML
    private StackPane content;
    @FXML
    public Label userName;

    private Node currentContent;

    MainController controller = new MainController();
    private String username; // Add a String variable to store the username

    public void initialize(MainController mainController, String username) {
        if (mainController.isAdmin()) {
            admin.setDisable(false);
        } else {
            admin.setDisable(true);
        }
        this.username = username; // Set the username value in the dashController
        displayUser(username); // Set the userName label with the username value
    }

    public void displayUser(String txt) {
        userName.setText(txt);
    }


    
    @FXML
    private void tournamentButtonOnAction(ActionEvent event) throws IOException {
        AnchorPane newContent = FXMLLoader.load(getClass().getResource("/Round1.fxml"));
        setContent(newContent);
    }

    @FXML
    private void supportButtonOnAction(ActionEvent event) throws IOException {
        AnchorPane supp = FXMLLoader.load(getClass().getResource("/support.fxml"));
        setContent(supp);
    }
    
    @FXML
    private void statsButtonOnAction(ActionEvent event) throws IOException {
        ScrollPane stats = FXMLLoader.load(getClass().getResource("/stat.fxml"));
        setContent(stats);
    }
    
    @FXML
    private void adminOnAction(ActionEvent event) throws IOException {
    	AnchorPane admin = FXMLLoader.load(getClass().getResource("/admin.fxml"));
    	setContent(admin);
    }
    

    
    @FXML
    private void logoutOnActon(ActionEvent event) {
        Stage currentStage = (Stage) content.getScene().getWindow();
        currentStage.close();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/LoginFXML.fxml"));
        try {
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("DashBoard");
            stage.show();
            MainController controller = loader.getController();
	        controller.setLoginStage(stage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void setContent(Node newContent) {
        if (currentContent != null) {
            content.getChildren().remove(currentContent);
        }
        content.getChildren().add(newContent);
        currentContent = newContent;
    }
}
