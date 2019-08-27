package com.napster.calls;
import java.util.Date;
import java.util.List;
public interface Iappareil {

public void enregistrer(Contacts c);
public void enregistrer(Appel a, String numtel);
public Contacts consulter(int numero) throws Exception;
public List<Contacts> consulter(String mc);
public double coutAppels(Date d1,Date d2 );
public double coutTotalAppels();
public double coutAppels(int numero);
}
