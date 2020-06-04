package com.company.modules;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodMeniu extends Meniu{

    private Array alergieni;
    private List<Food> specialitati = new ArrayList<>();

    public FoodMeniu(List<String> dateMeniu, int numarPagini, double pretMeniu, String tipMeniu, int idMeniu, Array alergieni, List<Food> specialitati) {
        super(dateMeniu, numarPagini, pretMeniu, tipMeniu, idMeniu);
        this.alergieni = alergieni;
        this.specialitati = specialitati;
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
