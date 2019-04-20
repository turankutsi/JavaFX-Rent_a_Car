package AdminPage;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminPageClass {

    Conn.DBConnection connectionClass = new Conn.DBConnection();
    Connection connection = connectionClass.Connect();

    public ObservableList<User> data;
    public ObservableList<Cars> data2;

    @FXML private Pane pane1,pane11;

    @FXML private Label lblBookTitle;
    @FXML private Label lblBookTitle2;
    @FXML private Label lblBookTitle3;

    @FXML private TableView<User> tblUsers;
    @FXML private TableView<Cars> tblRented;

    @FXML private TableColumn<?, ?> u1,u2,u3,u4,u5,u6,u7;
    @FXML private TableColumn<?, ?> s1,s2,s3,s4,s5;

    public void btnUsers(ActionEvent event){
        pane1.setVisible(true);
        pane11.setVisible(false);

    }
    public void btnCars(ActionEvent event){
        pane11.setVisible(true);
        pane1.setVisible(false);
    }

    public void showUsers(ActionEvent event){

        try {
            data = FXCollections.observableArrayList();
            // Execute query
            ResultSet resultSet = connection.createStatement().executeQuery("select * from user_info ");

            while(resultSet.next())
            {
                //get string from db
                data.add(new AdminPage.User(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        // Set cell value factory to Table view
        // NB.PropertyValue Factory must be same with the one set in model class.
        u1.setCellValueFactory(new PropertyValueFactory<>("user_id"));
        u2.setCellValueFactory(new PropertyValueFactory<>("name"));
        u3.setCellValueFactory(new PropertyValueFactory<>("surname"));
        u4.setCellValueFactory(new PropertyValueFactory<>("username"));
        u5.setCellValueFactory(new PropertyValueFactory<>("password"));
        u6.setCellValueFactory(new PropertyValueFactory<>("gender"));
        u7.setCellValueFactory(new PropertyValueFactory<>("mail"));


        tblUsers.setItems(null);
        tblUsers.setItems(data);
    }

    public void showRented(ActionEvent event){

        try {
            data2 = FXCollections.observableArrayList();
            // Execute query
            ResultSet resultSet = connection.createStatement().executeQuery("select * from rented_cars ");

            while(resultSet.next())
            {
                //get string from db
                data2.add(new AdminPage.Cars(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        // Set cell value factory to Table view
        // NB.PropertyValue Factory must be same with the one set in model class.
        s1.setCellValueFactory(new PropertyValueFactory<>("car_id"));
        s2.setCellValueFactory(new PropertyValueFactory<>("make"));
        s3.setCellValueFactory(new PropertyValueFactory<>("model"));
        s4.setCellValueFactory(new PropertyValueFactory<>("username"));
        s5.setCellValueFactory(new PropertyValueFactory<>("rent_term"));



        tblRented.setItems(null);
        tblRented.setItems(data2);
    }

    public void displaySelected(MouseEvent event) {
        lblBookTitle.setVisible(false);

        User getRow = tblUsers.getSelectionModel().getSelectedItem();
        String userId = getRow.getUser_id();
        lblBookTitle.setText(userId);
    }
    public void displaySelected2(MouseEvent event){
        lblBookTitle2.setVisible(false);
        lblBookTitle3.setVisible(false);

        Cars getRow = tblRented.getSelectionModel().getSelectedItem();
        User getRow2 = (User) tblRented.getSelectionModel().getSelectedCells();

        String username = getRow2.getUsername();
        String carId = getRow.getCar_id();
        lblBookTitle2.setText(carId);
        lblBookTitle3.setText(username);
    }

    public void deleteUser(ActionEvent event) throws SQLException {

        String sql = "DELETE FROM user_info WHERE id='"+lblBookTitle.getText()+"'";
        Statement statement = connection.createStatement();
        statement.execute(sql);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("");
        alert.setHeaderText("You have successfully deleted a user!");

        alert.showAndWait();

    }

    public void returnCar(ActionEvent event) throws SQLException {
        String sql = "DELETE FROM rented_cars WHERE car_id='"+lblBookTitle2.getText()+"' AND username = '"+lblBookTitle3.getText()+"' ";
        Statement statement = connection.createStatement();
        statement.execute(sql);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("");
        alert.setHeaderText("Car return record received.");

        alert.showAndWait();
    }

}
