/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * Ahmad ALASHTAR 160501304
 */
public class Student extends Person {

    
    public Student (String x){
        this.setmatrikelnummer(x);
    }
    public Student (){
        
    }
    
    
    
    public static boolean ismatrikelnummer(String mat) {
        if(mat.matches("[0-9]+") && mat.length()==7 && mat.charAt(0) != '0'){
            return true;
        }
        else{
            return false;
        }

    }
    
    @Override
    public String toString() {
        return this.getmatrikelnummer() + ", " + this.getvorname() + " " + this.getnachname().toUpperCase();
    }
    public boolean equals(Student o){  
        return Integer.parseInt(this.getmatrikelnummer())==Integer.parseInt(o.getmatrikelnummer());
        
    }
}
