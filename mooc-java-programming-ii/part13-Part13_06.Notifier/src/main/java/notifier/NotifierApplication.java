package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application{
    
    @Override
    public void start(Stage window) {
        TextField text1 = new TextField();
        Label label = new Label();
        Button updateButton = new Button("Update");
        
        updateButton.setOnAction((event) -> {
            label.setText(text1.getText());
        });
        
        VBox vbox = new VBox();
        vbox.getChildren().addAll(text1, updateButton, label);
        
        Scene view = new Scene(vbox);
        
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}
