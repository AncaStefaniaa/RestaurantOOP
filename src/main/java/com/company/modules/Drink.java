package com.company.modules;

import java.util.List;

final public class Drink {
    private String denumire;
    private Integer pret;
    private Integer alcoolLevel;
    private Integer sugarLevel;

    public Drink(String denumire, Integer alcoolLevel, Integer sugarLevel) {
        this.denumire = denumire;
        this.alcoolLevel = alcoolLevel;
        this.sugarLevel = sugarLevel;
    }

    public Integer getPret() {
        return pret;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
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

    @Override
    public String toString() {
        return "Bautura{" +
                "nivel alcool='" + alcoolLevel + '\'' +
                ", nivel zahar=" + sugarLevel +
                '}';
    }
}
