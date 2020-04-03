package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.company.helpers.RestaurantService;
import com.company.modules.Angajat;
import com.company.modules.Meniu;
import com.company.modules.Restaurant;

public class Main {

    public static void main(String[] args) {
        Restaurant restaurant = new RestaurantService().construiesteRestaurant();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Restaurantul "+ restaurant.getNumeRestaurant() + " va sta la dispozitie!");
        System.out.println("\n");
        System.out.println("Selectati una din optiunile de mai jos pentru a afla mai multe informatii.");

        System.out.println("1.Adauga angajat");
        System.out.println("2.Sterge angajat");
        System.out.println("3.Listeaza meniuri");
        System.out.println("4.Listeaza angajati");
        System.out.println("5.Listeaza comenzi");
        System.out.println("6.Adauga meniu");
        System.out.println("7.Stergere meniu");
        System.out.println("8.Listeaza comenzile sortate crescator");
        System.out.println("9.Listeaza meniurile sortate descrescator");
        System.out.println("9.listeaza angajatii sortati descrescator");
        System.out.println("10.listeaza specialitatile vegane");
        System.out.println("11.exit");

        while (true) {
            String optiune = scanner.next();
            switch (optiune) {
                case "1":
                    System.out.println("Introduceti numele angajatului: ");
                    String numeAngajat = scanner.next();
                    System.out.println("Introduceti prenumele angajatului: ");
                    String prenumeAngajat = scanner.next();
                    System.out.println("Introduceti tipul angajatului: ");
                    String tipAngajat = scanner.next();
                    Angajat angajat = new Angajat(numeAngajat,prenumeAngajat,tipAngajat);
                    restaurant.adaugaAngajat(angajat);
                    break;
                case "2":
                    System.out.println("Introduceti indexul angajatului ce va fi sters: ");
                    String index = scanner.next();
                    restaurant.stergeAngajat(Integer.valueOf(index));
                    break;
                case "3":
                    System.out.println("Meniurile din restaurant sunt: ");
                    System.out.println("\n");
                    System.out.println(restaurant.getMeniuri());
                    break;
                case "4":
                    System.out.println("Angajatii din restaurant sunt: ");
                    System.out.println("\n");
                    System.out.println(restaurant.getAngajati());
                    break;
                case "5":
                    System.out.println("Comenzile din restaurant sunt: ");
                    System.out.println("\n");
                    System.out.println(restaurant.getComenzi());
                    break;

                case "7":
                    System.out.println("Vom efectua stergerea meniului: ");
                    String indexMeniu = scanner.next();
//                    System.out.println(restaurant.stergeMeniu(Integer.valueOf(indexMeniu)));
                    break;
                case "8":
                    System.out.println("Comenzile sortate din restaurant sunt: ");
                    System.out.println("\n");
//                    System.out.println(restaurant.listeazaComenzileSortate());
                    break;
                case "9":
                    System.out.println("Angajatii sortate din restaurant sunt: ");
                    System.out.println("\n");
//                    System.out.println(restaurant.listeazaAngajatiiSortati());
                    break;
                case "10":
                    System.out.println("Meniurile sortate din restaurant sunt: ");
                    System.out.println("\n");
//                    System.out.println(restaurant.listeazaMeniuriSortate());
                    break;
                case "exit" :
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("Ai ales o optiune incorecta, selectati una din cele de mai sus.");
            }
        }

    }
}
