/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualization;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Screen;

/**
 *
 * @author ahcl
 */
public class ChartLayout {
    private Chart chart;

    public ChartLayout() {
    }

    public ChartLayout(Chart chart) {
        this.chart = chart;
    }
    
    public void execute () {
        List<Bar> barList = chart.getModel().getBarList();
//      
        double WIDTH = Screen.getPrimary().getBounds().getWidth() / barList.size();
        ;
        double WIDTH1 = WIDTH * 80 / 100;
        double MAX_HEIGHT = Screen.getPrimary().getBounds().getHeight() / 2;
        int maxValue = 0;
        for(int i=0;i<barList.size();i++) maxValue = Math.max(maxValue, barList.get(i).getValue());
        double HEIGHT_UNIT = MAX_HEIGHT / maxValue;
        for(int i=0;i<barList.size();i++) {
            Bar bar = barList.get(i);
            int index = bar.getIndex().getValue();
            int value = bar.getValue();
            double x = i * WIDTH;
            double y = 0;
            double height = HEIGHT_UNIT * value;
            barList.get(index).setLayoutX(x);
            barList.get(index).setLayoutY(y);
            bar.getRectangle().setHeight(height);
            bar.getRectangle().setWidth(WIDTH1);
            bar.getText().setText(value + "");
            bar.getText().setFont(Font.font((WIDTH1 < 15) ? 0 : WIDTH1 - 4));
            bar.getRectangle().setFill(Color.rgb(173, 216, 230));
            bar.getRectangle().managedProperty().bind(bar.getRectangle().visibleProperty());
        }
        for(int i=0;i<barList.size();i++) {
            Bar bar = barList.get(i);
            IntegerProperty indexProperty = bar.getIndex();
            bar.layoutXProperty().bind(Bindings.createDoubleBinding(()-> {
                return indexProperty.getValue() * WIDTH;
            }, indexProperty));

        }
    }
    
    public void swapTwoBar(int firstIndex, int secondIndex) {
        
    }
}
