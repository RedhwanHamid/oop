package oop.main.moneyexchange;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class PerformanceAnalyticsviewController {

    @FXML
    void AveragkButtonOnClicked(ActionEvent event) {

    }

    @FXML
    void AvetagetransactionbackButtonOnClicked(ActionEvent event) {

    }

    @FXML
    void BesttransactionButtonOnClicked(ActionEvent event) {

    }

    @FXML
    void backButtonOnClicked(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/oop/main/moneyexchange/agentDashboardview.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("Customer Dashboard");
        window.setScene(scene2);
        window.show();
    }


    @FXML
    void searchButtonOnClicked(ActionEvent event) {

    }

    @FXML
    void textFieldOnaction(ActionEvent event) {

    }

}
