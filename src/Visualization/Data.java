/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualization;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author ahcl
 */
public class Data {
    private List<Integer> data;

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }

    public Data() {
    }

    public Data(List<Integer> data) {
        this.data = data;
    }
    
    public Data(String textData) {
        String[] s = textData.split("[^0-9]+");
        List<Integer> newList = new ArrayList<>();
        for(String number:s) {
            try {
                newList.add(Integer.parseInt(number));
            } catch (Exception e) {
            }
        }
        this.data = newList;
    }
    
    public void randomData(int size, int min, int max) {
        List<Integer> newList = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < size; i++) {
            int value = random.nextInt(max - min) + min;
            newList.add(value);
//            System.out.println(value);
        }
        this.data = newList;
    }
    
//    public static void main(String[] args) {
//        Data data = new Data("");
//    }
    
}
