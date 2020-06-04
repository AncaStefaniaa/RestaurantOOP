package com.company.modules;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Angajat {
    private int idAngajat;
    private String numeAngajat;
    private String prenumeAngajat;
    private Boolean manager;
    private String tipAngajat;
    private List<Comanda> comenzi = new ArrayList<>();

    public Angajat(int idAngajat, String numeAngajat, String prenumeAngajat, Boolean manager, String tipAngajat) {
        this.idAngajat = idAngajat;
        this.numeAngajat = numeAngajat;
        this.prenumeAngajat = prenumeAngajat;
        this.manager = manager;
        this.tipAngajat = tipAngajat;
    }

    public Angajat(String numeAngajat, String prenumeAngajat, Boolean manager, String tipAngajat) {
        this.numeAngajat = numeAngajat;
        this.prenumeAngajat = prenumeAngajat;
        this.manager = manager;
        this.tipAngajat = tipAngajat;
    }

    public Integer getIdAngajat() {
        return idAngajat;
    }

    public void setIdAngajat(Integer idAngajat) {
        this.idAngajat = idAngajat;
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

    @Override
    public String toString() {
        return "Angajat{" +
                "id angajat='" + idAngajat + '\'' +
                "nume angajat='" + numeAngajat + '\'' +
                ", prenume angajat" + prenumeAngajat + '\'' +
                ", manager=" + manager + '\'' +
                ", tip angajat" + tipAngajat + '\'' +
                '}';
    }
}
