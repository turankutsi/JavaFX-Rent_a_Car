package UserPage.CarPages;

import Conn.DBConnection;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class carPagesClass {

    private DBConnection dc;

    private Stage stage = new Stage();

    public Label lbl320,lbl520,lbl3008,lbl5008,lbla6,lblbentley,lblclio,lblg55,lbllinea,lblpolo,lblrolls,lblxc90;
    public Label llbl320, llbl520, llbl3008, llbl5008, llbla6, llblbentley, llblclio, llblg55, llbllinea, llblpolo, llblrolls, llblxc90;
    public Label lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, lbl11, lbl12;
    public Label fiyatXc90, fiyatRolls, fiyatPolo, fiyatLinea, fiyatG55, fiyatClio, fiyatBentley, fiyatA6,fiyat5008, fiyat3008, fiyat520, fiyat320;
    public Label labelim1, labelim2, labelim3, labelim4, labelim5, labelim6, labelim7, labelim8, labelim9, labelim10, labelim11, labelim12;

    public JFXTextField txtXc90, txt320, txt520, txt3008, txt5008, txtA6, txtBentley, txtClio, txtG55, txtLinea, txtPolo, txtRolls;

    Random rand = new Random();
    int id = rand.nextInt(100000);
    String str = String.valueOf(id);

    Integer fiyat, fiyat2, fiyat3, fiyat4, fiyat5, fiyat6, fiyat7, fiyat8, fiyat9, fiyat10, fiyat11, fiyat12 ;

    @FXML Pane pane1, pane2, pane3, pane4, pane5, pane6, pane7, pane8, pane9, pane10, pane11, pane12;
    @FXML Pane pan1, pan2, pan3, pan4, pan5, pan6, pan7, pan8, pan9, pan10, pan11, pan12;


    public void goBack(ActionEvent event) throws IOException {
        /*((Node) (event.getSource())).getScene().getWindow().hide();
        Parent p1 = FXMLLoader.load(getClass().getResource("/UserPage/ShowCars.fxml"));
        Scene scnSignin = new Scene(p1);

        stage.setTitle("Car Rental - Cars");
        stage.setScene(scnSignin);
        stage.show();*/

        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader3=new FXMLLoader(getClass().getResource("/UserPage/ShowCars.fxml"));
        Parent p2 = loader3.load();
        UserPage.ShowCarsController fifthController = loader3.getController();
        fifthController.setlblUsernameFromCarPages(lbl320.getText());


        stage.setTitle("User Screen");
        Scene scene3 = new Scene(p2);
        stage.setScene(scene3);
        stage.show();

    }
    public void goBack2(ActionEvent event) throws IOException {
        /*((Node) (event.getSource())).getScene().getWindow().hide();
        Parent p1 = FXMLLoader.load(getClass().getResource("/UserPage/ShowCars.fxml"));
        Scene scnSignin = new Scene(p1);

        stage.setTitle("Car Rental - Cars");
        stage.setScene(scnSignin);
        stage.show();*/

        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader3=new FXMLLoader(getClass().getResource("/UserPage/ShowCars.fxml"));
        Parent p2 = loader3.load();
        UserPage.ShowCarsController fifthController = loader3.getController();
        fifthController.setlblUsernameFromCarPages(lbl520.getText());


        stage.setTitle("User Screen");
        Scene scene3 = new Scene(p2);
        stage.setScene(scene3);
        stage.show();

    }
    public void goBack3(ActionEvent event) throws IOException {
        /*((Node) (event.getSource())).getScene().getWindow().hide();
        Parent p1 = FXMLLoader.load(getClass().getResource("/UserPage/ShowCars.fxml"));
        Scene scnSignin = new Scene(p1);

        stage.setTitle("Car Rental - Cars");
        stage.setScene(scnSignin);
        stage.show();*/

        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader3=new FXMLLoader(getClass().getResource("/UserPage/ShowCars.fxml"));
        Parent p2 = loader3.load();
        UserPage.ShowCarsController fifthController = loader3.getController();
        fifthController.setlblUsernameFromCarPages(lbl3008.getText());


        stage.setTitle("User Screen");
        Scene scene3 = new Scene(p2);
        stage.setScene(scene3);
        stage.show();

    }
    public void goBack4(ActionEvent event) throws IOException {
        /*((Node) (event.getSource())).getScene().getWindow().hide();
        Parent p1 = FXMLLoader.load(getClass().getResource("/UserPage/ShowCars.fxml"));
        Scene scnSignin = new Scene(p1);

        stage.setTitle("Car Rental - Cars");
        stage.setScene(scnSignin);
        stage.show();*/

        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader3=new FXMLLoader(getClass().getResource("/UserPage/ShowCars.fxml"));
        Parent p2 = loader3.load();
        UserPage.ShowCarsController fifthController = loader3.getController();
        fifthController.setlblUsernameFromCarPages(lbl5008.getText());


        stage.setTitle("User Screen");
        Scene scene3 = new Scene(p2);
        stage.setScene(scene3);
        stage.show();

    }
    public void goBack5(ActionEvent event) throws IOException {
        /*((Node) (event.getSource())).getScene().getWindow().hide();
        Parent p1 = FXMLLoader.load(getClass().getResource("/UserPage/ShowCars.fxml"));
        Scene scnSignin = new Scene(p1);

        stage.setTitle("Car Rental - Cars");
        stage.setScene(scnSignin);
        stage.show();*/

        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader3=new FXMLLoader(getClass().getResource("/UserPage/ShowCars.fxml"));
        Parent p2 = loader3.load();
        UserPage.ShowCarsController fifthController = loader3.getController();
        fifthController.setlblUsernameFromCarPages(lbla6.getText());


        stage.setTitle("User Screen");
        Scene scene3 = new Scene(p2);
        stage.setScene(scene3);
        stage.show();

    }
    public void goBack6(ActionEvent event) throws IOException {
        /*((Node) (event.getSource())).getScene().getWindow().hide();
        Parent p1 = FXMLLoader.load(getClass().getResource("/UserPage/ShowCars.fxml"));
        Scene scnSignin = new Scene(p1);

        stage.setTitle("Car Rental - Cars");
        stage.setScene(scnSignin);
        stage.show();*/

        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader3=new FXMLLoader(getClass().getResource("/UserPage/ShowCars.fxml"));
        Parent p2 = loader3.load();
        UserPage.ShowCarsController fifthController = loader3.getController();
        fifthController.setlblUsernameFromCarPages(lblbentley.getText());


        stage.setTitle("User Screen");
        Scene scene3 = new Scene(p2);
        stage.setScene(scene3);
        stage.show();

    }
    public void goBack7(ActionEvent event) throws IOException {
        /*((Node) (event.getSource())).getScene().getWindow().hide();
        Parent p1 = FXMLLoader.load(getClass().getResource("/UserPage/ShowCars.fxml"));
        Scene scnSignin = new Scene(p1);

        stage.setTitle("Car Rental - Cars");
        stage.setScene(scnSignin);
        stage.show();*/

        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader3=new FXMLLoader(getClass().getResource("/UserPage/ShowCars.fxml"));
        Parent p2 = loader3.load();
        UserPage.ShowCarsController fifthController = loader3.getController();
        fifthController.setlblUsernameFromCarPages(lblclio.getText());


        stage.setTitle("User Screen");
        Scene scene3 = new Scene(p2);
        stage.setScene(scene3);
        stage.show();

    }
    public void goBack8(ActionEvent event) throws IOException {
        /*((Node) (event.getSource())).getScene().getWindow().hide();
        Parent p1 = FXMLLoader.load(getClass().getResource("/UserPage/ShowCars.fxml"));
        Scene scnSignin = new Scene(p1);

        stage.setTitle("Car Rental - Cars");
        stage.setScene(scnSignin);
        stage.show();*/

        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader3=new FXMLLoader(getClass().getResource("/UserPage/ShowCars.fxml"));
        Parent p2 = loader3.load();
        UserPage.ShowCarsController fifthController = loader3.getController();
        fifthController.setlblUsernameFromCarPages(lblg55.getText());


        stage.setTitle("User Screen");
        Scene scene3 = new Scene(p2);
        stage.setScene(scene3);
        stage.show();

    }
    public void goBack9(ActionEvent event) throws IOException {
        /*((Node) (event.getSource())).getScene().getWindow().hide();
        Parent p1 = FXMLLoader.load(getClass().getResource("/UserPage/ShowCars.fxml"));
        Scene scnSignin = new Scene(p1);

        stage.setTitle("Car Rental - Cars");
        stage.setScene(scnSignin);
        stage.show();*/

        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader3=new FXMLLoader(getClass().getResource("/UserPage/ShowCars.fxml"));
        Parent p2 = loader3.load();
        UserPage.ShowCarsController fifthController = loader3.getController();
        fifthController.setlblUsernameFromCarPages(lbllinea.getText());


        stage.setTitle("User Screen");
        Scene scene3 = new Scene(p2);
        stage.setScene(scene3);
        stage.show();

    }
    public void goBack10(ActionEvent event) throws IOException {
        /*((Node) (event.getSource())).getScene().getWindow().hide();
        Parent p1 = FXMLLoader.load(getClass().getResource("/UserPage/ShowCars.fxml"));
        Scene scnSignin = new Scene(p1);

        stage.setTitle("Car Rental - Cars");
        stage.setScene(scnSignin);
        stage.show();*/

        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader3=new FXMLLoader(getClass().getResource("/UserPage/ShowCars.fxml"));
        Parent p2 = loader3.load();
        UserPage.ShowCarsController fifthController = loader3.getController();
        fifthController.setlblUsernameFromCarPages(lblpolo.getText());


        stage.setTitle("User Screen");
        Scene scene3 = new Scene(p2);
        stage.setScene(scene3);
        stage.show();

    }
    public void goBack11(ActionEvent event) throws IOException {
        /*((Node) (event.getSource())).getScene().getWindow().hide();
        Parent p1 = FXMLLoader.load(getClass().getResource("/UserPage/ShowCars.fxml"));
        Scene scnSignin = new Scene(p1);

        stage.setTitle("Car Rental - Cars");
        stage.setScene(scnSignin);
        stage.show();*/

        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader3=new FXMLLoader(getClass().getResource("/UserPage/ShowCars.fxml"));
        Parent p2 = loader3.load();
        UserPage.ShowCarsController fifthController = loader3.getController();
        fifthController.setlblUsernameFromCarPages(lblrolls.getText());


        stage.setTitle("User Screen");
        Scene scene3 = new Scene(p2);
        stage.setScene(scene3);
        stage.show();

    }
    public void goBack12(ActionEvent event) throws IOException {
        /*((Node) (event.getSource())).getScene().getWindow().hide();
        Parent p1 = FXMLLoader.load(getClass().getResource("/UserPage/ShowCars.fxml"));
        Scene scnSignin = new Scene(p1);

        stage.setTitle("Car Rental - Cars");
        stage.setScene(scnSignin);
        stage.show();*/

        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader3=new FXMLLoader(getClass().getResource("/UserPage/ShowCars.fxml"));
        Parent p2 = loader3.load();
        UserPage.ShowCarsController fifthController = loader3.getController();
        fifthController.setlblUsernameFromCarPages(lblxc90.getText());


        stage.setTitle("User Screen");
        Scene scene3 = new Scene(p2);
        stage.setScene(scene3);
        stage.show();

    }


    public void invoice320(ActionEvent event){
        pane1.setVisible(false);
    }
    public void Rent320(ActionEvent event) throws SQLException {
        llbl320.setText(lbl320.getText());
        lbl1.setText("Invoice No: " + str);

        Connection conn = dc.Connect();

        if(txt320.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("");
            alert.setHeaderText("Error occurred!");
            alert.setContentText("Please enter rent term");

            alert.showAndWait();
        }
        else{

            String sql = "INSERT INTO rented_cars VALUES(7,'BMW', '320', '"+ lbl320.getText() + "' , '"+ txt320.getText() +"')";
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success!");
            alert.setHeaderText("Car is successfully rented.!");

            alert.showAndWait();

            pane1.setVisible(true);

            fiyat = Integer.valueOf(txt320.getText()) * 140;
            fiyat320.setText(String.valueOf(fiyat));
            labelim1.setText(txt320.getText());

        }

    }

    public void invoice520(ActionEvent event){
        pane2.setVisible(false);
    }
    public void Rent520(ActionEvent event) throws SQLException {

        llbl520.setText(lbl520.getText());
        lbl2.setText("Invoice No: " + str);

        Connection conn = dc.Connect();
        if(txt520.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("");
            alert.setHeaderText("Error occurred!");
            alert.setContentText("Please enter rent term");

            alert.showAndWait();
        }
        else {

            String sql = "INSERT INTO rented_cars VALUES(8,'BMW', '520', '" + lbl520.getText() + "' , '" + txt520.getText() + "')";
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success!");
            alert.setHeaderText("Car is successfully rented.!");

            alert.showAndWait();

            pane2.setVisible(true);

            fiyat2 = Integer.valueOf(txt520.getText()) * 150;
            fiyat520.setText(String.valueOf(fiyat2));
            labelim2.setText(txt520.getText());
        }

    }

    public void invoice3008(ActionEvent event){
        pane3.setVisible(false);
    }
    public void Rent3008(ActionEvent event) throws SQLException {

        llbl3008.setText(lbl3008.getText());
        lbl3.setText("Invoice No: " + str);

        Connection conn = dc.Connect();
        if(txt3008.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("");
            alert.setHeaderText("Error occurred!");
            alert.setContentText("Please enter rent term");

            alert.showAndWait();
        }
        else {

            String sql = "INSERT INTO rented_cars VALUES(4,'Peugeot', '3008', '" + lbl3008.getText() + "' , '" + txt3008.getText() + "')";
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success!");
            alert.setHeaderText("Car is successfully rented.!");

            alert.showAndWait();

            pane3.setVisible(true);
            fiyat3 = Integer.valueOf(txt3008.getText()) * 120;
            fiyat3008.setText(String.valueOf(fiyat3));
            labelim3.setText(txt3008.getText());
        }
    }

    public void invoice5008(ActionEvent event){
        pane4.setVisible(false);
    }
    public void Rent5008(ActionEvent event) throws SQLException {

        llbl5008.setText(lbl5008.getText());
        lbl4.setText("Invoice No: " + str);

        Connection conn = dc.Connect();
        if(txt5008.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("");
            alert.setHeaderText("Error occurred!");
            alert.setContentText("Please enter rent term");

            alert.showAndWait();
        }
        else {

            String sql = "INSERT INTO rented_cars VALUES(5,'Peugeot', '5008', '" + lbl5008.getText() + "' , '" + txt5008.getText() + "')";
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success!");
            alert.setHeaderText("Car is successfully rented.!");

            alert.showAndWait();

            pane4.setVisible(true);
            fiyat4 = Integer.valueOf(txt5008.getText()) * 135;
            fiyat5008.setText(String.valueOf(fiyat4));
            labelim4.setText(txt5008.getText());
        }
    }

    public void invoicea6(ActionEvent event){
        pane5.setVisible(false);
    }
    public void Renta6(ActionEvent event) throws SQLException {

        llbla6.setText(lbla6.getText());
        lbl5.setText("Invoice No: " + str);

        Connection conn = dc.Connect();
        if(txtA6.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("");
            alert.setHeaderText("Error occurred!");
            alert.setContentText("Please enter rent term");

            alert.showAndWait();
        }
        else {

            String sql = "INSERT INTO rented_cars VALUES(10,'Audi', 'A6', '" + lbla6.getText() + "' , '" + txtA6.getText() + "')";
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success!");
            alert.setHeaderText("Car is successfully rented.!");

            alert.showAndWait();

            pane5.setVisible(true);
            fiyat5 = Integer.valueOf(txtA6.getText()) * 200;
            fiyatA6.setText(String.valueOf(fiyat5));
            labelim5.setText(txtA6.getText());
        }
    }

    public void invoicebentley(ActionEvent event){
        pane6.setVisible(false);
    }
    public void Rentbentley(ActionEvent event) throws SQLException {

        llblbentley.setText(lblbentley.getText());
        lbl6.setText("Invoice No: " + str);

        Connection conn = dc.Connect();
        if(txtBentley.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("");
            alert.setHeaderText("Error occurred!");
            alert.setContentText("Please enter rent term");

            alert.showAndWait();
        }
        else {

            String sql = "INSERT INTO rented_cars VALUES(12,'Bentley', 'Continental', '" + lblbentley.getText() + "' , '" + txtBentley.getText() + "')";
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success!");
            alert.setHeaderText("Car is successfully rented.!");

            alert.showAndWait();

            pane6.setVisible(true);
            fiyat6 = Integer.valueOf(txtBentley.getText()) * 850;
            fiyatBentley.setText(String.valueOf(fiyat6));
            labelim6.setText(txtBentley.getText());
        }
    }

    public void invoiceclio(ActionEvent event){
        pane7.setVisible(false);
    }
    public void Rentclio(ActionEvent event) throws SQLException {

        llblclio.setText(lblclio.getText());
        lbl7.setText("Invoice No: " + str);

        Connection conn = dc.Connect();
        if(txtClio.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("");
            alert.setHeaderText("Error occurred!");
            alert.setContentText("Please enter rent term");

            alert.showAndWait();
        }
        else {

            String sql = "INSERT INTO rented_cars VALUES(3,'Renault', 'Clio', '" + lblclio.getText() + "' , '" + txtClio.getText() + "')";
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success!");
            alert.setHeaderText("Car is successfully rented.!");

            alert.showAndWait();

            pane7.setVisible(true);
            fiyat7 = Integer.valueOf(txtClio.getText()) * 70;
            fiyatClio.setText(String.valueOf(fiyat7));
            labelim7.setText(txtClio.getText());
        }
    }

    public void invoiceg55(ActionEvent event){
        pane8.setVisible(false);
    }
    public void Rentg55(ActionEvent event) throws SQLException {

        llblg55.setText(lblg55.getText());
        lbl8.setText("Invoice No: " + str);

        Connection conn = dc.Connect();
        if(txtClio.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("");
            alert.setHeaderText("Error occurred!");
            alert.setContentText("Please enter rent term");

            alert.showAndWait();
        }
        else {

            String sql = "INSERT INTO rented_cars VALUES(3,'Renault', 'Clio', '" + lblclio.getText() + "' , '" + txtClio.getText() + "')";
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success!");
            alert.setHeaderText("Car is successfully rented.!");

            alert.showAndWait();

            pane8.setVisible(true);
            fiyat8 = Integer.valueOf(txtG55.getText()) * 350;
            fiyatG55.setText(String.valueOf(fiyat8));
            labelim8.setText(txtG55.getText());
        }
    }

    public void invoicelinea(ActionEvent event){
        pane9.setVisible(false);
    }
    public void Rentlinea(ActionEvent event) throws SQLException {

        llbllinea.setText(lbllinea.getText());
        lbl9.setText("Invoice No: " + str);

        Connection conn = dc.Connect();
        if(txtLinea.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("");
            alert.setHeaderText("Error occurred!");
            alert.setContentText("Please enter rent term");

            alert.showAndWait();
        }
        else {

            String sql = "INSERT INTO rented_cars VALUES(2,'Fiat', 'Linea', '" + lbllinea.getText() + "' , '" + txtLinea.getText() + "')";
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success!");
            alert.setHeaderText("Car is successfully rented.!");

            alert.showAndWait();

            pane9.setVisible(true);
            fiyat9 = Integer.valueOf(txtLinea.getText()) * 80;
            fiyatLinea.setText(String.valueOf(fiyat9));
            labelim9.setText(txtLinea.getText());
        }
    }

    public void invoicepolo(ActionEvent event){
        pane10.setVisible(false);
    }
    public void Rentpolo(ActionEvent event) throws SQLException {

        llblpolo.setText(lblpolo.getText());
        lbl10.setText("Invoice No: " + str);

        Connection conn = dc.Connect();
        if(txtPolo.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("");
            alert.setHeaderText("Error occurred!");
            alert.setContentText("Please enter rent term");

            alert.showAndWait();
        }
        else {

            String sql = "INSERT INTO rented_cars VALUES(1,'Volkswagen', 'Polo', '" + lblpolo.getText() + "' , '" + txtPolo.getText() + "')";
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success!");
            alert.setHeaderText("Car is successfully rented.!");

            alert.showAndWait();

            pane10.setVisible(true);
            fiyat10 = Integer.valueOf(txtPolo.getText()) * 90;
            fiyatPolo.setText(String.valueOf(fiyat10));
            labelim10.setText(txtPolo.getText());
        }
    }

    public void invoicerolls(ActionEvent event){
        pane11.setVisible(false);
    }
    public void Rentrolls(ActionEvent event) throws SQLException {

        llblrolls.setText(lblrolls.getText());
        lbl11.setText("Invoice No: " + str);

        Connection conn = dc.Connect();
        if(txtRolls.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("");
            alert.setHeaderText("Error occurred!");
            alert.setContentText("Please enter rent term");

            alert.showAndWait();
        }
        else {

            String sql = "INSERT INTO rented_cars VALUES(11,'Rolls Royce', 'Dawn', '" + lblrolls.getText() + "' , '" + txtRolls.getText() + "')";
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success!");
            alert.setHeaderText("Car is successfully rented.!");

            alert.showAndWait();

            pane11.setVisible(true);
            fiyat11 = Integer.valueOf(txtRolls.getText()) * 500;
            fiyatRolls.setText(String.valueOf(fiyat11));
            labelim11.setText(txtRolls.getText());
        }
    }

    public void invoicexc90(ActionEvent event){
        pane12.setVisible(false);
    }
    public void Rentxc90(ActionEvent event) throws SQLException {

        llblxc90.setText(lblxc90.getText());
        lbl12.setText("Invoice No: " + str);

        Connection conn = dc.Connect();
        if(txtXc90.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("");
            alert.setHeaderText("Error occurred!");
            alert.setContentText("Please enter rent term");

            alert.showAndWait();
        }
        else {

            String sql = "INSERT INTO rented_cars VALUES(6,'Volvo', 'XC90', '" + lblxc90.getText() + "' , '" + txtXc90.getText() + "')";
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success!");
            alert.setHeaderText("Car is successfully rented.!");

            alert.showAndWait();

            pane12.setVisible(true);
            fiyat12 = Integer.valueOf(txtXc90.getText()) * 180;
            fiyatXc90.setText(String.valueOf(fiyat12));
            labelim12.setText(txtXc90.getText());
        }
    }


    public void setlblUsernameFromShowCars(String text){

        lbl320.setText(text);
    }
    public void setlblUsernameFromShowCars2(String text){

        lbl520.setText(text);
    }
    public void setlblUsernameFromShowCars3(String text){

        lbla6.setText(text);
    }
    public void setlblUsernameFromShowCars4(String text){

        lbl3008.setText(text);
    }
    public void setlblUsernameFromShowCars5(String text){

        lbl5008.setText(text);
    }
    public void setlblUsernameFromShowCars6(String text){

        lblxc90.setText(text);
    }
    public void setlblUsernameFromShowCars7(String text){

        lblg55.setText(text);
    }
    public void setlblUsernameFromShowCars8(String text){

        lblrolls.setText(text);
    }
    public void setlblUsernameFromShowCars9(String text){

        lblbentley.setText(text);
    }
    public void setlblUsernameFromShowCars10(String text){

        lblpolo.setText(text);
    }
    public void setlblUsernameFromShowCars11(String text){

        lblclio.setText(text);
    }
    public void setlblUsernameFromShowCars12(String text){

        lbllinea.setText(text);
    }

    /******************************************************************************************************************/

    public void setlblUsernameFrom320(String text){

        lbl320.setText(text);
    }
    public void setlblUsernameFrom520(String text){

        lbl520.setText(text);
    }
    public void setlblUsernameFrom3008(String text){

        lbl3008.setText(text);
    }
    public void setlblUsernameFrom5008(String text){

        lbl5008.setText(text);
    }
    public void setlblUsernameFromA6(String text){

        lbla6.setText(text);
    }
    public void setlblUsernameFromBentley(String text){

        lblbentley.setText(text);
    }
    public void setlblUsernameFromClio(String text){

        lblclio.setText(text);
    }
    public void setlblUsernameFromg55(String text){

        lblg55.setText(text);
    }
    public void setlblUsernameFromLinea(String text){

        lbllinea.setText(text);
    }
    public void setlblUsernameFromPolo(String text){

        lblpolo.setText(text);
    }
    public void setlblUsernameFromRolls(String text){

        lblrolls.setText(text);
    }
    public void setlblUsernameFromxc90(String text){

        lblxc90.setText(text);
    }

}
