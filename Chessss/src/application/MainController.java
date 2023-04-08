package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    private Button loginButton;
    
    @FXML
    private Button registerButton;
    
    @FXML
    private Label invalidLogin;


    private Stage loginStage;

    public void setLoginStage(Stage loginStage) {
        this.loginStage = loginStage;
    }
    public Stage getLoginStage() {
        return loginStage;
    }


    @FXML
    public void loginOnAction(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        boolean validCredentials = false;

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Erik Vasquez\\Documents\\user_credentials.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(password)) {
                    validCredentials = true;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (validCredentials) {
            try {
                Stage dashboardStage = new Stage();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/dash3.fxml"));
                AnchorPane root = loader.load();
                Scene scene = new Scene(root);
                dashboardStage.setScene(scene);
                dashboardStage.setTitle("DashBoard");
                loginStage.close();
                dashboardStage.show();
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            invalidLogin.setVisible(true);
        }
    }
    
    @FXML
    public void registerOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/register.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root);
            Stage registerstage = new Stage();
            registerstage.setScene(scene);
            registerstage.setTitle("Register");
            registerstage.show();
            loginStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    
}
