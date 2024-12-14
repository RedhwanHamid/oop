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

public class AgentDashboardController {

    @FXML
    void backButtonOnClicked(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/oop/main/moneyexchange/mainview.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("Customer Dashboard");
        window.setScene(scene2);
        window.show();
    }

    @FXML
    void exchanceRateButtonOnClicked(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/oop/main/moneyexchange/exchangeview.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("Exchange Rate");
        window.setScene(scene2);
        window.show();
    }

    @FXML
    void profileUpdateButtonOnClicked(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/oop/main/moneyexchange/profileUpdateview.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("Profile Update");
        window.setScene(scene2);
        window.show();
    }

    @FXML
    void transectionButtonOnClicked(ActionEvent event) throws IOException {
            Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/oop/main/moneyexchange/tranview.fxml")));
            Scene scene2 = new Scene(scene2Parent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setTitle("Transection");
            window.setScene(scene2);
            window.show();
        }
    @FXML
    void performanceButtonOnClicked(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/oop/main/moneyexchange/performanceAnalyticsview.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("Performance");
        window.setScene(scene2);
        window.show();
    }
    @FXML
    void CustomerButtonOnClicked(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/oop/main/moneyexchange/customerFeedbackView.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("Customer feedback");
        window.setScene(scene2);
        window.show();
    }
    @FXML
    void KnowledgeButtonOnClicked(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/oop/main/moneyexchange/knowldgeView.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("Knowldge Acess");
        window.setScene(scene2);
        window.show();
    }
    @FXML
    void instransectionButtonOnClicked(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/oop/main/moneyexchange/instancetransactionview.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("instance_transection");
        window.setScene(scene2);
        window.show();
    }

}

