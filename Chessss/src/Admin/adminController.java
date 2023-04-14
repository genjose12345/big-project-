package Admin;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class adminController {

	@FXML
	private TextField team1;
	@FXML
	private TextField team2;
	@FXML
	private TextField team3;
	@FXML
	private TextField team4;
	@FXML
	private TextField team5;
	@FXML
	private TextField team6;
	@FXML
	private TextField team7;
	@FXML
	private TextField team8;
	@FXML
	private TextField team9;
	@FXML
	private TextField team10;

	
	@FXML
	private MenuButton menuButton1;
	@FXML
	private MenuButton menuButton2;
	@FXML
	private MenuButton menuButton3;
	@FXML
	private MenuButton menuButton4;
	@FXML
	private MenuButton menuButton5;
	@FXML
	private MenuButton menuButton6;
	@FXML
	private MenuButton menuButton7;
	@FXML
	private MenuButton menuButton8;
	@FXML
	private MenuButton menuButton9;
	@FXML
	private MenuButton menuButton10;


	@FXML
	public MenuItem menuItemAdd1;
	@FXML
	private MenuItem menuItemAdd2;
	@FXML
	private MenuItem menuItemAdd3;
	@FXML
	private MenuItem menuItemAdd4;
	@FXML
	private MenuItem menuItemAdd5;
	@FXML
	private MenuItem menuItemAdd6;
	@FXML
	private MenuItem menuItemAdd7;
	@FXML
	private MenuItem menuItemAdd8;
	@FXML
	private MenuItem menuItemAdd9;
	@FXML
	private MenuItem menuItemAdd10;

	@FXML
	private MenuItem menuItemRemove1;
	@FXML
	private MenuItem menuItemRemove2;
	@FXML
	private MenuItem menuItemRemove3;
	@FXML
	private MenuItem menuItemRemove4;
	@FXML
	private MenuItem menuItemRemove5;
	@FXML
	private MenuItem menuItemRemove6;
	@FXML
	private MenuItem menuItemRemove7;
	@FXML
	private MenuItem menuItemRemove8;
	@FXML
	private MenuItem menuItemRemove9;
	@FXML
	private MenuItem menuItemRemove10;

	@FXML
	private Button generateTournament;
	@FXML
	private Button resetTournament;

	
	
	

	@FXML
	void generate(ActionEvent event) {
		
		try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Round1.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root);
            Stage roundStage = new Stage();
            roundStage.setScene(scene);
            roundStage.setTitle("bracket");
            roundStage.show();
            roundStage.setResizable(false);
            Stage currentStage = (Stage) generateTournament.getScene().getWindow();
			currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
		

	



	@FXML
	public void initialize() {
		// set the initial text of the MenuButton
		menuButton1.setText("Update");
	}

	@FXML
	void menuItemAdd1(ActionEvent event) {

		menuButton1.setText("Add");
		String a = team1.getText();
	}

	@FXML
	void menuItemAdd2(ActionEvent event) {
		menuButton2.setText("Add");
		String b = team2.getText();
	}

	@FXML
	void menuItemAdd3(ActionEvent event) {
		menuButton3.setText("Add");
		String c = team3.getText();
	}

	@FXML
	void menuItemAdd4(ActionEvent event) {
		menuButton4.setText("Add");
		String d = team4.getText();
	}

	@FXML
	void menuItemAdd5(ActionEvent event) {
		menuButton5.setText("Add");
		String e = team5.getText();
	}

	@FXML
	void menuItemAdd6(ActionEvent event) {
		menuButton6.setText("Add");
		String f = team6.getText();
	}

	@FXML
	void menuItemAdd7(ActionEvent event) {
		menuButton7.setText("Add");
		String g = team7.getText();
	}

	@FXML
	void menuItemAdd8(ActionEvent event) {
		menuButton8.setText("Add");
		String h = team8.getText();
	}

	@FXML
	void menuItemAdd9(ActionEvent event) {
		menuButton9.setText("Add");
		String i = team9.getText();
	}

	@FXML
	void menuItemAdd10(ActionEvent event) {
		menuButton10.setText("Add");
		String j = team10.getText();
	}

	@FXML
	void menuItemRemove1(ActionEvent event) {
		menuButton1.setText("remove");
	}

	@FXML
	void menuItemRemove2(ActionEvent event) {
		menuButton2.setText("remove");
	}

	@FXML
	void menuItemRemove3(ActionEvent event) {
		menuButton3.setText("remove");
	}

	@FXML
	void menuItemRemove4(ActionEvent event) {
		menuButton4.setText("remove");
	}

	@FXML
	void menuItemRemove5(ActionEvent event) {
		menuButton5.setText("remove");
	}

	@FXML
	void menuItemRemove6(ActionEvent event) {
		menuButton6.setText("remove");
	}

	@FXML
	void menuItemRemove7(ActionEvent event) {
		menuButton7.setText("remove");
	}

	@FXML
	void menuItemRemove8(ActionEvent event) {
		menuButton8.setText("remove");
	}

	@FXML
	void menuItemRemove9(ActionEvent event) {
		menuButton9.setText("remove");
	}

	@FXML
	void menuItemRemove10(ActionEvent event) {
		menuButton10.setText("remove");
	}

	@FXML
	void reset(ActionEvent event) {

	}

}