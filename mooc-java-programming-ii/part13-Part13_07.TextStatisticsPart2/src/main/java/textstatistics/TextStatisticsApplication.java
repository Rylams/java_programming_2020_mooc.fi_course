package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        HBox hbox = new HBox();
        
        TextArea textArea = new TextArea("");
        layout.setCenter(textArea);
        
        hbox.setSpacing(15);
        Label lettersLabel = new Label();
        Label wordsLabel = new Label();
        Label longestLabel = new Label();
        hbox.getChildren().addAll(lettersLabel, wordsLabel, longestLabel);

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            
            lettersLabel.setText("Letters: " + characters);
            wordsLabel.setText("Words: " + words);
            longestLabel.setText("The longest word is: " + longest);
        });
        
        layout.setBottom(hbox);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}
