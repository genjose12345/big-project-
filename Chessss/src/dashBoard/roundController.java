package dashBoard;

import Admin.adminController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class roundController {
	
	private adminController admincontrol;

    @FXML
    private Label team2;

    @FXML
    private Label team3;

    @FXML
    private Label team4;

    @FXML
    private Label team5;

    @FXML
    private Label team6;

    @FXML
    private Label team7;

    @FXML
    private Label team8;

    @FXML
    private Label team10;

    @FXML
    private Label team9;

    @FXML
    private Label team1;

    @FXML
    private Label tbd1;

    @FXML
    private Label tbd2;

    @FXML
    private Label tbd3;

    @FXML
    private Label tbd4;

    @FXML
    private Label tbd7;

    @FXML
    private Label tbd6;

    @FXML
    private Label tbd5;

    @FXML
    private Label tbd8;

    @FXML
    private Label tbd9;
    
 
    //method test to check if textfield.getText could send string to this class
    // admin controller --> roundController
    public void setTeam2Text() {
    	
        String team2Text = admincontrol.menuItemAdd1.getText();
        team2.setText(team2Text);
    }

 
   
    

}
