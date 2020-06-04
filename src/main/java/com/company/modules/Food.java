package com.company.modules;

import java.util.List;

final public class Food {
    private Integer idPreparat;
    private String numePreparat;
    private Integer kcal;
    private Double price;
    private String type;
    private Integer isVegan;

    public Food(List<String> dateMeniu, int numarPagini, double pretMeniu, String tipMeniu, Integer kcal, Double price, String type, Integer isVegan, String numePreparat) {
        this.numePreparat = numePreparat;
        this.kcal = kcal;
        this.price = price;
        this.type = type;
        this.isVegan = isVegan;
    }

    public Food(Integer idPreparat, String numePreparat, Integer kcal, Double price, String type, Integer isVegan) {
        this.idPreparat = idPreparat;
        this.numePreparat = numePreparat;
        this.kcal = kcal;
        this.price = price;
        this.type = type;
        this.isVegan = isVegan;
    }

    public String getNumePreparat() {
        return numePreparat;
    }

    public void setNumePreparat(String numePreparat) {
        this.numePreparat = numePreparat;
    }

    public Integer getIsVegan() {
        return isVegan;
    }

    public void setIsVegan(Integer isVegan) {
        this.isVegan = isVegan;
    }

    public Integer getIdPreparat() {
        return idPreparat;
    }

    public void setIdPreparat(Integer idPreparat) {
        this.idPreparat = idPreparat;
    }

    public Number getKcal() {
        return kcal;
    }

    public void setKcal(Integer kcal) {
        this.kcal = kcal;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getVegan() {
        return isVegan;
    }

    public void setVegan(Integer vegan) {
        isVegan = vegan;
    }

    @Override
    public String toString() {
        return "Fel de mancare{" +
                "id preparat='" + idPreparat + '\'' +
                "nume preparat='" + numePreparat + '\'' +
                ", numar calorii=" + kcal + '\'' +
                ", pret" + price + '\'' +
                '}';
    }
}
