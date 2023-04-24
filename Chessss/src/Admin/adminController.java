package Admin;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class adminController {

	@FXML
	public TextField team1;
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
	public MenuItem menuItemAdd1;

	@FXML
	private TextField TeamP1;

	@FXML
	private TextField TeamP2;

	@FXML
	private TextField TeamP3;

	@FXML
	private TextField TeamP4;

	@FXML
	private TextField TeamP5;

	@FXML
	private TextField TeamP6;

	@FXML
	private TextField TeamP7;

	@FXML
	private TextField TeamP8;

	@FXML
	private TextField TeamP9;

	@FXML
	private TextField TeamP10;

	@FXML
	private Button generateSchedule;
	@FXML
	private Button resetSchedule;
	@FXML
	private AnchorPane anchorpane;

	private String a;
	private String b;
	private String c;
	private String d;
	private String e;
	private String f;
	private String g;
	private String h;
	private String i;
	private String j;

	@FXML
	public void generate(ActionEvent event) {
		String filename = "src/Data.csv";
		try {
			FileWriter writer = new FileWriter(filename, true); // append to existing file if it exists
			writer.write(a + "\n");
			writer.write(b + "\n");
			writer.write(c + "\n");
			writer.write(d + "\n");
			writer.write(e + "\n");
			writer.write(f + "\n");
			writer.write(g + "\n");
			writer.write(h + "\n");
			writer.write(i + "\n");
			writer.write(j + "\n");
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void reset(ActionEvent event) {
		try {
			// Erase Data.csv
			FileWriter dataWriter = new FileWriter("src/Data.csv", false);
			dataWriter.close();

			// Erase RandomPointData.csv
			FileWriter randomDataWriter = new FileWriter("src/RandomPointData.csv", false);
			randomDataWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		team1.setText("");
		team2.setText("");
		team3.setText("");
		team4.setText("");
		team5.setText("");
		team6.setText("");
		team7.setText("");
		team8.setText("");
		team9.setText("");
		team10.setText("");
		TeamP1.setText("");
		TeamP2.setText("");
		TeamP3.setText("");
		TeamP4.setText("");
		TeamP5.setText("");
		TeamP6.setText("");
		TeamP7.setText("");
		TeamP8.setText("");
		TeamP9.setText("");
		TeamP10.setText("");
	}

	@FXML
	public void initialize() {
		// set the initial text of the MenuButton
		menuButton1.setText("Update");
	}

	@FXML
	public void menuItemAdd1(ActionEvent event) {
		menuButton1.setText("Add");
		String value = team1.getText().isEmpty() ? "null" : team1.getText();
		a = value;

		String value1 = team2.getText().isEmpty() ? "null" : team2.getText();
		b = value1;

		String value2 = team3.getText().isEmpty() ? "null" : team3.getText();
		c = value2;

		String value3 = team4.getText().isEmpty() ? "null" : team4.getText();
		d = value3;

		String value4 = team5.getText().isEmpty() ? "null" : team5.getText();
		e = value4;

		String value5 = team6.getText().isEmpty() ? "null" : team6.getText();
		f = value5;

		String value6 = team7.getText().isEmpty() ? "null" : team7.getText();
		g = value6;

		String value7 = team8.getText().isEmpty() ? "null" : team8.getText();
		h = value7;

		String value8 = team9.getText().isEmpty() ? "null" : team9.getText();
		i = value8;

		String value9 = team10.getText().isEmpty() ? "null" : team10.getText();
		j = value9;

		String teamP1Value = TeamP1.getText().isEmpty() ? "null" : TeamP1.getText();
		
		String teamP2Value = TeamP2.getText().isEmpty() ? "null" : TeamP2.getText();
		
		String teamP3Value = TeamP3.getText().isEmpty() ? "null" : TeamP3.getText();
		
		String teamP4Value = TeamP4.getText().isEmpty() ? "null" : TeamP4.getText();
		
		String teamP5Value = TeamP5.getText().isEmpty() ? "null" : TeamP5.getText();
		
		String teamP6Value = TeamP6.getText().isEmpty() ? "null" : TeamP6.getText();
		
		String teamP7Value = TeamP7.getText().isEmpty() ? "null" : TeamP7.getText();
		
		String teamP8Value = TeamP8.getText().isEmpty() ? "null" : TeamP8.getText();
		
		String teamP9Value = TeamP9.getText().isEmpty() ? "null" : TeamP9.getText();
		
		String teamP10Value = TeamP10.getText().isEmpty() ? "null" : TeamP10.getText();

		String filename = "src/RandomPointData.csv";
		try {
			FileWriter writer = new FileWriter(filename, false); // overwrite existing file
			writer.write(a + "," + teamP1Value + "\n");
			writer.write(b + "," + teamP2Value + "\n");
			writer.write(c + "," + teamP3Value + "\n");
			writer.write(d + "," + teamP4Value + "\n");
			writer.write(e + "," + teamP5Value + "\n");
			writer.write(f + "," + teamP6Value + "\n");
			writer.write(g + "," + teamP7Value + "\n");
			writer.write(h + "," + teamP8Value + "\n");
			writer.write(i + "," + teamP9Value + "\n");
			writer.write(j + "," + teamP10Value + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}