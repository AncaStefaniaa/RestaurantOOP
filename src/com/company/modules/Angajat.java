package com.company.modules;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Angajat {
    private String numeAngajat;
    private String prenumeAngajat;
    private Boolean manager;
    private String tipAngajat;
    private List<Comanda> comenzi = new ArrayList<>();

    public Angajat(String numeAngajat, String prenumeAngajat, String tipAngajat) {
        this.numeAngajat = numeAngajat;
        this.prenumeAngajat = prenumeAngajat;
        this.tipAngajat = tipAngajat;
    }

    public String getNumeAngajat() {
        return numeAngajat;
    }

    public void setNumeAngajat(String numeAngajat) {
        this.numeAngajat = numeAngajat;
    }

    public String getPrenumeAngajat() {
        return prenumeAngajat;
    }

    public void setPrenumeAngajat(String prenumeAngajat) {
        this.prenumeAngajat = prenumeAngajat;
    }

    public Boolean getManager() {
        return manager;
    }

    public void setManager(Boolean manager) {
        this.manager = manager;
    }

    public String getTipAngajat() {
        return tipAngajat;
    }

    public void setTipAngajat(String tipAngajat) {
        this.tipAngajat = tipAngajat;
    }

    public List<Comanda> getComenzi() {
        return comenzi;
    }

    public void setComenzi(List<Comanda> comenzi) {
        this.comenzi = comenzi;
    }
}
