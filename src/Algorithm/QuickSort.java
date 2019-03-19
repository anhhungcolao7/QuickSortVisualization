/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ahcl
 */




class QuickSortHelper {
    
    private static int partition (List<Integer> data, int left, int right, List<QuickSortStatus> statusList) {
        int pivot = data.get(right);
        int i = left - 1;
        for(int j=left; j < right; j ++) {
            if (data.get(j) <= pivot) {
                i ++;
                int tmp = data.get(i);
                Collections.swap(data, i, j);
                if (i != j) statusList.add(new QuickSortStatus(left, right, pivot, i, j, data.get(j), SwapType.NORMAL_SWAP));
            } else {
                statusList.add(new QuickSortStatus(left, right, pivot, i, j, data.get(j), SwapType.NO_SWAP));
            }
        }
        Collections.swap(data, i+1, right);
        if (i + 1 != right) statusList.add(new QuickSortStatus(left, right, pivot, i+1, right, pivot, SwapType.SPECICAL_SWAP));
        return i + 1;
    }
    
    public static void doQuickSort(List<Integer> data, int left, int right, List<QuickSortStatus> statusList) {
        if (left < right) {
            int pi = partition(data, left, right, statusList);
            doQuickSort(data, left, pi - 1, statusList);
            doQuickSort(data, pi + 1, right, statusList);
        }
    } 
}

public class QuickSort {
    private List<Integer> data;
    public QuickSort() {
    }

    public QuickSort(List<Integer> data) {
        this.data = data;
    }
    
    
    
    
    
    public List<QuickSortStatus> generateAllStatus() {
        List<QuickSortStatus> statusList = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>(data);
//        for(int i=0;i<tmp.size();i++) System.out.print(tmp.get(i));
//        System.out.println("");
        QuickSortHelper.doQuickSort(tmp, 0, this.data.size() - 1, statusList);
        return statusList;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        
        this.data = data;
    }
    
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        for(int i=0;i<1000;i++) list.add(Math.round((float)Math.random() * 10000));
//        QuickSort qs = new QuickSort(list);
//        List<QuickSortStatus> status = qs.generateAllStatus();
//        System.out.println(status.size());
//    }
    
}
