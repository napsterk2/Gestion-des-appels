package com.napster.calls;

import java.util.Date;

public abstract class Appel {
    protected int numero;
    protected Date dateAppel;
    protected double dureeAppel;

    protected Contacts contact;

    public abstract double cout();

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDateAppel() {
        return dateAppel;
    }

    public void setDateAppel(Date dateAppel) {
        this.dateAppel = dateAppel;
    }

    public double getDureeAppel() {
        return dureeAppel;
    }

    public void setDureeAppel(double dureeAppel) {
        this.dureeAppel = dureeAppel;
    }

    public Contacts getContact() {
        return contact;
    }

    public void setContact(Contacts contact) {
        this.contact = contact;
    }


    public Appel()
    {

    }

    public Appel(int numero, Date dateAppel, double dureeAppel)
    {
        this.numero = numero;
        this.dateAppel = dateAppel;
        this.dureeAppel = dureeAppel;
    }
}
