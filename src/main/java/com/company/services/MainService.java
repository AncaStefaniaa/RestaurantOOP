package com.company.services;

import com.company.modules.Angajat;
import com.company.modules.Comanda;
import com.company.modules.Food;
import com.company.modules.Meniu;
import org.jetbrains.annotations.NotNull;

import java.io.*;

public class MainService {
    private String filePathAngajat = "C:\\Users\\Anca Ilicea\\IdeaProjects\\lllll\\src\\main\\java\\com\\company\\data\\InAngajat.csv";
    private String filePathMeniu = "C:\\Users\\Anca Ilicea\\IdeaProjects\\lllll\\src\\main\\java\\com\\company\\data\\InMeniu.csv";
    private String filePathComanda = "C:\\Users\\Anca Ilicea\\IdeaProjects\\lllll\\src\\main\\java\\com\\company\\data\\InComanda.csv";
    private String filePathFood = "C:\\Users\\Anca Ilicea\\IdeaProjects\\lllll\\src\\main\\java\\com\\company\\data\\InFood.csv";

    public void writeDataToReportAngajat(@NotNull Angajat angajat){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePathAngajat,true))){
            bufferedWriter.append(angajat.getNumeAngajat());
            bufferedWriter.append(",");
            bufferedWriter.append(angajat.getPrenumeAngajat());
            bufferedWriter.append(",");
            bufferedWriter.append(angajat.getTipAngajat());
            bufferedWriter.append("\n");
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void writeDataToReportMeniu(@NotNull Meniu meniu){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePathMeniu,true))){
            bufferedWriter.append(meniu.getTipMeniu());
            bufferedWriter.append(",");
            bufferedWriter.append((char) meniu.getNumarPagini());
            bufferedWriter.append(",");
            bufferedWriter.append(meniu.getTipMeniu());
            bufferedWriter.append("\n");
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void writeDataToReportComanda(@NotNull Comanda comanda){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePathComanda,true))){
            bufferedWriter.append(comanda.getPreparatComandat());
            bufferedWriter.append(",");
            bufferedWriter.append((CharSequence) comanda.getInregistrareComanda());
            bufferedWriter.append("\n");
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void writeDataToReportFood(@NotNull Food food){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePathFood,true))){
            bufferedWriter.append(food.getType());
            bufferedWriter.append(",");
            bufferedWriter.append((CharSequence) food.getKcal());
            bufferedWriter.append("\n");
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void initReportHeaderAngajat() {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePathAngajat))){
            bufferedWriter.append("NUME");
            bufferedWriter.append(",");
            bufferedWriter.append("PRENUME");
            bufferedWriter.append(",");
            bufferedWriter.append("TIP");
            bufferedWriter.append("\n");
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void initReportHeaderMeniu() {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePathMeniu))){
            bufferedWriter.append("TIP MENIU");
            bufferedWriter.append(",");
            bufferedWriter.append("NUMAR PAGINI");
            bufferedWriter.append("\n");
            bufferedWriter.append("DATE MENIU");
            bufferedWriter.append("\n");
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void initReportHeaderComanda() {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePathComanda))){
            bufferedWriter.append("PREPARAT COMANDAT");
            bufferedWriter.append(",");
            bufferedWriter.append("COMANDA");
            bufferedWriter.append("\n");
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void initReportHeaderFood() {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePathFood))){
            bufferedWriter.append("TIP MANCARE");
            bufferedWriter.append(",");
            bufferedWriter.append("KCAL");
            bufferedWriter.append("\n");
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void readDataFromCsvAngajat() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePathAngajat))){
            String record;
            while((record = bufferedReader.readLine()) != null) {
                String [] recordData = record.split(",");
                System.out.println(recordData[0] + " " + recordData[1] + " " + recordData[2]);
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void readDataFromCsvMeniu() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePathMeniu))){
            String record;
            while((record = bufferedReader.readLine()) != null) {
                String [] recordData = record.split(",");
                System.out.println(recordData[0] + " " + recordData[1] + " " + recordData[2]);
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void readDataFromCsvComanda() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePathComanda))){
            String record;
            while((record = bufferedReader.readLine()) != null) {
                String [] recordData = record.split(",");
                System.out.println(recordData[0] + " " + recordData[1]);
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void readDataFromCsvFood() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePathFood))){
            String record;
            while((record = bufferedReader.readLine()) != null) {
                String [] recordData = record.split(",");
                System.out.println(recordData[0] + " " + recordData[1]);
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
