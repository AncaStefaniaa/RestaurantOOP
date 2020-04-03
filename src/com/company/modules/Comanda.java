package com.company.modules;

import java.util.*;

final public class Comanda {
    private String preparatComandat;
    private Date dataComenzii;
    private Map<Integer, String> inregistrareComanda = new HashMap<Integer, String>();
    private List<Meniu> meniuriComanda = new ArrayList<>();

    public Comanda(String preparatComandat) {
        this.preparatComandat = preparatComandat;
    }

    public String getPreparatComandat() {
        return preparatComandat;
    }

    public void setPreparatComandat(String preparatComandat) {
        this.preparatComandat = preparatComandat;
    }

    public Date getDataComenzii() {
        return dataComenzii;
    }

    public void setDataComenzii(Date dataComenzii) {
        this.dataComenzii = dataComenzii;
    }

    public Map<Integer, String> getInregistrareComanda() {
        return inregistrareComanda;
    }

    public void setInregistrareComanda(Map<Integer, String> inregistrareComanda) {
        this.inregistrareComanda = inregistrareComanda;
    }

    public List<Meniu> getMeniuriComanda() {
        return meniuriComanda;
    }

    public void setMeniuriComanda(List<Meniu> meniuriComanda) {
        this.meniuriComanda = meniuriComanda;
    }
}
