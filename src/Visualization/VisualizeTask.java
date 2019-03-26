/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualization;

import Algorithm.QuickSortStatus;
import Algorithm.SwapType;
import PseudoCodeDescriptionContainer.ViewController.PseudoCodeDescriptionContainerViewController;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahcl
 */
public class VisualizeTask implements Runnable{
    List<QuickSortStatus> states;
    Model model;
    PseudoCodeDescriptionContainerViewController pseudoCodeDescriptionContainer;
    int speed;
    public VisualizeTask() {
    }



    public VisualizeTask(List<QuickSortStatus> states, Model model, PseudoCodeDescriptionContainerViewController pseudoCodeDescriptionContainer, int speed) {
        this.states = states;
        this.model = model;
        this.pseudoCodeDescriptionContainer = pseudoCodeDescriptionContainer;
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    @Override
    public void run() {
        int line = 0;
        for(QuickSortStatus state:states) {
            line ++;
            int swapType = state.getSwapType();
            if (swapType == SwapType.NORMAL_SWAP || swapType == SwapType.SPECICAL_SWAP) {
                this.model.swap(state.getFirstPointer(), state.getSecondPointer());
                this.pseudoCodeDescriptionContainer.settModel("compare x and y", "compare x and y", line % 6);
//                this.layout.execute();
                try {
                    Thread.sleep(this.speed);
                } catch (InterruptedException ex) {
                    Logger.getLogger(VisualizeTask.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
