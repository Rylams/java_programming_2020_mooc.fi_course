package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends Application{
    
    @Override
    public void start(Stage window) {
        
        BorderPane vbox1 = new BorderPane();
        vbox1.setTop(new Label("Enter your name and start."));
        TextField nameArea = new TextField();
        vbox1.setCenter(nameArea);
        Button toSecond = new Button("Start");
        vbox1.setBottom(toSecond);
        
        VBox vbox2 = new VBox();
        Label welcomeText = new Label();
        vbox2.getChildren().add(welcomeText);

        Scene first = new Scene(vbox1);
        Scene second = new Scene(vbox2);

        toSecond.setOnAction((event) -> {
            window.setScene(second);
            welcomeText.setText("Welcome " + nameArea.getText() + "!");
        });

        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hellow world! :3");
    }
}
