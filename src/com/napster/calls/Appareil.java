package com.napster.calls;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Appareil implements Iappareil {

private List<Contacts> contact = new ArrayList<Contacts>();
private Map<Integer,Appel> appels = new HashMap<Integer, Appel>();
    @Override
    public void enregistrer(Contacts c) {



    }

    @Override
    public void enregistrer(Appel a, String numtel) {
        Contacts c1 = null;

        for (Contacts c: contact)
        {
            if (c.getNumeroTel().equals(numtel))
            {
                c1=c;
                break;
            }
            a.setContact(c1);
            appels.put(a.getNumero(),a);
        }


    }

    @Override
    public Contacts consulter(int numero) throws Exception {
        return null;
    }

    @Override
    public List<Contacts> consulter(String mc) {
        return null;
    }

    @Override
    public double coutAppels(Date d1, Date d2) {
        return 0;
    }

    @Override
    public double coutTotalAppels() {
        return 0;
    }

    @Override
    public double coutAppels(int numero) {
        return 0;
    }
}
