/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.ArrayList;
import java.util.Vector;


/**
 *
 * Ahmad ALASHTAR 160501304
 */
public class University {
    Vector<Student> studenten = new Vector();
    Vector<LVA> lva = new Vector();
    Vector<Dozent> dozenten = new Vector();
    ArrayList<String> LVAandStud = new ArrayList<>();
    ArrayList<String> LVAandDoz = new ArrayList<>();

    
    private String name = "";
    private String address = "";
    University (String name, String address){
        this.name = name;
        this.address=address;
        
    }
    public void LVAandStud(String matrikelnummer, String lva){
        LVAandStud.add(matrikelnummer);
        LVAandStud.add(lva);
    }
    public void LVAandDoz(String dozent, String lva){
        LVAandDoz.add(dozent);
        LVAandDoz.add(lva);
    }
    public static boolean eMat(String mat, University o) {
        if (o.studenten.size()!= 0){
        for (int i = 0; i<o.studenten.size();i++){
            System.out.println("i = " + i);
            if (o.studenten.get(i).getmatrikelnummer().equals(mat)){
                return false;
            }
        }
        return true;
        }
        return true;
    }
}
        
