package com.napster.calls;

import java.util.Date;

public class AppelEmis extends Appel{
    public AppelEmis() {
    }

    public AppelEmis(int numero, Date dateAppel, double dureeAppel) {
        super(numero, dateAppel, dureeAppel);
    }

    @Override
    public double cout() {
        return this.getDureeAppel()*2;

    }

}
