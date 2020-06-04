package com.company.modules;

import java.util.*;

final public class Comanda {
    private Integer idComanda;
    private String preparatComandat;
    private Map<Integer, String> inregistrareComanda = new HashMap<Integer, String>();
    private List<Meniu> meniuriComanda = new ArrayList<>();

    public Comanda(Integer idComanda, String preparatComandat) {
        this.idComanda = idComanda;
        this.preparatComandat = preparatComandat;
    }

    public Integer getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(Integer idComanda) {
        this.idComanda = idComanda;
    }

    public String getPreparatComandat() {
        return preparatComandat;
    }

    public void setPreparatComandat(String preparatComandat) {
        this.preparatComandat = preparatComandat;
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

    @Override
    public String toString() {
        return "Comanda{" +
                "idComanda='" + idComanda + '\'' +
                ", preparat Comandat=" + preparatComandat +
                '}';
    }
}
