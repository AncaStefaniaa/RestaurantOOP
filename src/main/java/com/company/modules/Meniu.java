package com.company.modules;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Meniu {
    // definire date membre
    private int idMeniu;
    private int numarPagini;
    private double pretMeniu;
    private String tipMeniu;
    private List<String> dateMeniu = new ArrayList<>();

    public Meniu(List<String> dateMeniu, int numarPagini, double pretMeniu, String tipMeniu, int idMeniu){
        this.idMeniu = idMeniu;
        this.dateMeniu = dateMeniu;
        this.numarPagini = numarPagini;
        this.pretMeniu = pretMeniu;
        this.tipMeniu = tipMeniu;
    }

    public Meniu(int idMeniu, int numarPagini, double pretMeniu, String tipMeniu){
        this.idMeniu = idMeniu;
        this.numarPagini = numarPagini;
        this.pretMeniu = pretMeniu;
        this.tipMeniu = tipMeniu;
    }

    public int getIdMeniu() {
        return idMeniu;
    }

    public void setIdMeniu(int idMeniu) {
        this.idMeniu = idMeniu;
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

    @Override
    public String toString() {
        return "Meniu{" +
                "id meniu='" + idMeniu + '\'' +
                "numar pagini='" + numarPagini + '\'' +
                ", tip meniu=" + tipMeniu +
                '}';
    }


}
