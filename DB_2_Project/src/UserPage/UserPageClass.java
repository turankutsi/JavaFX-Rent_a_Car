package UserPage;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class UserPageClass {

    private Stage stage = new Stage();

    public void ShowCars(ActionEvent event) throws IOException {

        ((Node)(event.getSource())).getScene().getWindow().hide();
        Parent p2 = FXMLLoader.load(getClass().getResource("/UserPage/ShowCars.fxml"));
        Scene scn2 = new Scene(p2);

        stage.setTitle("Car Rental - Cars");
        stage.setScene(scn2);
        stage.show();

    }

}
