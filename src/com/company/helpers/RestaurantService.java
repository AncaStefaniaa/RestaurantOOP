package com.company.helpers;

import com.company.contracts.RestaurantFactory;
import com.company.modules.*;

import java.util.*;

public class RestaurantService extends RestaurantFactory {
    @Override
    public Restaurant construiesteRestaurant() {

        List<String> meniuLista = Arrays.asList("apa", "vin");
        Meniu meniu1 = new Meniu(meniuLista,888,77,"bautura");
        Meniu meniu2 = new Meniu(meniuLista,100,20,"mancare");

        List<Meniu> meniuri = new ArrayList<>();
        List<Food> specialitati = new ArrayList<>();

        //  todo aici stiu ca este putin ciudat, voiam sa te intreb cum pot organiza sa introduc cumva doar datele pentru clasa Food, nu pentru tot meniul
        Food specialitate1 = new Food(meniuLista,99,19, "mancare",1600,50.00,"aperitiv",false, "salata cu pui");
        specialitati.add(specialitate1);

        meniuri.add(meniu1);
        meniuri.add(meniu2);
        System.out.print("Enter a value");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(meniu1.getDateMeniu());
        System.out.println(meniu2.getDateMeniu());
//        am incercat sa folosesc aici map pt angajati care sa retina un id si obiectul angajat insa am avut o eroare
//        pe care nu am stiut sa o rezolv
//        Exception in thread "main" java.lang.ClassCastException: class java.util.HashMap cannot be cast to class java.util.List (java.util.HashMap and java.util.List are in module java.base of loader 'bootstrap')
//        at com.company.modules.Restaurant.<init>(Restaurant.java:37)
//        at com.company.helpers.RestaurantService.construiesteRestaurant(RestaurantService.java:40)
//        at com.company.Main.main(Main.java:14)
//        te rog daca poti sa ma indrumi pentru a putea inlocuii in etapa viitoare cu map

        Angajat angajat1 = new Angajat("Ionel","Costel", "bucatar");
        List<Angajat> angajati = new ArrayList<>();
        angajati.add(angajat1);



        Comanda comanda1 = new Comanda("salata de pui");
        List<Comanda> comenzi = new ArrayList<>();
        comenzi.add(comanda1);


        return new Restaurant(
                "Restaurant1",
                "Bucuresti, sector 2, nr. 45",
                meniuri,
                angajati,
                comenzi);


    }
}
