package PseudoCodeDescriptionContainer.Abstraction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mac
 */
public class PseudoCodeContainerAbstraction {
    private CodeDescriptionAbstraction codeDescriptionModel;
    private PseudoCodeAbstraction pseudoCodeModel;

    public CodeDescriptionAbstraction getCodeDescriptionModel() { return codeDescriptionModel; }

    public PseudoCodeAbstraction getPseudoCodeModel() { return pseudoCodeModel; }

    public void setAbstraction(String description, String subTitle) { 
        this.codeDescriptionModel.setDescriptionText(description);
        this.codeDescriptionModel.setsubtitleText(subTitle);
    }

    public PseudoCodeContainerAbstraction() {
        pseudoCodeModel = new PseudoCodeAbstraction();
        codeDescriptionModel = new CodeDescriptionAbstraction();
    }
    
    
    
}
