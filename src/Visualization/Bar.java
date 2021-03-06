/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualization;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 *
 * @author ahcl
 */
public class Bar extends StackPane {
    private Rectangle rectangle;
    private Text text;
    private SimpleIntegerProperty index;
    private int value;

    public Bar() {
    }

    public Bar(SimpleIntegerProperty index, int value) {
        this(new Rectangle(), new Text(value + ""), index, value);
    }
    
    public Bar(Rectangle rectangle, Text text, SimpleIntegerProperty index, int value) {
        super(rectangle, text);
        this.rectangle = rectangle;
        this.text = text;
        this.index = index;
        this.value = value;
    }

    public SimpleIntegerProperty getIndex() {
        return index;
    }

    public void setIndex(SimpleIntegerProperty index) {
        this.index = index;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }
    
    
}
