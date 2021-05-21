package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application{

    @Override
    public void start(Stage window) {
        //1 create a main layout
        BorderPane layout = new BorderPane();
        
        //1.1 menu for layout
        HBox menu = new HBox();
        menu.setPadding(new Insets(20,20,20,20));
        menu.setSpacing(10);
        
        //1.2 buttons for menu
        Button joke = new Button("Joke");
        Button answer = new Button("Answer");
        Button explain = new Button("Explanation");
        
        //1.3 add buttons to menu
        menu.getChildren().addAll(joke, answer, explain);
        layout.setTop(menu);
        
        //2 subview layout
        StackPane jokeLayout = createView("What do you call a bear with no teeth?");
        StackPane answerLayout = createView("A gummy bear.");
        StackPane explainLayout = createView("Because they have no teeth!");
        
        //2.1 add subviews to buttons
        joke.setOnAction((event) -> layout.setCenter(jokeLayout));
        answer.setOnAction((event) -> layout.setCenter(answerLayout));
        explain.setOnAction((event) -> layout.setCenter(explainLayout));
        
        //3 create main scene with layout
        layout.setCenter(jokeLayout);
        Scene scene = new Scene(layout);
        
        //4 show main scene
        window.setScene(scene);
        window.show();
    }
    
    private StackPane createView(String text) {
        StackPane layout = new StackPane();
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        
        return layout;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
