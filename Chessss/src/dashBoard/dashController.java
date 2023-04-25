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
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class dashController {
    @FXML
    private AnchorPane anchorpane;
    @FXML
    private ScrollPane scrollpane;
    @FXML
    private Button home;
    @FXML
    private Button supportButton;
    @FXML
    private Button statsButton;
    @FXML
    private Button admin;
    @FXML
    private Button scheduleButton;
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
    private void homeButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Home.fxml"));
        AnchorPane home = loader.load();
        HomeController homeController = loader.getController();
        homeController.setUserText(username); // call the setUserText method in HomeController
        setContent(home);
    }

    

    @FXML
    private void supportButtonOnAction(ActionEvent event) throws IOException {
        ScrollPane supp = FXMLLoader.load(getClass().getResource("/Support.fxml"));
        setContent(supp);
    }
    
    @FXML
    private void statsButtonOnAction(ActionEvent event) throws IOException {
        AnchorPane stats = FXMLLoader.load(getClass().getResource("/stat.fxml"));
        setContent(stats);
    }
    
    @FXML
    private void scheduleOnAction(ActionEvent event) throws IOException {
        ScrollPane schedule = FXMLLoader.load(getClass().getResource("/ROUND_1.fxml"));
        setContent(schedule);
    }
    
    @FXML
    private void adminOnAction(ActionEvent event) throws IOException {
    	AnchorPane admin = FXMLLoader.load(getClass().getResource("/admin.fxml"));
    	setContent(admin);
    }
    

    //handles logout button and loads login screen and functions as well through controller object
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
            
            Image image = new Image("/images/White Orange Modern N Alphabet Tech Business Logo (4).png");
            stage.getIcons().add(image);
            
            MainController controller = loader.getController();
	        controller.setLoginStage(stage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //sets content within StackPane, removes and adds content
    private void setContent(Node newContent) {
        if (currentContent != null) {
            content.getChildren().remove(currentContent);
        }
        content.getChildren().add(newContent);
        currentContent = newContent;
    }
}
