package com.napster.calls;

import java.util.Date;

public abstract class Appel {
    protected int numero;
    protected Date dateAppel;
    protected double dureeAppel;

    protected Contacts contact;

    public abstract double cout();
}
