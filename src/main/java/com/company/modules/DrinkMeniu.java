package com.company.modules;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DrinkMeniu extends Meniu {

    private Vector<String> tipuriDeBauturi;
    private List<Drink> bauturi = new ArrayList<>();

    public DrinkMeniu(List<String> dateMeniu, int numarPagini, double pretMeniu, String tipMeniu, int idMeniu, Vector<String> tipuriDeBauturi, List<Drink> bauturi) {
        super(dateMeniu, numarPagini, pretMeniu, tipMeniu, idMeniu);
        this.tipuriDeBauturi = tipuriDeBauturi;
        this.bauturi = bauturi;
    }

    public Vector<String> getTipuriDeBauturi() {
        return tipuriDeBauturi;
    }

    public void setTipuriDeBauturi(Vector<String> tipuriDeBauturi) {
        this.tipuriDeBauturi = tipuriDeBauturi;
    }

    public List<Drink> getBauturi() {
        return bauturi;
    }

    public void setBauturi(List<Drink> bauturi) {
        this.bauturi = bauturi;
    }

    @Override
    public String toString() {
        return "Meniu bauturi{" +
                "tipuri de bauturi = " + tipuriDeBauturi + '\'' +
                ", lista bauturilor din meniu" + bauturi + '\'' +
                '}';
    }
}
