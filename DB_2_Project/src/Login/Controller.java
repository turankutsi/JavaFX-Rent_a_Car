package Login;

import Conn.DBConnection;
import UserPage.ShowCarsController;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Controller {

    private DBConnection dc;

    public JFXTextField username;
    public JFXPasswordField password;
    public JFXButton  btnLogin;
    public JFXButton btnSignUp;


    private Stage stage = new Stage();

    public void goSignUp(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Parent p2 = FXMLLoader.load(getClass().getResource("/SignUP/SignUP.fxml"));
        Scene scn2 = new Scene(p2);

        stage.setTitle("Car Rental - Sign Up");
        stage.setScene(scn2);
        stage.show();
    }

    public void beAdmin(ActionEvent event) throws IOException {

        Conn.DBConnection connectionClass = new Conn.DBConnection();
        Connection connection = connectionClass.Connect();

        if(username.getText().isEmpty() || password.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("");
            alert.setHeaderText("Empty Fields!");
            alert.setContentText("Please enter all necessary information!");

            alert.showAndWait();
        }

        else if((username.getText().equals("admin")&& password.getText().equals("123")) || (username.getText().equals("turankutsi") && password.getText().equals("kts111213")) ){
            ((Node)(event.getSource())).getScene().getWindow().hide();
            Parent p2 = FXMLLoader.load(getClass().getResource("../AdminPage/AdminPage.fxml"));
            Scene scn2 = new Scene(p2);

            stage.setTitle("Car Rental - Admin Page");
            stage.setScene(scn2);
            stage.show();
        }
        else{

            try {
                Statement statement = connection.createStatement();
                String sql = "SELECT * FROM user_info WHERE username = '" + username.getText() + "' AND password = '" + password.getText() + "'";
                ResultSet resultSet = statement.executeQuery(sql);

                if (resultSet.next())
                {

                    ((Node) (event.getSource())).getScene().getWindow().hide();
                    FXMLLoader loader2=new FXMLLoader(getClass().getResource("../UserPage/ShowCars.fxml"));
                    Parent p1 = loader2.load();
                    UserPage.ShowCarsController fourthController = loader2.getController();
                    fourthController.setlblUsernameFromLogin(username.getText());


                    stage.setTitle("User Screen");
                    Scene scene2 = new Scene(p1);
                    stage.setScene(scene2);
                    stage.show();


                }
                else
                {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("");
                    alert.setHeaderText("Login Failed!");
                    alert.setContentText("Please check your username or password!");

                    alert.showAndWait();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }



}
