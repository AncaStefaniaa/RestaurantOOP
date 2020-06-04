package com.company.services;
import java.io.*;
import java.util.Date;

public class Audit {
    private static Audit instance = null;

    public static Audit getInstance() {
        if (instance == null)
            instance = new Audit();
        return instance;
    }

    private Audit() {
    }

    public void writeAudit(String msg) {
        String filePath = "C:\\Users\\Anca Ilicea\\IdeaProjects\\lllll\\src\\main\\java\\com\\company\\data\\OutAudit.csv";
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true))){

            bufferedWriter.append(msg);
            bufferedWriter.append("," + new Date());
            bufferedWriter.append("\n");

        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}