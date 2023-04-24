package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/LoginFXML.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("login");
        
        Image image = new Image("/images/White Orange Modern N Alphabet Tech Business Logo (4).png");
        stage.getIcons().add(image);

        MainController controller = loader.getController();
        controller.setLoginStage(stage);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
