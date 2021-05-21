package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application{

    @Override
    public void start(Stage window) {
        Button button1 = new Button("Button Test");
        TextField textField = new TextField();
        
        FlowPane componentGroup = new FlowPane();
        
        componentGroup.getChildren().add(button1);
        componentGroup.getChildren().add(textField);
        
        Scene view = new Scene(componentGroup);
        
        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}
