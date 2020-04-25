package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class Main extends Application
    implements EventHandler<ActionEvent>
    {
    Button btnAdd;
    Button btnSubtract;
    Label lbl;
    int iCounter;

    @Override
    public void start(Stage primaryStage) throws Exception{
        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(this);

        btnSubtract =  new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(this);

        lbl = new Label();
        lbl.setText(Integer.toString(iCounter));

        HBox pane = new HBox(10);
        pane.getChildren().addAll(lbl, btnAdd, btnSubtract);


        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(pane, 200, 75));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

        @Override
        public void handle(ActionEvent actionEvent) {
            if (actionEvent.getSource() == btnAdd) {
                iCounter++;
            }
            else {
                if (actionEvent.getSource() == btnSubtract) {
                    iCounter--;
                }
            }
            lbl.setText(Integer.toString(iCounter));
        }
    }
