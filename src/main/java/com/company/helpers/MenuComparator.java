package com.company.helpers;
import java.util.Comparator;
import com.company.modules.Meniu;

public class MenuComparator implements Comparator<Meniu> {

    @Override
    public int compare(Meniu o1, Meniu o2) {
        return o1.getTipMeniu().compareTo(o2.getTipMeniu());
    }
}