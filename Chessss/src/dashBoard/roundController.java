package dashBoard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class roundController {

	@FXML
	private Label week1M1;

	@FXML
	private Label week1M2;

	@FXML
	private Label week1M3;

	@FXML
	private Label week1M4;

	@FXML
	private Label week1M5;

	@FXML
	private Label week1M6;

	@FXML
	private Label week2M1;

	@FXML
	private Label week2M2;

	@FXML
	private Label week2M3;

	@FXML
	private Label week2M4;

	@FXML
	private Label week2M5;

	@FXML
	private Label week2M6;

	@FXML
	private Label week3M1;

	@FXML
	private Label week3M2;

	@FXML
	private Label week3M3;

	@FXML
	private Label week3M4;

	@FXML
	private Label week3M5;

	@FXML
	private Label week3M6;

	@FXML
	private Label week4M1;

	@FXML
	private Label week4M2;

	@FXML
	private Label week4M3;

	@FXML
	private Label week4M4;

	@FXML
	private Label week4M5;

	@FXML
	private Label week4M6;

	@FXML
	private Label week5M1;

	@FXML
	private Label week5M2;

	@FXML
	private Label week5M3;

	@FXML
	private Label week5M4;

	@FXML
	private Label week5M5;

	@FXML
	private Label week5M6;

	@FXML
	private Label week6M1;

	@FXML
	private Label week6M2;

	@FXML
	private Label week6M3;

	@FXML
	private Label week6M4;

	@FXML
	private Label week6M5;

	@FXML
	private Label week6M6;

	@FXML
	private Label week7M1;

	@FXML
	private Label week7M2;

	@FXML
	private Label week7M3;

	@FXML
	private Label week7M4;

	@FXML
	private Label week7M5;

	@FXML
	private Label week7M6;

	@FXML
	private Label week8M1;

	@FXML
	private Label week8M2;

	@FXML
	private Label week8M3;

	@FXML
	private Label week8M4;

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
	//sets null value labels to invisible
	private void checkLabelForNull(Label label) {
		if (label.getText().contains("null")) {
			label.setVisible(false);
		}
	}
	
	/*
	 reads CSV file data and sets Label fields text using reflection.
	 It hides null label values by invoking checkLabelForNull method 
	 */
	@FXML
	public void initialize() {
		try (BufferedReader br = new BufferedReader(new FileReader("src/Data.csv"))) {
			String line;
			int x = 0;
			while ((line = br.readLine()) != null && x < 10) {
				switch (x) {
				case 0:
					a = line;
					break;
				case 1:
					b = line;
					break;
				case 2:
					c = line;
					break;
				case 3:
					d = line;
					break;
				case 4:
					e = line;
					break;
				case 5:
					f = line;
					break;
				case 6:
					g = line;
					break;
				case 7:
					h = line;
					break;
				case 8:
					i = line;
					break;
				case 9:
					j = line;
					break;
				}
				x++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		Field[] fields = this.getClass().getDeclaredFields();
		for (Field field : fields) {
			if (field.getType() == Label.class) {
				try {
					Label label = (Label) field.get(this);
					checkLabelForNull(label);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}

			// Set text for Week 1 matchups
			week1M1.setText(a + " VS. " + b);
			week1M2.setText(b + " VS. " + c);
			week1M3.setText(d + " VS. " + e);
			week1M4.setText(e + " VS. " + f);
			week1M5.setText(g + " VS. " + h);
			week1M6.setText(i + " VS. " + j);

			// Set text for Week 2 matchups
			week2M1.setText(a + " VS. " + c);
			week2M2.setText(b + " VS. " + d);
			week2M3.setText(c + " VS. " + e);
			week2M4.setText(d + " VS. " + f);
			week2M5.setText(h + " VS. " + i);
			week2M6.setText(f + " VS. " + g);

			// Set text for Week 3 matchups
			week3M1.setText(a + " VS. " + d);
			week3M2.setText(b + " VS. " + e);
			week3M3.setText(c + " VS. " + f);
			week3M4.setText(d + " VS. " + g);
			week3M5.setText(e + " VS. " + h);
			week3M6.setText(f + " VS. " + i);

			// Set text for Week 4 matchups
			week4M1.setText(a + " VS. " + e);
			week4M2.setText(b + " VS. " + f);
			week4M3.setText(c + " VS. " + g);
			week4M4.setText(d + " VS. " + h);
			week4M5.setText(e + " VS. " + i);
			week4M6.setText(f + " VS. " + j);

			// Set text for Week 5 matchups
			week5M1.setText(a + " VS. " + f);
			week5M2.setText(b + " VS. " + g);
			week5M3.setText(c + " VS. " + h);
			week5M4.setText(d + " VS. " + i);
			week5M5.setText(e + " VS. " + j);
			week5M6.setText(a + " VS. " + h);

			// Set text for Week 6 matchups
			week6M1.setText(a + " VS. " + g);
			week6M2.setText(b + " VS. " + h);
			week6M3.setText(c + " VS. " + i);
			week6M4.setText(d + " VS. " + j);
			week6M5.setText(e + " VS. " + a);
			week6M6.setText(f + " VS. " + h);

			// Set text for Week 7 matchup
			week7M1.setText(a + " VS. " + i);
			week7M2.setText(b + " VS. " + j);
			week7M3.setText(c + " VS. " + d);
			week7M4.setText(e + " VS. " + b);
			week7M5.setText(f + " VS. " + c);
			week7M6.setText(a + " VS. " + j);

			// Set text for Week 8 matchup
			week8M1.setText(b + " VS. " + i);
			week8M2.setText(c + " VS. " + j);
			week8M3.setText(g + " VS. " + j);
			week8M4.setText(h + " VS. " + i);

		}

	}
}