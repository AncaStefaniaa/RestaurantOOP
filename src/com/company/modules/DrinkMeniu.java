package com.company.modules;

import java.util.ArrayList;
import java.util.List;

public class DrinkMeniu extends Meniu {

    private Integer noOfDrinks;
    private Integer noOfNonAlchoolicDrinks;
    private Integer noOfAlchoolicDrinks;
    private List<Drink> specialitati = new ArrayList<>();
    public DrinkMeniu(List<String> dateMeniu, int numarPagini, double pretMeniu, String tipMeniu) {
        super(dateMeniu, numarPagini, pretMeniu, tipMeniu);
    }

    public void setNoOfAlchoolicDrinks(Integer noOfAlchoolicDrinks) {
        this.noOfAlchoolicDrinks = noOfAlchoolicDrinks;
    }

    public Integer getNoOfAlchoolicDrinks(){
        return noOfAlchoolicDrinks;
    }

    public void setNoOfNonAlchoolicDrinks(Integer noOfAlchoolicDrinks){
        this.noOfNonAlchoolicDrinks = noOfNonAlchoolicDrinks;
    }

    public Integer getNoOfNonAlchoolicDrinks(){
        return noOfNonAlchoolicDrinks;
    }

    public void setNoOfDrinks(Integer noOfDrinks){
        this.noOfDrinks = this.noOfAlchoolicDrinks + this.noOfNonAlchoolicDrinks;
    }

    public Integer getNoOfDrinks(){
        return noOfDrinks;
    }

}
