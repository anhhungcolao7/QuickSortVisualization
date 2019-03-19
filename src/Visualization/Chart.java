/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualization;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.layout.Pane;

/**
 *
 * @author ahcl
 */
public class Chart {
    private Pane contentPane;
    private Model model;
    public Chart(Model model) {
        this.contentPane = new Pane();
        this.model = model;
        this.contentPane.setFocusTraversable(true);
    }
    
    public void update() {
        List<Bar> barList = this.model.getBarList();
        this.getContentPane().getChildren().addAll(barList);
    }

    
    
    public Pane getContentPane() {
        return this.contentPane;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
    
    
  
}
