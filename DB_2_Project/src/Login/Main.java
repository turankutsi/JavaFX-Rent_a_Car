package Login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/Login/Login.fxml"));
        primaryStage.setTitle("Car Rental - Login");
        primaryStage.setScene(new Scene(root, 450, 425));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
