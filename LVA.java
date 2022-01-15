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
public class LVA {
    private String lva;
    void setlva(String lvv){
        this.lva=lvv;
    }
    String getlva(){
        return this.lva;
    }
    public LVA(String lva){
        this.lva=lva;
    }
    public static boolean islva(String mat) {
            if(mat.length()==6){
                
                String letters="";
                String numbers="";
                for (int i = 0 ; i < 3 ; i++){
                    letters+=mat.charAt(i);
                }
                String upperletters = letters.toUpperCase();
                boolean isupperletters = (upperletters == letters);

                for (int i = 3 ; i < 6 ; i++){
                    numbers+=mat.charAt(i);
                }
                boolean isnumbers = numbers.matches("[0-9]+");
                return isnumbers && isupperletters;
        }
        else {
            return false;
        }
    }
    @Override
    public String toString() {
        return this.getlva();
    }
    public boolean equals(LVA o){
        
        return this.getlva().equals(o.getlva());
        
    }
}
