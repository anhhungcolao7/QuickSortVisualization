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
import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import PseudoCodeDescriptionContainer.ViewController.PseudoCodeDescriptionContainerViewController;

/**
 *
 * @author ahcl
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws InterruptedException {
        
        Data data = new Data();
        data.randomData(20, 10, 100);
        Model model = new Model(data);
        Chart chart = new Chart(model);
        model.initBars();
        BorderPane root = new BorderPane();
        root.setTop(chart.getContentPane());
        chart.update();
        ChartLayout layout = new ChartLayout(chart);
        layout.execute();
        Scene scene = new Scene(root, Screen.getPrimary().getBounds().getWidth(), Screen.getPrimary().getBounds().getHeight());
        QuickSort quicksort = new QuickSort(data.getData());
        List<QuickSortStatus> states = quicksort.generateAllStatus();
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        Slider slider = new Slider();
        slider.setMin(50);
        slider.setMax(1000);
        slider.setValue(1000);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setBlockIncrement(100);
        PseudoCodeDescriptionContainerViewController pseudoCodeDescriptionContainer = new PseudoCodeDescriptionContainerViewController();
        root.setRight(pseudoCodeDescriptionContainer);
        VisualizeTask visualizeTask = new VisualizeTask(states, model, pseudoCodeDescriptionContainer, 1000);
        new Thread(visualizeTask).start();
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            visualizeTask.setSpeed(newValue.intValue());
        });
        root.setLeft(slider);



    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
