/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * Ahmad ALASHTAR 160501304
 * 
 */
public class Dozent extends Person {
    
    public static boolean istcnummer(String mat) {
        return (mat.matches("[0-9]+") && mat.length()==11);
        }
    public Dozent (String j){
        this.settcnummer(j);
 
    }
    public Dozent(){
        
    }
    @Override
    public String toString() {
        return this.gettcnummer() + ", " + this.getvorname() + " " + this.getnachname().toUpperCase();
    }
    public boolean equals(Dozent o){  
        return Integer.parseInt(this.gettcnummer())==Integer.parseInt(o.gettcnummer());
        
    }
    }
