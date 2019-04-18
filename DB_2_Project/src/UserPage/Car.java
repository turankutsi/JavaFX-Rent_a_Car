package UserPage;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


    public class Car extends RecursiveTreeObject<Car> {
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

        public String getYear() {
            return year.get();
        }

        public StringProperty yearProperty() {
            return year;
        }

        public void setYear(String year) {
            this.year.set(year);
        }

        public String getRental_fee() {
            return rental_fee.get();
        }

        public StringProperty rental_feeProperty() {
            return rental_fee;
        }

        public void setRental_fee(String rental_fee) {
            this.rental_fee.set(rental_fee);
        }

        public String getFuel() {
            return fuel.get();
        }

        public StringProperty fuelProperty() {
            return fuel;
        }

        public void setFuel(String fuel) {
            this.fuel.set(fuel);
        }

        public String getGearbox() {
            return gearbox.get();
        }

        public StringProperty gearboxProperty() {
            return gearbox;
        }

        public void setGearbox(String gearbox) {
            this.gearbox.set(gearbox);
        }

        public String get_class() {
            return _class.get();
        }

        public StringProperty _classProperty() {
            return _class;
        }

        public void set_class(String _class) {
            this._class.set(_class);
        }

        private final StringProperty car_id;
        private final StringProperty make;
        private final StringProperty model;
        private final StringProperty year;
        private final StringProperty rental_fee;
        private final StringProperty fuel;
        private final StringProperty gearbox;
        private final StringProperty _class;

        public Car(String car_id, String make, String model, String year, String rental_fee, String fuel, String gearbox, String _class){

            this.car_id = new SimpleStringProperty(car_id);
            this.make = new SimpleStringProperty(make);
            this.model = new SimpleStringProperty(model);
            this.year = new SimpleStringProperty(year);
            this.rental_fee = new SimpleStringProperty(rental_fee);
            this.fuel = new SimpleStringProperty(fuel);
            this.gearbox = new SimpleStringProperty(gearbox);
            this._class = new SimpleStringProperty(_class);

        }

    }

