package register;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import application.MainController;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class registerController {

	@FXML
	private TextField firstnameTextField;

	@FXML
	private TextField lastnameTextfield;

	@FXML
	private TextField usernameTextField;

	@FXML
	private TextField passwordTextField;

	@FXML
	private TextField confirmpasswordTextField;

	@FXML
	private Button userRegister;
	
	@FXML
	private Button Closebutton;

	private MainController mainController;

	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}

	@FXML
	public void userRegisterOnAction(ActionEvent event) {
		String username1 = usernameTextField.getText();
		String password1 = passwordTextField.getText();
		String confirmpassword1 = confirmpasswordTextField.getText();

		if (username1.isEmpty() || password1.isEmpty() || confirmpassword1.isEmpty()) {
			Alert a = new Alert(AlertType.WARNING, "Username and password cannot be empty.");
			a.setTitle("Input Error");
			a.setHeaderText("Invalid input");
			a.show();
		} else if (password1.equals(confirmpassword1)) {
			String checker = username1 + "," + password1;
			try {
				BufferedWriter writer = new BufferedWriter(
						new FileWriter("C:\\Users\\Erik Vasquez\\Documents\\user_credentials.csv", true));
				writer.append("\n" + checker);
				writer.close();
				Alert b = new Alert(AlertType.INFORMATION, "Registration complete");
				b.setTitle("Success");
				b.setHeaderText("Please login with username and password");
				
				Stage currentStage = (Stage) userRegister.getScene().getWindow();
				currentStage.close();
				
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/LoginFXML.fxml"));
		        Parent root = loader.load();
		        Scene scene = new Scene(root);
		        Stage stage = new Stage();
		        stage.setScene(scene);
		        stage.setResizable(false);
		        stage.setTitle("DashBoard");
		        stage.show();
		        b.show();
		        MainController controller = loader.getController();
		        controller.setLoginStage(stage);

			}

			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	@FXML
	public void close(ActionEvent event) {
		Stage currentStage = (Stage) userRegister.getScene().getWindow();
		currentStage.close();
		try {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/LoginFXML.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("DashBoard");
        stage.show();
        MainController controller = loader.getController();
        controller.setLoginStage(stage);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
