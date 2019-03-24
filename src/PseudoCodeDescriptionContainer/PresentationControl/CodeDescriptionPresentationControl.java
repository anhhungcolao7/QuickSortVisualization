/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PseudoCodeDescriptionContainer.PresentationControl;

import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import PseudoCodeDescriptionContainer.Abstraction.CodeDescriptionAbstraction;

import static Constant.Constant.*;

/**
 *
 * @author mac
 */
public class CodeDescriptionPresentationControl extends VBox {

    private CodeDescriptionAbstraction codeDescriptionModel;
    private Label descriptionText;
    private Label subtitleText;

    public CodeDescriptionAbstraction getCodeDescriptionModel() {
        return codeDescriptionModel;
    }

    public void setCodeDescriptionModel(CodeDescriptionAbstraction codeDescriptionModel) {
        this.codeDescriptionModel = codeDescriptionModel;
    }

    public CodeDescriptionPresentationControl(CodeDescriptionAbstraction codeDescriptionModel) {
        this.codeDescriptionModel = codeDescriptionModel;
        init();
    }

    private void init() {
        // create pane of description and subtitle of pane
        Pane descriptionPane = new Pane();
        
        descriptionText = new Label();
        setupLabelInContainer(descriptionText);
        descriptionText.textProperty().bind(this.codeDescriptionModel.descriptionTextProperty());
        descriptionPane.getChildren().add(descriptionText);

        Pane subtitlePane = new Pane();
        subtitleText = new Label();   
        setupLabelInContainer(subtitleText);
        subtitleText.textProperty().bind(this.codeDescriptionModel.subtitleTextProperty());
        subtitlePane.getChildren().add(subtitleText);

        // implenments & add pane into list
        ObservableList list = this.getChildren();
        list.addAll(descriptionPane, subtitlePane);

        this.setBackground(new Background(new BackgroundFill(Color.web(COLOR_DESCRIPTION_VIEW_BACKGROUND), CornerRadii.EMPTY, Insets.EMPTY)));

    }

    protected void setupLabelInContainer(Label label) {
        
        label.setTextFill(Color.valueOf(COLOR_DESCRIPTION_TEXT_PSEUDOCODE_CONTAINER));
       // label.setFont(new Font(FONT_PSEUDOCODE_CONTAINER_TEXT, SIZE_PSEUDOCODE_CONTAINER_TEXT));
//       label.setMinWidth(Region.USE_PREF_SIZE);
    }

}
