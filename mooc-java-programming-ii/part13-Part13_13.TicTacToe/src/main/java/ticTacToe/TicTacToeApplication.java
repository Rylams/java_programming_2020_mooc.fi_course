package ticTacToe;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    private String turn = "X";
    private ArrayList<Button> btns = new ArrayList<>();

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        GridPane gamepad = new GridPane();

        Label turnLabel = new Label("Turn: " + turn);
        turnLabel.setFont(Font.font("Monospaced", 40));
        layout.setTop(turnLabel);
        layout.setCenter(gamepad);

        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                Button button = new Button("");
                button.setFont(Font.font("Monospaced", 20));
                button.setMinSize(50, 50);
                button.setMaxSize(50, 50);

                button.setOnMouseClicked((event) -> {
                    if (button.getText().equals(turn)) {
                        return;
                    } else if (button.getText().isEmpty()) {
                        button.setText(turn);
                        if (checkIfWinner()) {
                            turnLabel.setText("Winner: " + turn);
                        } else if (allButtonsUsed()) {
                            turnLabel.setText("The end!");
                        } else {
                            changeTurn();
                            turnLabel.setText("Turn: " + turn);
                        }
                    }
                });

                gamepad.add(button, a, b);
                btns.add(button);
            }
        }
        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();
    }

    public void changeTurn() {
        if (turn.equals("X")) {
            turn = "O";
        } else {
            turn = "X";
        }
    }

    public boolean allButtonsUsed() {
        for (Button i : btns) {
            if (i.getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public boolean checkIfWinner() {
        return checkHorizontal() || checkVertical() || checkDiagonal();
    }

    public boolean checkHorizontal() {
        String horizontal1 = btns.get(0).getText() + btns.get(1).getText() + btns.get(2).getText();
        String horizontal2 = btns.get(3).getText() + btns.get(4).getText() + btns.get(5).getText();
        String horizontal3 = btns.get(6).getText() + btns.get(7).getText() + btns.get(8).getText();
        return lineSequence(horizontal1) || lineSequence(horizontal2) || lineSequence(horizontal3);
    }

    public boolean checkVertical() {
        String vertical1 = btns.get(0).getText() + btns.get(3).getText() + btns.get(6).getText();
        String vertical2 = btns.get(1).getText() + btns.get(4).getText() + btns.get(7).getText();
        String vertical3 = btns.get(2).getText() + btns.get(5).getText() + btns.get(8).getText();
        return lineSequence(vertical1) || lineSequence(vertical2) || lineSequence(vertical3);
    }

    public boolean checkDiagonal() {
        String diag1 = btns.get(0).getText() + btns.get(4).getText() + btns.get(8).getText();
        String diag2 = btns.get(6).getText() + btns.get(4).getText() + btns.get(2).getText();
        return lineSequence(diag1) || lineSequence(diag2);
    }

    public static boolean lineSequence(String line) {
        return line.contains("AAA") || line.contains("OOO");
    }

}
