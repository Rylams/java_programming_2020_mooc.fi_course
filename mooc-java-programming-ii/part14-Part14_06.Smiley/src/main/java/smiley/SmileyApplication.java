package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Canvas paintingCanvas = new Canvas(800, 800);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        painter.fillRect(200, 120, 80, 80);
        painter.fillRect(6 * 80 - 40, 120, 80, 80);
        painter.fillRect(120, 5 * 80 - 40, 80, 80);
        painter.fillRect(7 * 80 - 40, 5 * 80 - 40, 80, 80);
        painter.fillRect(400, 6 * 80 - 40, 320, 320);

        BorderPane layout = new BorderPane();
        layout.setCenter(paintingCanvas);

        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}
