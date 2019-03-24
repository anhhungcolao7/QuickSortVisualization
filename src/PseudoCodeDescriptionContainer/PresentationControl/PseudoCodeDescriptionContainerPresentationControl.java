package PseudoCodeDescriptionContainer.PresentationControl;

import javafx.scene.layout.VBox;
import PseudoCodeDescriptionContainer.Abstraction.*;
import PseudoCodeDescriptionContainer.PresentationControl.CodeDescriptionPresentationControl;
import PseudoCodeDescriptionContainer.PresentationControl.PseudoCodePresentationControl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mac
 */
public class PseudoCodeDescriptionContainerPresentationControl extends VBox {

    private PseudoCodeContainerAbstraction pseudoCodeContainerAbstraction;
    
    private CodeDescriptionPresentationControl codeDescriptionViewController;
    private PseudoCodePresentationControl pseudoCodeViewController;
    
    // set model
    public void settModel(String description, String subTitle, int selectedId){
//        codeDescriptionModel.setDescriptionText(description);
//        codeDescriptionModel.setsubtitleText(subTitle);
        pseudoCodeContainerAbstraction.setAbstraction(description, subTitle);
        
        pseudoCodeViewController.setHightlight(selectedId);
    }
 
    public PseudoCodeDescriptionContainerPresentationControl() {
        // define model
        pseudoCodeContainerAbstraction = new PseudoCodeContainerAbstraction();
//        pseudoCodeModel = new PseudoCodeAbstraction();
//        codeDescriptionModel = new CodeDescriptionAbstraction();

        // define viewController 
        codeDescriptionViewController = new CodeDescriptionPresentationControl(this.pseudoCodeContainerAbstraction.getCodeDescriptionModel());
        pseudoCodeViewController = new PseudoCodePresentationControl(this.pseudoCodeContainerAbstraction.getPseudoCodeModel());
        
        getChildren().add(codeDescriptionViewController);
        getChildren().add(pseudoCodeViewController);

        
    }

   

}
