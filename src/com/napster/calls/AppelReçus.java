package com.napster.calls;

import java.util.Date;

public class AppelReçus extends Appel
{

    @Override
    public double cout() {
        return 0;
    }

    public AppelReçus() {
    }

    public AppelReçus(int numero, Date dateAppel, double dureeAppel) {
        super(numero, dateAppel, dureeAppel);
    }
}
