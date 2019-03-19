/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualization;

import Algorithm.QuickSort;
import Algorithm.QuickSortStatus;
import Algorithm.SwapType;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author ahcl
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws InterruptedException {
        
        Data data = new Data();
        data.randomData(50, 10, 100);
        Model model = new Model(data);
        Chart chart = new Chart(model);
        model.initBars();
        BorderPane root = new BorderPane(chart.getContentPane());
        chart.update();
        ChartLayout layout = new ChartLayout(chart);
        layout.execute();
        Scene scene = new Scene(root, Screen.getPrimary().getBounds().getWidth(), Screen.getPrimary().getBounds().getHeight());
        QuickSort quicksort = new QuickSort(data.getData());
        List<QuickSortStatus> states = quicksort.generateAllStatus();
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        new Thread(new VisualizeTask(states, model, layout)).start();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
