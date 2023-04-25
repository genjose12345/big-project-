package dashBoard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class statsController {

    @FXML
    private Label rank1;

    @FXML
    private Label rank2;

    @FXML
    private Label rank3;

    @FXML
    private Label rank4;

    @FXML
    private Label rank5;

    @FXML
    private Label rank6;

    @FXML
    private Label rank7;

    @FXML
    private Label rank8;

    @FXML
    private Label rank9;

    @FXML
    private Label rank10;

    @FXML
    public void initialize() {

        try (BufferedReader br = new BufferedReader(new FileReader("src/RandomPointData.csv"))) {
            List<String[]> validLines = new ArrayList<>();

            // Read and validate the lines
            String line;
            int rank = 1;
            while ((line = br.readLine()) != null && rank <= 10) {
                if (line.startsWith("null")) {
                    // Skip this line
                    continue;
                }
                String[] fields = line.split(",");
                // Check if any field is empty or null
                boolean allFieldsPresent = true;
                for (String field : fields) {
                    if (field == null || field.trim().isEmpty()) {
                        allFieldsPresent = false;
                        break;
                    }
                }
                if (allFieldsPresent) {
                    validLines.add(fields);
                }
                rank++;
            }

            // Sort the valid lines based on the generated point
            Collections.sort(validLines, new Comparator<String[]>() {
                public int compare(String[] a, String[] b) {
                    return Integer.parseInt(b[1].trim()) - Integer.parseInt(a[1].trim());
                }
            });

            // Set the label text based on the sorted lines
            if (validLines.size() >= 1) {
                rank1.setText("1#  " + validLines.get(0)[0] + " - " + validLines.get(0)[1]);
            }
            if (validLines.size() >= 2) {
                rank2.setText(("2#  ") + validLines.get(1)[0] + " - " + validLines.get(1)[1]);
            }
            if (validLines.size() >= 3) {
                rank3.setText(("3#  ") + validLines.get(2)[0] + " - " + validLines.get(2)[1]);
            }
            if (validLines.size() >= 4) {
                rank4.setText(("4#  ") + validLines.get(3)[0] + " - " + validLines.get(3)[1]);
            }
            if (validLines.size() >= 5) {
                rank5.setText(("5#  ") + validLines.get(4)[0] + " - " + validLines.get(4)[1]);
            }
            if (validLines.size() >= 6) {
                rank6.setText(("6#  ") + validLines.get(5)[0] + " - " + validLines.get(5)[1]);
            }
            if (validLines.size() >= 7) {
                rank7.setText(("7#  ") + validLines.get(6)[0] + " - " + validLines.get(6)[1]);
            }
            if (validLines.size() >= 8) {
                rank8.setText(("8#  ") + validLines.get(7)[0] + " - " + validLines.get(7)[1]);
            }
            if (validLines.size() >= 9) {
                rank9.setText(("9#  ") + validLines.get(8)[0] + " - " + validLines.get(8)[1]);
            }
            if (validLines.size() >= 10) {
                rank10.setText(("10#  ") + validLines.get(9)[0] + " - " + validLines.get(9)[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
