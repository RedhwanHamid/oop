package oop.main.moneyexchange;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class CustomerFeedbackViewController {

    @FXML
    private TableColumn<?, ?> dateCol;

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> transectionCol;

    @FXML
    private TableColumn<?, ?> userIdCol;

    @FXML
    void backButtonOnClicked(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/oop/main/moneyexchange/agentDashboardview.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("Customer Dashboard");
        window.setScene(scene2);
        window.show();
    }


}
