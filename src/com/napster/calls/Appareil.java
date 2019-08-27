package com.napster.calls;

import java.util.Date;
import java.util.List;

public class Appareil implements Iappareil {


    @Override
    public void enregistrer(Contacts c) {

    }

    @Override
    public void enregistrer(Appel a, String numtel) {

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
