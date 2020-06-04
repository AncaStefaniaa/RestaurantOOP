package com.company.contracts;

import com.company.modules.Angajat;
import com.company.modules.Comanda;
import com.company.modules.Meniu;

import java.util.List;

public interface RestaurantInterface {
    void adaugaAngajat(Angajat angajat);
    void stergeAngajat(int idAngajat);
    void plaseazaComanda(Comanda comanda);
    void stergeComanda(int idComanda);
    void adaugaMeniu(Meniu meniu);
    void stergeMeniu(int idMeniu);
    List getAngatati();
    List getComenziSortate();
    List getAngajatiSortati();
    void getSpecialitatiVegane();
    List getMeniuriSortate();
}
