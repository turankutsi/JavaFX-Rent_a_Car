package UserPage.CarPages;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class carPagesClass {

    private Stage stage = new Stage();

    public void goBack(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent p1 = FXMLLoader.load(getClass().getResource("/UserPage/ShowCars.fxml"));
        Scene scnSignin = new Scene(p1);

        stage.setTitle("Car Rental - Cars");
        stage.setScene(scnSignin);
        stage.show();
    }

}
