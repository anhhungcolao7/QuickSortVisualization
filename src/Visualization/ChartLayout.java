/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualization;

import java.util.List;
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
        WIDTH = Math.min(50.0, WIDTH);
        double WIDTH1 = WIDTH * 80 / 100;
        for(int i=0;i<barList.size();i++) {
            Bar bar = barList.get(i);
            int index = bar.getIndex();
//            System.out.print(index + " ");
            int value = bar.getValue();
            double x = i * WIDTH;
            double y = 0;
            double width = 4;
            double height = 10 * value;
            barList.get(index).setLayoutX(x);
            barList.get(index).setLayoutY(y);
            bar.getRectangle().setHeight(height);
            bar.getRectangle().setWidth(WIDTH1);
            bar.getText().setText(value + "");
            bar.getText().setFont(Font.font(WIDTH1 - 4));
            bar.getRectangle().setFill(Color.BEIGE);
        }
//        System.out.println("");
    }
    
    public void swapTwoBar(int firstIndex, int secondIndex) {
        
    }
}
