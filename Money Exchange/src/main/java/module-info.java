module oop.main.moneyexchange {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop.main.moneyexchange to javafx.fxml;
    exports oop.main.moneyexchange;
}