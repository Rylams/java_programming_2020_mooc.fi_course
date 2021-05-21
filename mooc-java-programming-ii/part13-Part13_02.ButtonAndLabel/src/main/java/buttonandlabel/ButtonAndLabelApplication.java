package buttonandlabel;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application{
    
    @Override
    public void start(Stage window) {
        Button button1 = new Button("Button Test");
        Label label1 = new Label("Label Test");
        
        FlowPane componentGroup = new FlowPane();
        
        componentGroup.getChildren().add(button1);
        componentGroup.getChildren().add(label1);
        
        Scene view = new Scene(componentGroup);
        
        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        Label label1 = new Label("Hello World!");

        System.out.println("Hello world!");
    }

}
