package com.company.helpers;

import com.company.contracts.RestaurantFactory;
import com.company.modules.*;

import java.util.*;

public class RestaurantService extends RestaurantFactory {
    @Override
    public Restaurant construiesteRestaurant() {

        List<String> meniuLista = Arrays.asList("apa", "vin");
//        Meniu meniu1 = new Meniu(meniuLista,888,77,"bautura");
//        Meniu meniu2 = new Meniu(meniuLista,100,20,"mancare");
        List<Meniu> meniuri = new ArrayList<>();
//        meniuri.add(meniu1);
//        meniuri.add(meniu2);


        List<Food> specialitati = new ArrayList<>();
        Food specialitate1 = new Food(meniuLista,99,19, "mancare",1600,
                            50.00,"aperitiv",0, "salata cu pui");
        specialitati.add(specialitate1);


//        Angajat angajat1 = new Angajat("Ionel","Costel", "bucatar");
//        Angajat angajat2 = new Angajat("Ion","Gigel", "bucatar");
        List<Angajat> angajati = new ArrayList<>();
//        angajati.add(angajat1);
//        angajati.add(angajat2);


//        Comanda comanda1 = new Comanda("salata de pui");
//        Comanda comanda2 = new Comanda("pizza");
        List<Comanda> comenzi = new ArrayList<>();
//        comenzi.add(comanda1);


        return new Restaurant(
                "Allouete Restaurant",
                "Bucuresti, sector 2, nr. 45",
                meniuri,
                angajati,
                comenzi);
    }
}
