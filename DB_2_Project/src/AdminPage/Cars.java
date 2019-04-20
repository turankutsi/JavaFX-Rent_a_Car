package AdminPage;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Cars {

    public String getCar_id() {
        return car_id.get();
    }

    public StringProperty car_idProperty() {
        return car_id;
    }

    public void setCar_id(String car_id) {
        this.car_id.set(car_id);
    }

    public String getMake() {
        return make.get();
    }

    public StringProperty makeProperty() {
        return make;
    }

    public void setMake(String make) {
        this.make.set(make);
    }

    public String getModel() {
        return model.get();
    }

    public StringProperty modelProperty() {
        return model;
    }

    public void setModel(String model) {
        this.model.set(model);
    }

    public String getUsername() {
        return username.get();
    }

    public StringProperty usernameProperty() {
        return username;
    }

    public void setUsername(String username) {
        this.username.set(username);
    }

    public String getRent_term() {
        return rent_term.get();
    }

    public StringProperty rent_termProperty() {
        return rent_term;
    }

    public void setRent_term(String rent_term) {
        this.rent_term.set(rent_term);
    }

    private final StringProperty car_id;
    private final StringProperty make;
    private final StringProperty model;
    private final StringProperty username;
    private final StringProperty rent_term;

    public Cars(String car_id, String make, String model, String username, String rent_term) {

        this.car_id = new SimpleStringProperty(car_id);
        this.make = new SimpleStringProperty(make);
        this.model = new SimpleStringProperty(model);
        this.username = new SimpleStringProperty(username);
        this.rent_term = new SimpleStringProperty(rent_term);

    }

}
