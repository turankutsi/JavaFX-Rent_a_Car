package Login;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    private Stage stg = new Stage();
    public void goAdminLogin(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Parent p2 = FXMLLoader.load(getClass().getResource("adminLogin.fxml"));
        Scene scn2 = new Scene(p2);

        stg.setTitle("Admin Login Page");
        stg.setScene(scn2);
        stg.show();
    }

    public void goUserLogin(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Parent p2 = FXMLLoader.load(getClass().getResource("userLogin.fxml"));
        Scene scn2 = new Scene(p2);

        stg.setTitle("User Login Page");
        stg.setScene(scn2);
        stg.show();
    }

    public void goRegister(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Parent p2 = FXMLLoader.load(getClass().getResource("register.fxml"));
        Scene scn2 = new Scene(p2);

        stg.setTitle("Register Page");
        stg.setScene(scn2);
        stg.show();
    }

    public void backLogin(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Parent p2 = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scn2 = new Scene(p2);

        stg.setTitle("Login Page");
        stg.setScene(scn2);
        stg.show();
    }

    public void backUserLogin(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent p2 = FXMLLoader.load(getClass().getResource("userLogin.fxml"));
        Scene scn2 = new Scene(p2);

        stg.setTitle("User Login Page");
        stg.setScene(scn2);
        stg.show();
    }

    public void goAdminPage(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent p2 = FXMLLoader.load(getClass().getResource("/Admin/adminPage.fxml"));
        Scene scn2 = new Scene(p2);

        stg.setTitle("ADMIN Page");
        stg.setScene(scn2);
        stg.show();
    }

}
