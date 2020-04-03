package com.company.modules;

import java.util.List;

final public class Food extends FoodMeniu{
    private String numePreparat;
    private Integer kcal;
    private Double price;
    private String type;
    private Boolean isVegan;

    public Food(List<String> dateMeniu, int numarPagini, double pretMeniu, String tipMeniu, Integer kcal, Double price, String type, Boolean isVegan, String numePreparat) {
        super(dateMeniu, numarPagini, pretMeniu, tipMeniu);
        this.numePreparat = numePreparat;
        this.kcal = kcal;
        this.price = price;
        this.type = type;
        this.isVegan = isVegan;
    }

    public Integer getKcal() {
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

    public Boolean getVegan() {
        return isVegan;
    }

    public void setVegan(Boolean vegan) {
        isVegan = vegan;
    }

}
