package com.company.modules;

import java.util.ArrayList;
import java.util.List;

public class Meniu {
    // definire date membre
    private List<String> dateMeniu = new ArrayList<>();
    private int numarPagini;
    private double pretMeniu;
    private String tipMeniu;

    public Meniu(List<String> dateMeniu, int numarPagini, double pretMeniu, String tipMeniu){
        this.dateMeniu = dateMeniu;
        this.numarPagini = numarPagini;
        this.pretMeniu = pretMeniu;
        this.tipMeniu = tipMeniu;
    }

    public void setDateMeniu(List<String> dateMeniu){
        this.dateMeniu = dateMeniu;
    }

    public List<String> getDateMeniu(){
        return dateMeniu;
    }

    public void setNumarPagini(int numarPagini){
        this.numarPagini = numarPagini;
    }

    public int getNumarPagini(){
        return this.numarPagini;
    }

    public void setPretMeniu(double pretMeniu){
        this.pretMeniu = pretMeniu;
    }

    public double getPretMeniu(){
        return this.pretMeniu;
    }

    public void setTipMeniu(String tipMeniu){
        this.tipMeniu = tipMeniu;
    }

    public String getTipMeniu(){
        return tipMeniu;
    }

    public Boolean isDrinkOnlyMenu(){
        return this.tipMeniu == "drink";
    }

    public Boolean isFookOnlyMenu(){
        return this.tipMeniu == "food";
    }




}
