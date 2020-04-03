package com.company.modules;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodMeniu extends Meniu{

    private Array alergieni;
    private List<Food> specialitati = new ArrayList<>();

    public FoodMeniu(List<String> dateMeniu, int numarPagini, double pretMeniu, String tipMeniu) {
        super(dateMeniu, numarPagini, pretMeniu, tipMeniu);
    }

    public Array getAlergieni() {
        return alergieni;
    }

    public void setAlergieni(Array alergieni) {
        this.alergieni = alergieni;
    }

    public List<Food> getSpecialitati() {
        return specialitati;
    }

    public void setSpecialitati(List<Food> specialitati) {
        this.specialitati = specialitati;
    }

}
