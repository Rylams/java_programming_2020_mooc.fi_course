package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application{

    @Override
    public void start(Stage window) {
        
        BorderPane bp1 = new BorderPane();
        bp1.setTop(new Label("First View!"));
        Button toSecond = new Button("To the second view!");
        bp1.setCenter(toSecond);
        
        VBox vbox1 = new VBox();
        Button toThird = new Button("To the third view!");
        vbox1.getChildren().addAll(toThird, new Label("Second view!"));
        
        GridPane gp1 = new GridPane();
        gp1.add(new Label("Third view!"), 0, 0);
        Button toFirst = new Button("To the first view!");
        gp1.add(toFirst, 1, 1);

        Scene first = new Scene(bp1);
        Scene second = new Scene(vbox1);
        Scene third = new Scene(gp1);

        toSecond.setOnAction((event) -> {
            window.setScene(second);
        });

        toThird.setOnAction((event) -> {
            window.setScene(third);
        });
        
        toFirst.setOnAction((event) -> {
            window.setScene(first);
        });

        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}
