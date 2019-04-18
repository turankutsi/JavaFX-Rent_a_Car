package SignUP;

import Conn.DBConnection;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class SignUpClass {

    public JFXButton btnSignUp;
    public JFXButton btnLogin;

    private DBConnection dc;

    private Stage stage = new Stage();

    public JFXTextField name = new JFXTextField();
    public JFXTextField surname = new JFXTextField();
    public JFXTextField username = new JFXTextField();
    public JFXTextField mail = new JFXTextField();
    public JFXPasswordField password = new JFXPasswordField();
    //public JFXTextField location = new JFXTextField();

    public RadioButton Male = new RadioButton();
    public RadioButton Female = new RadioButton();
    boolean isSelectedMale = Male.isSelected();
    boolean isSelectedFemale = Female.isSelected();


    private Stage stg = new Stage();

    public void goLogin(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Parent p2 = FXMLLoader.load(getClass().getResource("/Login/Login.fxml"));
        Scene scn2 = new Scene(p2);

        stg.setTitle("Car Rental - Sign UP");
        stg.setScene(scn2);
        stg.show();
    }

    public void register(ActionEvent event) throws SQLException, IOException {

        Connection conn = dc.Connect();

        Random rand = new Random();

        int id = rand.nextInt(100000);

        if(username.getText().isEmpty() ||  password.getText().isEmpty() || mail.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("");
            alert.setHeaderText("Error occurred!");
            alert.setContentText("Please enter all necessary information!");

            alert.showAndWait();
        }
        else {

            if(Male.isSelected() == true && Female.isSelected() == true){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setHeaderText("Please make a single gender selection.");

                alert.showAndWait();
            }

            else if(Male.isSelected() == false && Female.isSelected() == false){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setHeaderText("Please make a gender selection.");

                alert.showAndWait();
            }

            else if(Male.isSelected() == true)
            {
                String sql = "INSERT INTO user_info VALUES('"+id+"','"+name.getText()+"','"+surname.getText()+"'," +
                        "'"+username.getText()+"','"+password.getText()+"','"+Male.getText()+"','"+mail.getText()+"')";
                Statement statement = conn.createStatement();
                statement.executeUpdate(sql);

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Success!");
                alert.setHeaderText("Successful user registration!");

                alert.showAndWait();

                ((Node)(event.getSource())).getScene().getWindow().hide();
                Parent p1 = FXMLLoader.load(getClass().getResource("/Login/Login.fxml"));
                Scene scnUserLogin = new Scene(p1);

                stage.setTitle("User Login");
                stage.setScene(scnUserLogin);
                stage.show();
            }
            else if(Female.isSelected() == true)
            {
                String sql = "INSERT INTO user_info VALUES('"+id+"','"+name.getText()+"','"+surname.getText()+"'," +
                        "'"+username.getText()+"','"+password.getText()+"','"+Female.getText()+"','"+mail.getText()+"')";
                Statement statement = conn.createStatement();
                statement.executeUpdate(sql);

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Success!");
                alert.setHeaderText("Successful user registration!");

                alert.showAndWait();

                ((Node)(event.getSource())).getScene().getWindow().hide();
                Parent p1 = FXMLLoader.load(getClass().getResource("/Login/Login.fxml"));
                Scene scnUserLogin = new Scene(p1);

                stage.setTitle("User Login");
                stage.setScene(scnUserLogin);
                stage.show();
            }


        }


    }

}
