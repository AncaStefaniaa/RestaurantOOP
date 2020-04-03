package com.company.contracts;

import com.company.modules.Angajat;
import com.company.modules.Comanda;
import com.company.modules.Meniu;

public interface RestaurantInterface {
    void adaugaAngajat(Angajat angajat);
    void stergeAngajat(int idAngajat);
    void plaseazaComanda(Comanda comanda);
    void stergeComanda(int idComanda);
    void adaugaMeniu(Meniu meniu);
    void stergeMeniu(int idMeniu);
    int listeazaComenzileSortate(Comanda c1, Comanda c2);
    int listeazaMeniuriSortate(Meniu m1, Meniu m2);
    int listeazaAngajatiiSortati(Angajat a1, Angajat a2);
    void listeazaSpecialitatileVegane(Meniu meniu);
}
