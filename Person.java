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
public class Person {
    private String vorname = "";
    private String nachname = "";
    private String matrikelnummer;
    private String alter = "";
    private String fak = "";
    private String klasse = "";
    private String email = "";
    private String phone = "";
    private String address = "";
    private String geschlecht = "";
    private String tcnummer;

    public void settcnummer(String mat){
        this.tcnummer=mat;
    }
    
    public void setmatrikelnummer(String mat){
        this.matrikelnummer=mat;
    }
    
    public void setvorname(String vo){
        this.vorname=vo;
    }
    public void setnachname (String na){
        this.nachname = na;
    }
    public void setalter (String al ){
        this.alter =al;
    }
    public void setfak (String fa){
        this.fak = fa;
    }
    public void setklasse (String kl){
        this.klasse =kl;
    }
    public void setemail (String em){
        this.email = em;
    }
    public void setphone (String ph){
        this.phone =ph;
    }
    public void setaddress (String ad){
        this.address = ad;
    }
    public void setgeschlecht (String ge){
        this.geschlecht = ge;
    }
    
    public String gettcnummer(){
        return this.tcnummer;
    }
    
    public String getmatrikelnummer(){
        return this.matrikelnummer;
    }
    public String getvorname (){
        return this.vorname;
    }
    public String getnachname (){
        return this.nachname;
    }
    public String getalter (){
        return this.alter;
    }
    public String getfak (){
        return this.fak;
    }
    public String getklasse (){
        return this.klasse;
    }
    public String getemail (){
        return this.email;
    }
    public String getphone (){
        return this.phone;
    }
    public String getaddress (){
        return this.address;
    }
    public String getgeschlecht (){
        return this.geschlecht;
    }
}
