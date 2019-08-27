package com.napster.calls;

public class Contacts {

    private int numero;
    private String nom;
    private String numeroTel;
    private Appel appel;
    public Contacts()
    {


    }

    public Contacts(int numero, String nom, String numeroTel) {
        this.numero = numero;
        this.nom = nom;
        this.numeroTel = numeroTel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public Appel getAppel() {
        return appel;
    }

    public void setAppel(Appel appel) {
        this.appel = appel;
    }
}
