package application;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis();

        xAxis.setLabel("Year");
        yAxis.setLabel("Support");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        HashMap<String, ArrayList<Double>> parties = openFile("partiesdata.tsv");

        for (String party : parties.keySet()) {
            XYChart.Series partyData = new XYChart.Series();
            partyData.setName(party);
            ArrayList<Double> years = parties.get(party);
            int a = 1968;
            for (int i = 0; i < years.size(); i++) {
                partyData.getData().add(new XYChart.Data<>(a, years.get(i)));
                a += 4;
            }
            lineChart.getData().add(partyData);
        }

        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
        System.out.println("Hello world!");
    }

    private HashMap<String, ArrayList<Double>> openFile(String fileName) {
        HashMap<String, ArrayList<Double>> parties = new HashMap<>();

        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            String data = scanner.nextLine();
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                String[] splited = line.split("\t");
                ArrayList<Double> years = new ArrayList<>();
                for (int i = 1; i < splited.length; i++) {
                    if (splited[i].equals("-")) {
                        splited[i] = "0.0";
                    }
                    years.add(Double.valueOf(splited[i]));
                }
                String party = splited[0];
                parties.put(party, years);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return parties;
    }
}
