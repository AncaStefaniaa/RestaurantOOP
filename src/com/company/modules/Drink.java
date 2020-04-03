package com.company.modules;

import java.util.List;

final public class Drink extends DrinkMeniu{
    private Integer alcoolLevel;
    private Integer sugarLevel;
    public Drink(List<String> dateMeniu, int numarPagini, double pretMeniu, String tipMeniu) {
        super(dateMeniu, numarPagini, pretMeniu, tipMeniu);
    }

    public Integer getAlcoolLevel() {
        return alcoolLevel;
    }

    public void setAlcoolLevel(Integer alcoolLevel) {
        this.alcoolLevel = alcoolLevel;
    }

    public Integer getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(Integer sugarLevel) {
        this.sugarLevel = sugarLevel;
    }
}
