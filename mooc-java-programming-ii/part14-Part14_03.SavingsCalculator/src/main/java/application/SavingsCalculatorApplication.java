package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage stage) throws Exception {
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();

        BorderPane layout = new BorderPane();
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        layout.setCenter(lineChart);

        VBox slidersContainer = new VBox();

        BorderPane savingsContainer = new BorderPane();
        Label savingsLabel = new Label("Monthly savings");
        Label savingsSliderLabel = new Label("25.0");
        savingsContainer.setLeft(savingsLabel);

        Slider savingsSlider = new Slider();
        savingsSlider.setMin(25);
        savingsSlider.setMax(250);
        savingsSlider.setShowTickLabels(true);
        savingsSlider.setShowTickMarks(true);
        savingsSlider.setBlockIncrement(25);
        savingsSlider.setSnapToTicks(true);

        savingsContainer.setCenter(savingsSlider);
        savingsContainer.setRight(savingsSliderLabel);
        slidersContainer.getChildren().add(savingsContainer);

        XYChart.Series saveValue = new XYChart.Series();
        saveValue.setName("Saving");

        lineChart.getData().add(saveValue);
        //adding listener for savingsSlider
        savingsSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                savingsSliderLabel.setText("" + newValue.doubleValue());
                saveValue.getData().clear();
                for (int i = 0; i < 31; i++) {
                    saveValue.getData().add(new XYChart.Data<>(i, (newValue.doubleValue() * 12) * i));
                }
            }
        }
        );
        for (int i = 0; i < 31; i++) {
            saveValue.getData().add(new XYChart.Data<>(i, (Double.valueOf(savingsSliderLabel.getText()) * 12) * i));
        }

        BorderPane interestContainer = new BorderPane();
        Label interestLabel = new Label("Yearly interest rate");
        Label interestSliderLabel = new Label("0.0");

        Slider interestSlider = new Slider(0, 10, 0);
        interestSlider.setMinorTickCount(10);
        interestSlider.setShowTickMarks(true);
        interestSlider.setShowTickLabels(true);
        
        interestContainer.setLeft(interestLabel);
        interestContainer.setCenter(interestSlider);
        interestContainer.setRight(interestSliderLabel);
        slidersContainer.getChildren().add(interestContainer);

        XYChart.Series interestValue = new XYChart.Series();
        interestValue.setName("Interest");

        lineChart.getData().add(interestValue);

        interestSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                interestSliderLabel.setText("" + newValue.doubleValue());
                interestValue.getData().clear();
                double balance = 0.0;
                for (int i = 0; i < 31; i++) {
                    interestValue.getData().add(new XYChart.Data<>(i, balance));
                    balance = (balance + (Double.valueOf(savingsSliderLabel.getText()) * 12.0)) * (1.0 + newValue.doubleValue() / 100.0);
                }
            }
        });

        layout.setTop(slidersContainer);

        Scene view = new Scene(layout, 320, 300);
        stage.setScene(view);
        stage.show();
    }

}
