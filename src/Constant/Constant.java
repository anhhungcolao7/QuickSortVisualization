package Constant;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mac
 */
public class Constant {
    public static final int SIZE_PSEUDOCODE_CONTAINER_TEXT = 20;
    public static final String COLOR_DESCRIPTION_TEXT_PSEUDOCODE_CONTAINER = "F0E6EF";
    public static final String COLOR_PSEUDOCODE_TEXT_PSEUDOCODE_CONTAINER = "000000";
    public static final String COLOR_SELECTED_PSEUDOCODE_TEXT_PSEUDOCODE_CONTAINER = "ffffff";
    public static final String COLOR_SELECTED_PSEUDOCODE_VIEW_BACKGROUND = "000000";
    
    public static final String FONT_PSEUDOCODE_CONTAINER_TEXT = "Arial";
    public static final double TIME_DELAY = 0.5;
    public static final String COLOR_DESCRIPTION_VIEW_BACKGROUND = "d9513c";
    public static final String COLOR_PSEUDOCODE_VIEW_BACKGROUND = "fec515";
    public static final String[] QUICKSORT_PSEUDO_CODE = {
                                                        "       Partition (arr[], low, high)", // - 0
                                                        "           pivot = arr[high]; \n" + // 3 //-1
                                                        "           i = (low - 1); \n" +
                                                        "           for (j = low; j <= high- 1; j++)",
                                                        "               if (arr[j] <= pivot)", // 4 // -2
                                                        "               i++;\n" + // 5 // -3
                                                        "               swap arr[i] and arr[j]",
                                                        "           swap arr[i + 1] and arr[high])", // 6 // -4
                                                        "           return (i + 1)", // -5
                                                        " \n" +
                                                        "       QuickSort(arr[], low, high)", // -6
                                                        "           if (low < high)", // -7
                                                        "               pi = Partition(arr, low, high);                        ", // 0 // -8
                                                        "               QuickSort(arr, low, pi - 1);", // 1 // -9
                                                        "               QuickSort(arr, pi + 1, high); \n"  +
                                                        "   \n" +
                                                        "   \n"};
    public static final int[] QUICKSORT_PSEUDO_CODE_ARRAY_DEFINE = {8,9,10,1,2,3,4};
}
