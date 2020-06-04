package com.company.helpers;
import java.util.Comparator;
import com.company.modules.Comanda;

public class ComandaComparator implements Comparator<Comanda> {

    @Override
    public int compare(Comanda o1, Comanda o2) {
        return o1.getPreparatComandat().compareTo(o2.getPreparatComandat());
    }
}