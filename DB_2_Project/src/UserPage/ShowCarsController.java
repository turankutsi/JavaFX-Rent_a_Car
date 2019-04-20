package UserPage;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ShowCarsController implements Initializable {

    /*public TreeTableColumn column_a , column_b , column_c , column_d , column_e , column_f , column_g , column_h;
    @FXML
    private JFXTreeTableView<Car> table;*/

    public TableView<Car> table;
    public TableColumn<?, ?> a,b,c,d,e,f,g,h;
    public ObservableList<UserPage.Car>data;
    public Label lblUserName;

    Conn.DBConnection connectionClass = new Conn.DBConnection();
    Connection connection = connectionClass.Connect();

    private Stage stage = new Stage();

    public void logOut(ActionEvent event) throws IOException, SQLException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader2=new FXMLLoader(getClass().getResource("../Login/Login.fxml"));
        Parent p1 = loader2.load();

        stage.setTitle("User Screen");
        Scene scene2 = new Scene(p1);
        stage.setScene(scene2);
        stage.show();

        connection.close();
    }

    public void peu(ActionEvent event){
        try {
            data = FXCollections.observableArrayList();
            // Execute query
            ResultSet resultSet = connection.createStatement().executeQuery("select * from car where Make = 'Peugeot' ");

            while(resultSet.next())
            {
                //get string from db
                data.add(new UserPage.Car(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        // Set cell value factory to Table view
        // NB.PropertyValue Factory must be same with the one set in model class.
        a.setCellValueFactory(new PropertyValueFactory<>("car_id"));
        b.setCellValueFactory(new PropertyValueFactory<>("make"));
        c.setCellValueFactory(new PropertyValueFactory<>("model"));
        d.setCellValueFactory(new PropertyValueFactory<>("year"));
        e.setCellValueFactory(new PropertyValueFactory<>("rental_fee"));
        f.setCellValueFactory(new PropertyValueFactory<>("fuel"));
        g.setCellValueFactory(new PropertyValueFactory<>("gearbox"));
        h.setCellValueFactory(new PropertyValueFactory<>("_class"));

        table.setItems(null);
        table.setItems(data);
    }
    public void volk(ActionEvent event){
        try {
            data = FXCollections.observableArrayList();
            // Execute query
            ResultSet resultSet = connection.createStatement().executeQuery("select * from car where Make = 'Volkswagen' ");

            while(resultSet.next())
            {
                //get string from db
                data.add(new UserPage.Car(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        // Set cell value factory to Table view
        // NB.PropertyValue Factory must be same with the one set in model class.
        a.setCellValueFactory(new PropertyValueFactory<>("car_id"));
        b.setCellValueFactory(new PropertyValueFactory<>("make"));
        c.setCellValueFactory(new PropertyValueFactory<>("model"));
        d.setCellValueFactory(new PropertyValueFactory<>("year"));
        e.setCellValueFactory(new PropertyValueFactory<>("rental_fee"));
        f.setCellValueFactory(new PropertyValueFactory<>("fuel"));
        g.setCellValueFactory(new PropertyValueFactory<>("gearbox"));
        h.setCellValueFactory(new PropertyValueFactory<>("_class"));

        table.setItems(null);
        table.setItems(data);
    }
    public void ren(ActionEvent event){
        try {
            data = FXCollections.observableArrayList();
            // Execute query
            ResultSet resultSet = connection.createStatement().executeQuery("select * from car where Make = 'Renault' ");

            while(resultSet.next())
            {
                //get string from db
                data.add(new UserPage.Car(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        // Set cell value factory to Table view
        // NB.PropertyValue Factory must be same with the one set in model class.
        a.setCellValueFactory(new PropertyValueFactory<>("car_id"));
        b.setCellValueFactory(new PropertyValueFactory<>("make"));
        c.setCellValueFactory(new PropertyValueFactory<>("model"));
        d.setCellValueFactory(new PropertyValueFactory<>("year"));
        e.setCellValueFactory(new PropertyValueFactory<>("rental_fee"));
        f.setCellValueFactory(new PropertyValueFactory<>("fuel"));
        g.setCellValueFactory(new PropertyValueFactory<>("gearbox"));
        h.setCellValueFactory(new PropertyValueFactory<>("_class"));

        table.setItems(null);
        table.setItems(data);
    }
    public void fia(ActionEvent event){
        try {
            data = FXCollections.observableArrayList();
            // Execute query
            ResultSet resultSet = connection.createStatement().executeQuery("select * from car where Make = 'Fiat' ");

            while(resultSet.next())
            {
                //get string from db
                data.add(new UserPage.Car(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        // Set cell value factory to Table view
        // NB.PropertyValue Factory must be same with the one set in model class.
        a.setCellValueFactory(new PropertyValueFactory<>("car_id"));
        b.setCellValueFactory(new PropertyValueFactory<>("make"));
        c.setCellValueFactory(new PropertyValueFactory<>("model"));
        d.setCellValueFactory(new PropertyValueFactory<>("year"));
        e.setCellValueFactory(new PropertyValueFactory<>("rental_fee"));
        f.setCellValueFactory(new PropertyValueFactory<>("fuel"));
        g.setCellValueFactory(new PropertyValueFactory<>("gearbox"));
        h.setCellValueFactory(new PropertyValueFactory<>("_class"));

        table.setItems(null);
        table.setItems(data);
    }
    public void bmw(ActionEvent event){
        try {
            data = FXCollections.observableArrayList();
            // Execute query
            ResultSet resultSet = connection.createStatement().executeQuery("select * from car where Make = 'BMW' ");

            while(resultSet.next())
            {
                //get string from db
                data.add(new UserPage.Car(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        // Set cell value factory to Table view
        // NB.PropertyValue Factory must be same with the one set in model class.
        a.setCellValueFactory(new PropertyValueFactory<>("car_id"));
        b.setCellValueFactory(new PropertyValueFactory<>("make"));
        c.setCellValueFactory(new PropertyValueFactory<>("model"));
        d.setCellValueFactory(new PropertyValueFactory<>("year"));
        e.setCellValueFactory(new PropertyValueFactory<>("rental_fee"));
        f.setCellValueFactory(new PropertyValueFactory<>("fuel"));
        g.setCellValueFactory(new PropertyValueFactory<>("gearbox"));
        h.setCellValueFactory(new PropertyValueFactory<>("_class"));

        table.setItems(null);
        table.setItems(data);
    }
    public void ben(ActionEvent event){
        try {
            data = FXCollections.observableArrayList();
            // Execute query
            ResultSet resultSet = connection.createStatement().executeQuery("select * from car where Make = 'Bentley' ");

            while(resultSet.next())
            {
                //get string from db
                data.add(new UserPage.Car(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        // Set cell value factory to Table view
        // NB.PropertyValue Factory must be same with the one set in model class.
        a.setCellValueFactory(new PropertyValueFactory<>("car_id"));
        b.setCellValueFactory(new PropertyValueFactory<>("make"));
        c.setCellValueFactory(new PropertyValueFactory<>("model"));
        d.setCellValueFactory(new PropertyValueFactory<>("year"));
        e.setCellValueFactory(new PropertyValueFactory<>("rental_fee"));
        f.setCellValueFactory(new PropertyValueFactory<>("fuel"));
        g.setCellValueFactory(new PropertyValueFactory<>("gearbox"));
        h.setCellValueFactory(new PropertyValueFactory<>("_class"));

        table.setItems(null);
        table.setItems(data);
    }
    public void aui(ActionEvent event){
        try {
            data = FXCollections.observableArrayList();
            // Execute query
            ResultSet resultSet = connection.createStatement().executeQuery("select * from car where Make = 'Audi' ");

            while(resultSet.next())
            {
                //get string from db
                data.add(new UserPage.Car(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        // Set cell value factory to Table view
        // NB.PropertyValue Factory must be same with the one set in model class.
        a.setCellValueFactory(new PropertyValueFactory<>("car_id"));
        b.setCellValueFactory(new PropertyValueFactory<>("make"));
        c.setCellValueFactory(new PropertyValueFactory<>("model"));
        d.setCellValueFactory(new PropertyValueFactory<>("year"));
        e.setCellValueFactory(new PropertyValueFactory<>("rental_fee"));
        f.setCellValueFactory(new PropertyValueFactory<>("fuel"));
        g.setCellValueFactory(new PropertyValueFactory<>("gearbox"));
        h.setCellValueFactory(new PropertyValueFactory<>("_class"));

        table.setItems(null);
        table.setItems(data);
    }
    public void volv(ActionEvent event){
        try {
            data = FXCollections.observableArrayList();
            // Execute query
            ResultSet resultSet = connection.createStatement().executeQuery("select * from car where Make = 'Volvo' ");

            while(resultSet.next())
            {
                //get string from db
                data.add(new UserPage.Car(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        // Set cell value factory to Table view
        // NB.PropertyValue Factory must be same with the one set in model class.
        a.setCellValueFactory(new PropertyValueFactory<>("car_id"));
        b.setCellValueFactory(new PropertyValueFactory<>("make"));
        c.setCellValueFactory(new PropertyValueFactory<>("model"));
        d.setCellValueFactory(new PropertyValueFactory<>("year"));
        e.setCellValueFactory(new PropertyValueFactory<>("rental_fee"));
        f.setCellValueFactory(new PropertyValueFactory<>("fuel"));
        g.setCellValueFactory(new PropertyValueFactory<>("gearbox"));
        h.setCellValueFactory(new PropertyValueFactory<>("_class"));

        table.setItems(null);
        table.setItems(data);
    }
    public void rols(ActionEvent event){
        try {
            data = FXCollections.observableArrayList();
            // Execute query
            ResultSet resultSet = connection.createStatement().executeQuery("select * from car where Make = 'Rolls Royce' ");

            while(resultSet.next())
            {
                //get string from db
                data.add(new UserPage.Car(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        // Set cell value factory to Table view
        // NB.PropertyValue Factory must be same with the one set in model class.
        a.setCellValueFactory(new PropertyValueFactory<>("car_id"));
        b.setCellValueFactory(new PropertyValueFactory<>("make"));
        c.setCellValueFactory(new PropertyValueFactory<>("model"));
        d.setCellValueFactory(new PropertyValueFactory<>("year"));
        e.setCellValueFactory(new PropertyValueFactory<>("rental_fee"));
        f.setCellValueFactory(new PropertyValueFactory<>("fuel"));
        g.setCellValueFactory(new PropertyValueFactory<>("gearbox"));
        h.setCellValueFactory(new PropertyValueFactory<>("_class"));

        table.setItems(null);
        table.setItems(data);
    }
    public void mer(ActionEvent event){
        try {
            data = FXCollections.observableArrayList();
            // Execute query
            ResultSet resultSet = connection.createStatement().executeQuery("select * from car where Make = 'Mercedes' ");

            while(resultSet.next())
            {
                //get string from db
                data.add(new UserPage.Car(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        // Set cell value factory to Table view
        // NB.PropertyValue Factory must be same with the one set in model class.
        a.setCellValueFactory(new PropertyValueFactory<>("car_id"));
        b.setCellValueFactory(new PropertyValueFactory<>("make"));
        c.setCellValueFactory(new PropertyValueFactory<>("model"));
        d.setCellValueFactory(new PropertyValueFactory<>("year"));
        e.setCellValueFactory(new PropertyValueFactory<>("rental_fee"));
        f.setCellValueFactory(new PropertyValueFactory<>("fuel"));
        g.setCellValueFactory(new PropertyValueFactory<>("gearbox"));
        h.setCellValueFactory(new PropertyValueFactory<>("_class"));

        table.setItems(null);
        table.setItems(data);
    }


    public void Push(ActionEvent event){

        try {
            data = FXCollections.observableArrayList();
            // Execute query
            ResultSet resultSet = connection.createStatement().executeQuery("select * from car ");

            while(resultSet.next())
            {
                //get string from db
                data.add(new UserPage.Car(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        // Set cell value factory to Table view
        // NB.PropertyValue Factory must be same with the one set in model class.
        a.setCellValueFactory(new PropertyValueFactory<>("car_id"));
        b.setCellValueFactory(new PropertyValueFactory<>("make"));
        c.setCellValueFactory(new PropertyValueFactory<>("model"));
        d.setCellValueFactory(new PropertyValueFactory<>("year"));
        e.setCellValueFactory(new PropertyValueFactory<>("rental_fee"));
        f.setCellValueFactory(new PropertyValueFactory<>("fuel"));
        g.setCellValueFactory(new PropertyValueFactory<>("gearbox"));
        h.setCellValueFactory(new PropertyValueFactory<>("_class"));

        table.setItems(null);
        table.setItems(data);

    }
    public void showSUV(ActionEvent event){
        try {
            data = FXCollections.observableArrayList();
            // Execute query
            ResultSet resultSet = connection.createStatement().executeQuery("select * from car where class = 'SUV' ");

            while(resultSet.next())
            {
                //get string from db
                data.add(new UserPage.Car(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        // Set cell value factory to Table view
        // NB.PropertyValue Factory must be same with the one set in model class.
        a.setCellValueFactory(new PropertyValueFactory<>("car_id"));
        b.setCellValueFactory(new PropertyValueFactory<>("make"));
        c.setCellValueFactory(new PropertyValueFactory<>("model"));
        d.setCellValueFactory(new PropertyValueFactory<>("year"));
        e.setCellValueFactory(new PropertyValueFactory<>("rental_fee"));
        f.setCellValueFactory(new PropertyValueFactory<>("fuel"));
        g.setCellValueFactory(new PropertyValueFactory<>("gearbox"));
        h.setCellValueFactory(new PropertyValueFactory<>("_class"));

        table.setItems(null);
        table.setItems(data);
    }
    public void showEco(ActionEvent event){
        try {
            data = FXCollections.observableArrayList();
            // Execute query
            ResultSet resultSet = connection.createStatement().executeQuery("select * from car where class = 'Economic' ");

            while(resultSet.next())
            {
                //get string from db
                data.add(new UserPage.Car(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        // Set cell value factory to Table view
        // NB.PropertyValue Factory must be same with the one set in model class.
        a.setCellValueFactory(new PropertyValueFactory<>("car_id"));
        b.setCellValueFactory(new PropertyValueFactory<>("make"));
        c.setCellValueFactory(new PropertyValueFactory<>("model"));
        d.setCellValueFactory(new PropertyValueFactory<>("year"));
        e.setCellValueFactory(new PropertyValueFactory<>("rental_fee"));
        f.setCellValueFactory(new PropertyValueFactory<>("fuel"));
        g.setCellValueFactory(new PropertyValueFactory<>("gearbox"));
        h.setCellValueFactory(new PropertyValueFactory<>("_class"));

        table.setItems(null);
        table.setItems(data);
    }
    public void showPro(ActionEvent event){
        try {
            data = FXCollections.observableArrayList();
            // Execute query
            ResultSet resultSet = connection.createStatement().executeQuery("select * from car where class = 'Pro' ");

            while(resultSet.next())
            {
                //get string from db
                data.add(new UserPage.Car(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        // Set cell value factory to Table view
        // NB.PropertyValue Factory must be same with the one set in model class.
        a.setCellValueFactory(new PropertyValueFactory<>("car_id"));
        b.setCellValueFactory(new PropertyValueFactory<>("make"));
        c.setCellValueFactory(new PropertyValueFactory<>("model"));
        d.setCellValueFactory(new PropertyValueFactory<>("year"));
        e.setCellValueFactory(new PropertyValueFactory<>("rental_fee"));
        f.setCellValueFactory(new PropertyValueFactory<>("fuel"));
        g.setCellValueFactory(new PropertyValueFactory<>("gearbox"));
        h.setCellValueFactory(new PropertyValueFactory<>("_class"));

        table.setItems(null);
        table.setItems(data);
    }
    public void showEx(ActionEvent event){
        try {
            data = FXCollections.observableArrayList();
            // Execute query
            ResultSet resultSet = connection.createStatement().executeQuery("select * from car where class = 'Exclusive' ");

            while(resultSet.next())
            {
                //get string from db
                data.add(new UserPage.Car(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        // Set cell value factory to Table view
        // NB.PropertyValue Factory must be same with the one set in model class.
        a.setCellValueFactory(new PropertyValueFactory<>("car_id"));
        b.setCellValueFactory(new PropertyValueFactory<>("make"));
        c.setCellValueFactory(new PropertyValueFactory<>("model"));
        d.setCellValueFactory(new PropertyValueFactory<>("year"));
        e.setCellValueFactory(new PropertyValueFactory<>("rental_fee"));
        f.setCellValueFactory(new PropertyValueFactory<>("fuel"));
        g.setCellValueFactory(new PropertyValueFactory<>("gearbox"));
        h.setCellValueFactory(new PropertyValueFactory<>("_class"));

        table.setItems(null);
        table.setItems(data);
    }


    public void goLinea(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader2=new FXMLLoader(getClass().getResource("../UserPage/CarPages/linea.fxml"));
        Parent p1 = loader2.load();
        UserPage.CarPages.carPagesClass fourthController = loader2.getController();
        fourthController.setlblUsernameFromShowCars12(lblUserName.getText());


        stage.setTitle("Fiat Linea");
        Scene scene2 = new Scene(p1);
        stage.setScene(scene2);
        stage.show();
    }
    public void goClio(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader2=new FXMLLoader(getClass().getResource("../UserPage/CarPages/clio.fxml"));
        Parent p1 = loader2.load();
        UserPage.CarPages.carPagesClass fourthController = loader2.getController();
        fourthController.setlblUsernameFromShowCars11(lblUserName.getText());


        stage.setTitle("Renault Clio");
        Scene scene2 = new Scene(p1);
        stage.setScene(scene2);
        stage.show();
    }
    public void goVolk(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader2=new FXMLLoader(getClass().getResource("../UserPage/CarPages/polo.fxml"));
        Parent p1 = loader2.load();
        UserPage.CarPages.carPagesClass fourthController = loader2.getController();
        fourthController.setlblUsernameFromShowCars10(lblUserName.getText());


        stage.setTitle("Volkswagen Polo");
        Scene scene2 = new Scene(p1);
        stage.setScene(scene2);
        stage.show();
    }
    public void go320(ActionEvent event) throws IOException {
        /*((Node) (event.getSource())).getScene().getWindow().hide();
        Parent p1 = FXMLLoader.load(getClass().getResource("../UserPage/CarPages/320.fxml"));
        Scene scnSignin = new Scene(p1);

        stage.setTitle("Car Rental - Fiat Linea");
        stage.setScene(scnSignin);
        stage.show();*/

        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader2=new FXMLLoader(getClass().getResource("../UserPage/CarPages/320.fxml"));
        Parent p1 = loader2.load();
        UserPage.CarPages.carPagesClass fourthController = loader2.getController();
        fourthController.setlblUsernameFromShowCars(lblUserName.getText());


        stage.setTitle("BMW 320i");
        Scene scene2 = new Scene(p1);
        stage.setScene(scene2);
        stage.show();

    }
    public void go520(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader2=new FXMLLoader(getClass().getResource("../UserPage/CarPages/520.fxml"));
        Parent p1 = loader2.load();
        UserPage.CarPages.carPagesClass fourthController = loader2.getController();
        fourthController.setlblUsernameFromShowCars2(lblUserName.getText());


        stage.setTitle("BMW 520i");
        Scene scene2 = new Scene(p1);
        stage.setScene(scene2);
        stage.show();
    }
    public void goAudi(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader2=new FXMLLoader(getClass().getResource("/UserPage/CarPages/a6.fxml"));
        Parent p1 = loader2.load();
        UserPage.CarPages.carPagesClass fourthController = loader2.getController();
        fourthController.setlblUsernameFromShowCars3(lblUserName.getText());


        stage.setTitle("Audi A6");
        Scene scene2 = new Scene(p1);
        stage.setScene(scene2);
        stage.show();
    }
    public void go3008(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader2=new FXMLLoader(getClass().getResource("../UserPage/CarPages/3008.fxml"));
        Parent p1 = loader2.load();
        UserPage.CarPages.carPagesClass fourthController = loader2.getController();
        fourthController.setlblUsernameFromShowCars4(lblUserName.getText());


        stage.setTitle("Peugeot 3008");
        Scene scene2 = new Scene(p1);
        stage.setScene(scene2);
        stage.show();
    }
    public void go5008(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader2=new FXMLLoader(getClass().getResource("../UserPage/CarPages/5008.fxml"));
        Parent p1 = loader2.load();
        UserPage.CarPages.carPagesClass fourthController = loader2.getController();
        fourthController.setlblUsernameFromShowCars5(lblUserName.getText());


        stage.setTitle("Peugeot 5008");
        Scene scene2 = new Scene(p1);
        stage.setScene(scene2);
        stage.show();
    }
    public void goVolvo(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader2=new FXMLLoader(getClass().getResource("../UserPage/CarPages/xc90.fxml"));
        Parent p1 = loader2.load();
        UserPage.CarPages.carPagesClass fourthController = loader2.getController();
        fourthController.setlblUsernameFromShowCars6(lblUserName.getText());


        stage.setTitle("Volvo XC90");
        Scene scene2 = new Scene(p1);
        stage.setScene(scene2);
        stage.show();
    }
    public void goG55(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader2=new FXMLLoader(getClass().getResource("../UserPage/CarPages/g55.fxml"));
        Parent p1 = loader2.load();
        UserPage.CarPages.carPagesClass fourthController = loader2.getController();
        fourthController.setlblUsernameFromShowCars7(lblUserName.getText());


        stage.setTitle("Mercedes G55 AMG");
        Scene scene2 = new Scene(p1);
        stage.setScene(scene2);
        stage.show();
    }
    public void goRolls(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader2=new FXMLLoader(getClass().getResource("../UserPage/CarPages/rollsRoyce.fxml"));
        Parent p1 = loader2.load();
        UserPage.CarPages.carPagesClass fourthController = loader2.getController();
        fourthController.setlblUsernameFromShowCars8(lblUserName.getText());


        stage.setTitle("Rolls Royce Dawn");
        Scene scene2 = new Scene(p1);
        stage.setScene(scene2);
        stage.show();
    }
    public void goBent(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader loader2=new FXMLLoader(getClass().getResource("../UserPage/CarPages/bentley.fxml"));
        Parent p1 = loader2.load();
        UserPage.CarPages.carPagesClass fourthController = loader2.getController();
        fourthController.setlblUsernameFromShowCars9(lblUserName.getText());


        stage.setTitle("Bentley Continental");
        Scene scene2 = new Scene(p1);
        stage.setScene(scene2);
        stage.show();
    }





    @Override
    public void initialize(URL location, ResourceBundle resources) {



        /*JFXTreeTableColumn<Car,String> car_id = new JFXTreeTableColumn("car_id");
        car_id.setPrefWidth(100);

        car_id.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Car, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<Car, String> param) {
                return param.getValue().getValue().car_id;
            }
        });

        JFXTreeTableColumn<Car,String> make = new JFXTreeTableColumn("make");
        make.setPrefWidth(100);

        make.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Car, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<Car, String> param) {
                return param.getValue().getValue().make;
            }
        });

        JFXTreeTableColumn<Car,String> model = new JFXTreeTableColumn("model");
        model.setPrefWidth(100);

        model.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Car, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<Car, String> param) {
                return param.getValue().getValue().model;
            }
        });

        JFXTreeTableColumn<Car,String> year = new JFXTreeTableColumn("year");
        year.setPrefWidth(100);

        year.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Car, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<Car, String> param) {
                return param.getValue().getValue().year;
            }
        });

        JFXTreeTableColumn<Car,String> rental_fee = new JFXTreeTableColumn("rental_fee");
        rental_fee.setPrefWidth(100);

        rental_fee.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Car, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<Car, String> param) {
                return param.getValue().getValue().rental_fee;
            }
        });

        JFXTreeTableColumn<Car,String> fuel = new JFXTreeTableColumn("fuel");
        fuel.setPrefWidth(100);

        fuel.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Car, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<Car, String> param) {
                return param.getValue().getValue().fuel;
            }
        });

        JFXTreeTableColumn<Car,String> gearbox = new JFXTreeTableColumn("gearbox");
        gearbox.setPrefWidth(100);

        gearbox.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Car, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<Car, String> param) {
                return param.getValue().getValue().gearbox;
            }
        });

        JFXTreeTableColumn<Car,String> _class = new JFXTreeTableColumn("class");
        _class.setPrefWidth(100);

        _class.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Car, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<Car, String> param) {
                return param.getValue().getValue()._class;
            }
        });
        */





        /*ObservableList<Car> car = FXCollections.observableArrayList();
        car.add(new Car("1" , "BMW" , "320i" , "2000" , "500" , "Diesel" , "Auto" , "Pro"));
        car.add(new Car("2" , "Audi" , "320i" , "2000" , "500" , "Diesel" , "Auto" , "Pro"));
        car.add(new Car("3" , "Serçe" , "320i" , "2000" , "500" , "Diesel" , "Auto" , "Pro"));
        car.add(new Car("4" , "Mercedes" , "320i" , "2000" , "500" , "Diesel" , "Auto" , "Pro"));
        car.add(new Car("5" , "Anadol" , "320i" , "2000" , "500" , "Diesel" , "Auto" , "Pro"));

        final TreeItem<Car> root = new RecursiveTreeItem<Car>(car,RecursiveTreeObject::getChildren);
        table.getColumns().setAll(car_id,make,model,year,rental_fee,fuel,gearbox,_class);
        table.setRoot(root);
        table.setShowRoot(false);*/

    }



    public void setlblUsernameFromLogin(String text){

        lblUserName.setText(text);
    }

    public void setlblUsernameFromCarPages(String text){

        lblUserName.setText(text);

    }

}
