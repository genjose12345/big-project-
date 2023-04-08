package register;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import application.MainController;

import java.io.FileWriter;
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
				Alert b = new Alert(AlertType.INFORMATION, "Please run application again");
				b.setTitle("Success");
				b.setHeaderText("Restart application to update user and password information");
				b.show();
				Stage currentStage = (Stage) userRegister.getScene().getWindow();
				currentStage.close();

			}

			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
