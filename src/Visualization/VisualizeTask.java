/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualization;

import Algorithm.QuickSortStatus;
import Algorithm.SwapType;
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
    ChartLayout layout;

    public VisualizeTask() {
    }

    public VisualizeTask(List<QuickSortStatus> states, Model model, ChartLayout layout) {
        this.states = states;
        this.model = model;
        this.layout = layout;
    }
    
    @Override
    public void run() {
        for(QuickSortStatus state:states) {
            int swapType = state.getSwapType();
            if (swapType == SwapType.NORMAL_SWAP || swapType == SwapType.SPECICAL_SWAP) {
                this.model.swap(state.getFirstPointer(), state.getSecondPointer());
                this.layout.execute();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(VisualizeTask.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
