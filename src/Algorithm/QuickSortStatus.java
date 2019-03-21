/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm;

/**
 *
 * @author ahcl
 */
public class QuickSortStatus {
    private int left, right, pivot, firstPointer, secondPointer, currentValue;
    private int swapType, actionType;

   
    public QuickSortStatus() {
        
    }

    public QuickSortStatus(int left, int right, int pivot, int firstPointer, int secondPointer, int currentValue, int swapType, int actionType) {
        this.left = left;
        this.right = right;
        this.pivot = pivot;
        this.firstPointer = firstPointer;
        this.secondPointer = secondPointer;
        this.currentValue = currentValue;
        this.swapType = swapType;
        this.actionType = actionType;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getPivot() {
        return pivot;
    }

    public void setPivot(int pivot) {
        this.pivot = pivot;
    }

    public int getFirstPointer() {
        return firstPointer;
    }

    public void setFirstPointer(int firstPointer) {
        this.firstPointer = firstPointer;
    }

    public int getSecondPointer() {
        return secondPointer;
    }

    public void setSecondPointer(int secondPointer) {
        this.secondPointer = secondPointer;
    }

    public int getSwapType() {
        return swapType;
    }

    public void setSwapType(int swapType) {
        this.swapType = swapType;
    }
    
    
}
