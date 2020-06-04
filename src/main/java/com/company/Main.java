package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.company.helpers.RestaurantService;
import com.company.modules.*;
import com.company.repository.AngajatRepository;
import com.company.repository.ComandaRepository;
import com.company.repository.FoodRepository;
import com.company.repository.MeniuRepository;
import com.company.services.Audit;
import com.company.services.MainService;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException{
        AngajatRepository mainRepository = new AngajatRepository();
        MeniuRepository meniuRepository = new MeniuRepository();
        ComandaRepository comandaRepository = new ComandaRepository();
        FoodRepository foodRepository = new FoodRepository();
        try {
            Class.forName("com.mysql.jdbc.Driver");
//            Angajat q1 = new Angajat(15,"Eduard", "Ion",false,"curier");
//            System.out.println("Persoane din baza: ");
//            System.out.println(mainRepository.getAngajati());
//            mainRepository.addAngajat(q1);
//            System.out.println("Persoane din baza: ");
//            System.out.println(mainRepository.getAngajati());


//             Meniu q2 = new Meniu(1,11,200,"mancare");
//             System.out.println("Meniuri din baza: ");
//             System.out.println(meniuRepository.getMeniuri());
//             meniuRepository.addMeniu(q2);
//             System.out.println("Meniuri din baza: ");
//             System.out.println(meniuRepository.getMeniuri());

//            Comanda q3 = new Comanda(2,"salata greceasca");
//            System.out.println("Comenzi din baza: ");
//            System.out.println(comandaRepository.getComenzi());
//            comandaRepository.addComanda(q3);
//            System.out.println("Comenzi din baza: ");
//            System.out.println(comandaRepository.getComenzi());

//            Food q4 = new Food(1, "salata de varza", 150, 22.0,"salata",0 );
//            System.out.println("Preparate din baza: ");
//            System.out.println(foodRepository.getFood());
//            foodRepository.addFood(q4);
//            System.out.println("Preparate din baza: ");
//            System.out.println(foodRepository.getFood());


            Restaurant restaurant = new RestaurantService().construiesteRestaurant();
            Scanner scanner = new Scanner(System.in);
            MainService mainService = new MainService();
            Audit audit = Audit.getInstance();
            audit.writeAudit("Restaurantul a fost deschis");


            System.out.println("\n");
            System.out.println("Restaurantul " + restaurant.getNumeRestaurant() + " va sta la dispozitie!");
            System.out.println("\n");
            System.out.println("Selectati una din optiunile de mai jos pentru a afla mai multe informatii.");
            System.out.println("-------------------------------------------");
            System.out.println("--------ACTIUNI CONSOLA SI CSV--------");
            System.out.println("-------------------------------------------");
            System.out.println("1.Adauga angajat");
            System.out.println("2.Sterge angajat");
            System.out.println("3.Listeaza meniuri");
            System.out.println("4.Listeaza angajati");
            System.out.println("5.Listeaza comenzi");
            System.out.println("6.Adauga meniu");
            System.out.println("7.Stergere meniu");
            System.out.println("8.Listeaza comenzile sortate crescator");
            System.out.println("9.Listeaza angajatii sortati descrescator");
            System.out.println("10.Listeaza meniurile sortate descrescator");
            System.out.println("11.Generare raport angajati");
            System.out.println("12.Generare raport comenzi");
            System.out.println("13.Generare raport meniuri");
            System.out.println("14.Afiseaza raportul angajatilor in consola");
            System.out.println("-------------------------------------------");
            System.out.println("--------ACTIUNI PENTRU BAZA DE DATE--------");
            System.out.println("-------------------------------------------");
            System.out.println("15.Afiseaza continut tabela angajati");
            System.out.println("16.Afiseaza continut tabela meniuri");
            System.out.println("17.Afiseaza continut tabela comenzi");
            System.out.println("18.Afiseaza continut tabela preparate");
            System.out.println("19.Adauga in tabela angajati");
            System.out.println("20.Sterge din tabela angajati");
            System.out.println("21.Sterge din tabela meniu");
            System.out.println("22.exit");

            while (true) {
                String optiune = scanner.next();
                switch (optiune) {
                    case "1":
                        System.out.println("Introduceti id-ul angajatului: ");
                        Integer idAngajat = scanner.nextInt();
                        System.out.println("Introduceti numele angajatului: ");
                        String numeAngajat = scanner.next();
                        System.out.println("Introduceti prenumele angajatului: ");
                        String prenumeAngajat = scanner.next();
                        System.out.println("Introduceti tipul angajatului: ");
                        String tipAngajat = scanner.next();
                        System.out.println("Este angajatul manager? True/False ");
                        Boolean manager= scanner.nextBoolean();
                        Angajat angajat = new Angajat(idAngajat, numeAngajat, prenumeAngajat, manager, tipAngajat);
                        restaurant.adaugaAngajat(angajat);
                        audit.writeAudit("S-a adaugat un angajat");

                        break;
                    case "2":
                        System.out.println("Introduceti indexul angajatului ce va fi sters: ");
                        String index = scanner.next();
                        restaurant.stergeAngajat(Integer.valueOf(index));
                        audit.writeAudit("S-a sters un angajat");
                        break;
                    case "3":
                        System.out.println("Meniurile din restaurant sunt: ");
                        System.out.println("\n");
                        System.out.println(restaurant.getMeniuri());
                        audit.writeAudit("S-au afisat meniurile din restaurant");
                        break;
                    case "4":
                        System.out.println("Angajatii din restaurant sunt: ");
                        System.out.println("\n");
                        System.out.println(restaurant.getAngajati());
                        audit.writeAudit("S-au afisat angajatii din restuarnt");
                        break;
                    case "5":
                        System.out.println("Comenzile din restaurant sunt: ");
                        System.out.println("\n");
                        System.out.println(restaurant.getComenzi());
                        audit.writeAudit("S-au afisat comenzile din restaurant");
                        break;
                    case "6":
                        System.out.println("Introduceti datele meniului: ");
                        List dateMeniu = null;
                        System.out.println("Introduceti numarul de pagini al meniului: ");
                        int idMeniu = scanner.nextInt();
                        System.out.println("Introduceti numarul de pagini al meniului: ");
                        int numarPagini = scanner.nextInt();
                        System.out.println("Introduceti pretul meniului: ");
                        double pretMeniu = scanner.nextDouble();
                        System.out.println("Introduceti tipul meniului: ");
                        String tipMeniu = scanner.next();
                        Meniu meniu = new Meniu(idMeniu, numarPagini, pretMeniu, tipMeniu);
                        restaurant.adaugaMeniu(meniu);
                        audit.writeAudit("S-a adaugat un meniu");
                        break;
                    case "7":
                        System.out.println("Vom efectua stergerea meniului: ");
                        String indexMeniu = scanner.next();
                        restaurant.stergeMeniu(Integer.valueOf(indexMeniu));
                        audit.writeAudit("S-a sters un meniu");
                        break;
                    case "8":
                        System.out.println("Comenzile sortate din restaurant sunt: ");
                        System.out.println("\n");
                        System.out.println(restaurant.getComenziSortate());
                        audit.writeAudit("Comenzile au fost sortate");
                        break;
                    case "9":
                        System.out.println("Angajatii sortati din restaurant sunt: ");
                        System.out.println("\n");
                        System.out.println(restaurant.getAngajatiSortati());
                        audit.writeAudit("Angajatii au fost sortati si afisati");
                        break;
                    case "10":
                        System.out.println("Meniurile sortate din restaurant sunt: ");
                        System.out.println("\n");
                        System.out.println(restaurant.getMeniuriSortate());
                        audit.writeAudit("Meniurile au fost sortate");
                        break;
                    case "11":
                        mainService.initReportHeaderAngajat();
                        restaurant.getAngajati().forEach(a -> mainService.writeDataToReportAngajat(a));
                        audit.writeAudit("A fost intocmit un raport al angajatilor");
                        System.out.println("Hei am scris in fisier! ");
                        break;
                    case "12":
                        mainService.initReportHeaderComanda();
                        restaurant.getComenzi().forEach(a -> mainService.writeDataToReportComanda(a));
                        audit.writeAudit("A fost intocmit un raport al comenzilor");
                        System.out.println("Hei am scris in fisier! ");
                        break;
                    case "13":
                        mainService.initReportHeaderMeniu();
                        restaurant.getMeniuri().forEach(a -> mainService.writeDataToReportMeniu(a));
                        audit.writeAudit("A fost intocmit un raport al meniurilor");
                        System.out.println("Hei am scris in fisier! ");
                        break;
                    case "14":
                        mainService.readDataFromCsvAngajat();
                        audit.writeAudit("S-a efectuat o scriere in consola");
                        break;
                    case "15":
                        System.out.println("Angajati din baza: ");
                        System.out.println(mainRepository.getAngajati());
                        audit.writeAudit("Au fost afisati angajatii din bd");
                        break;
                    case "16":
                        System.out.println("Meniu din baza: ");
                        System.out.println(meniuRepository.getMeniuri());
                        audit.writeAudit("Au fost afisate meniurile din bd");
                        break;
                    case "17":
                        System.out.println("Comanda din baza: ");
                        System.out.println(comandaRepository.getComenzi());
                        audit.writeAudit("Au fost afisate comenzile din bd");
                        break;
                    case "18":
                        System.out.println("Preparatul din baza: ");
                        System.out.println(foodRepository.getFood());
                        audit.writeAudit("Au fost afisate preparatele din bd");
                        break;
                    case "19":
                        System.out.println("Adauga un angajat in baza: ");
                        System.out.println("Introduceti id-ul angajatului: ");
                        Integer idAngajat1 = scanner.nextInt();
                        System.out.println("Introduceti numele angajatului: ");
                        String numeAngajat1 = scanner.next();
                        System.out.println("Introduceti prenumele angajatului: ");
                        String prenumeAngajat1 = scanner.next();
                        System.out.println("Introduceti tipul angajatului: ");
                        String tipAngajat1 = scanner.next();
                        System.out.println("Este angajatul manager? True/False ");
                        Boolean manager1= scanner.nextBoolean();
                        Angajat angajat1 = new Angajat(idAngajat1, numeAngajat1, prenumeAngajat1, manager1, tipAngajat1);
                        mainRepository.addAngajat(angajat1);
                        audit.writeAudit("A fost adaugat un angajat");
                        break;
                    case "20":
                        System.out.println("Sterge un angajat din baza ");
                        System.out.println("\n");
                        System.out.println("Introduceti id-ul angajatului de sters: ");
                        Integer idAngajat2 = scanner.nextInt();
                        mainRepository.deleteAngajat(idAngajat2);
                        System.out.println("A fost sters angajatul " + idAngajat2);
                        audit.writeAudit("Sterge un angajat");
                        break;
                    case "21":
                        System.out.println("Sterge un meniu din baza ");
                        System.out.println("\n");
                        System.out.println("Introduceti id-ul meniul de sters: ");
                        Integer idMeniu2 = scanner.nextInt();
                        meniuRepository.deleteMeniu(idMeniu2);
                        System.out.println("A fost sters meniul " + idMeniu2);
                        audit.writeAudit("Sterge un meniu");
                        break;
                    case "exit":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\n");
                        System.out.println("Ai ales o optiune incorecta, selectati una din cele de mai sus.");
                }
            }
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
