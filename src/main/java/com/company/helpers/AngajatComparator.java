package com.company.helpers;
import java.util.Comparator;
import com.company.modules.Angajat;

public class AngajatComparator implements Comparator<Angajat> {

    @Override
    public int compare(Angajat o1, Angajat o2) {
        return o1.getNumeAngajat().compareTo(o2.getNumeAngajat());
    }
}