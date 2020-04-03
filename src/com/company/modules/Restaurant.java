package com.company.modules;

import com.company.contracts.RestaurantInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Restaurant implements RestaurantInterface {
    private String numeRestaurant;
    private String locatieRestaurant;
    private int orePeZi;

    private List<Angajat> angajati = new ArrayList<>();
    private List<Meniu> meniuri = new ArrayList<>();
    private List<Comanda> comenzi = new ArrayList<>();

    public Restaurant(String numeRestaurant, String locatieRestaurant, int orePeZi) {
        this.numeRestaurant = numeRestaurant;
        this.locatieRestaurant = locatieRestaurant;
        this.orePeZi = orePeZi;
    }

    public Restaurant(String numeRestaurant, String locatieRestaurant, int orePeZi, List<Angajat> angajati, Map<Integer, Meniu> meniuri, List<Comanda> comenzi) {
        this.numeRestaurant = numeRestaurant;
        this.locatieRestaurant = locatieRestaurant;
        this.orePeZi = orePeZi;
        this.meniuri = (List<Meniu>) meniuri;
        this.angajati = angajati;
        this.comenzi = comenzi;
    }

    public Restaurant(String numeRestaurant, String locatieRestaurant, List<Meniu> meniuri, List<Angajat> angajati, List<Comanda> comenzi) {
        this.numeRestaurant = numeRestaurant;
        this.locatieRestaurant = locatieRestaurant;
        this.meniuri = meniuri;
        this.angajati = angajati;
        this.comenzi = comenzi;

    }

    public String getNumeRestaurant() {
        return numeRestaurant;
    }

    public void setNumeRestaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    public String getLocatieRestaurant() {
        return locatieRestaurant;
    }

    public void setLocatieRestaurant(String locatieRestaurant) {
        this.locatieRestaurant = locatieRestaurant;
    }

    public int getOrePeZi() {
        return orePeZi;
    }

    public void setOrePeZi(int orePeZi) {
        this.orePeZi = orePeZi;
    }

    public List<Angajat> getAngajati() {
        return angajati;
    }

    public void setAngajati(List<Angajat> angajati) {
        this.angajati = angajati;
    }

    public List<Meniu> getMeniuri() {
        return meniuri;
    }

    public void setMeniuri(List<Meniu> meniuri) {
        this.meniuri = meniuri;
    }

    public List<Comanda> getComenzi() {
        return comenzi;
    }

    public void setComenzi(List<Comanda> comenzi) {
        this.comenzi = comenzi;
    }

    @Override
    public void adaugaAngajat(Angajat angajat) {
        this.angajati.add(angajat);
        System.out.println("--------------S-a plasat angajatul----------------");
        System.out.println(angajat);
    }

    @Override
    public void stergeAngajat(int idAngajat) {
        this.angajati.remove(idAngajat);
        System.out.println("--------------S-a sters angajatul cu id-ul----------------");
        System.out.println(idAngajat);
    }

    @Override
    public void plaseazaComanda(Comanda comanda) {
        this.comenzi.add(comanda);
        System.out.println("--------------S-a plasat comanda----------------");
        System.out.println(comanda);
    }

    @Override
    public void stergeComanda(int idComanda) {
        this.comenzi.remove(idComanda);
        System.out.println("--------------S-a sters comanda cu id-ul----------------");
        System.out.println(idComanda);
    }

    @Override
    public void adaugaMeniu(Meniu meniu) {
        this.meniuri.add(meniu);
        System.out.println("--------------S-a sters meniul----------------");
        System.out.println(meniu);
    }

    @Override
    public void stergeMeniu(int idMeniu) {
        this.meniuri.remove(idMeniu);
        System.out.println("--------------S-a sters meniul----------------");
        System.out.println(idMeniu);
    }

    @Override
    public int listeazaComenzileSortate(Comanda c1, Comanda c2) {
        return c1.getDataComenzii().compareTo(c2.getDataComenzii());
    }

    @Override
    public int listeazaMeniuriSortate(Meniu m1, Meniu m2) {
       return m1.getTipMeniu().compareTo(m2.getTipMeniu());
    }

    @Override
    public int listeazaAngajatiiSortati(Angajat a1, Angajat a2) {
        return a1.getNumeAngajat().compareTo(a2.getNumeAngajat());
    }

    @Override
    public void listeazaSpecialitatileVegane(Meniu meniu) {
        System.out.println("Specialitatile vegane sunt:");
    }


}
