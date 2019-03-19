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
public abstract class Algorithm {

    private String name;
    
    public Algorithm() {
    }

    public Algorithm(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
