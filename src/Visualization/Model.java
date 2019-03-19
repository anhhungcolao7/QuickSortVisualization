/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualization;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahcl
 */
public class Model {
    Data data;
    List<Bar> barList;

    public Model() {
        this.data = new Data();
    }

    public Model(Data data) {
        this.data = data;
    }
    
    public void initBars() {
        this.barList = new ArrayList<Bar>();
        List<Integer> chartData = data.getData();
        for(int i=0;i<chartData.size();i++) {
            this.barList.add(new Bar(i, chartData.get(i)));
        }
    }
    
    public void swap(int firstIndex, int secondIndex) {
        int tmp = this.barList.get(firstIndex).getIndex();
        this.barList.get(firstIndex).setIndex(this.barList.get(secondIndex).getIndex());
        this.barList.get(secondIndex).setIndex(tmp);
        
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public List<Bar> getBarList() {
        return barList;
    }

    public void setBarList(List<Bar> barList) {
        this.barList = barList;
    }
    
    
    
}
