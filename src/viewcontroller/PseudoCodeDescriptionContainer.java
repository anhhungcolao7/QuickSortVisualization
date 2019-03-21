package viewcontroller;

import javafx.scene.layout.VBox;
import model.CodeDescriptionModel;
import model.PseudoCodeModel;
import viewcontroller.CodeDescriptionViewController;
import viewcontroller.PseudoCodeViewController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mac
 */
public class PseudoCodeDescriptionContainer extends VBox {

    private CodeDescriptionModel codeDescriptionModel;
    private PseudoCodeModel pseudoCodeModel;
    
    private CodeDescriptionViewController codeDescriptionViewController;
    private PseudoCodeViewController pseudoCodeViewController;
    
    // set model
    public void settModel(String description, String subTitle, int selectedId){
        codeDescriptionModel.setDescriptionText(description);
        codeDescriptionModel.setsubtitleText(subTitle);
        
        pseudoCodeViewController.setHightlight(selectedId);
    }
 
    public PseudoCodeDescriptionContainer() {
        // define model
        pseudoCodeModel = new PseudoCodeModel();
        codeDescriptionModel = new CodeDescriptionModel();

        // define viewController 
        codeDescriptionViewController = new CodeDescriptionViewController(this.codeDescriptionModel);
        pseudoCodeViewController = new PseudoCodeViewController(this.pseudoCodeModel);
        
        getChildren().add(codeDescriptionViewController);
        getChildren().add(pseudoCodeViewController);

        
    }

   

}
