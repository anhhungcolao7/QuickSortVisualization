/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;
import PseudoCodeDescriptionContainer.ViewController.PseudoCodeDescriptionContainerViewController;

import static Constant.Constant.TIME_DELAY;

/**
 *
 * @author mac
 */
public class JavaFXDemo extends Application {

    private StackPane root;
    private PseudoCodeDescriptionContainerViewController pseudoCodeDescriptionContainer;

    @Override
    public void start(Stage primaryStage) {
        initView();
        initBtn();
        
        Scene scene = new Scene(root, Screen.getPrimary().getBounds().getWidth(), Screen.getPrimary().getBounds().getHeight());
        primaryStage.setTitle("Algorithm Visulaztion");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void initView(){
        // contructor to container
        pseudoCodeDescriptionContainer = new PseudoCodeDescriptionContainerViewController();
        
        // root(Stack Pane) handling 
        root = new StackPane();
        root.getChildren().add(pseudoCodeDescriptionContainer);
    }
    
    public void initBtn(){
        Button btn = new Button("111");
        root.getChildren().add(btn);
        btn.addEventHandler(MouseEvent.MOUSE_CLICKED, createSolButtonHandler());
    }
    
     public EventHandler<Event> createSolButtonHandler() {
        EventHandler<Event> btnSolHandler = new EventHandler<Event>() {
  
            @Override
            public void handle(Event event) {
                System.out.println("Pressed!");

                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(TIME_DELAY), new EventHandler<ActionEvent>() {

                    private int i = 0;

                    @Override
                    public void handle(ActionEvent event) {
                        // set new value for pseudoCode
                        pseudoCodeDescriptionContainer.settModel(String.valueOf(i), String.valueOf(i*999999), i % 5);
          
                        i++;
                    }
                }));
                timeline.setCycleCount(10);
                timeline.play();
                

            }

        };
        return btnSolHandler;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        launch(args);
    }

}
