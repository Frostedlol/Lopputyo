package com.student.lopputyo.data;

import java.util.ArrayList;
import java.util.List;

public class course {
    private String Opettaja;
    private String Luokka;
    private String Kurssi;

    public List<person> opiskelijat = new ArrayList<>();

    public course(String Opettaja, String Luokka, String Kurssi) {
        this.Opettaja = Opettaja;
        this.Luokka = Luokka;
        this.Kurssi = Kurssi;
    }
    
    public void setOpistomies(person p) {
        this.opiskelijat.add(p);
    }

    public void poistaOpiskelija(person p) {
        this.opiskelijat.remove(p);
    }


    public String getOpettaja() {
        return this.Opettaja;
    }

    public void setOpettaja(String Opettaja) {
        this.Opettaja = Opettaja;
    }

    public String getLuokka() {
        return this.Luokka;
    }

    public void setLuokka(String Luokka) {
        this.Luokka = Luokka;
    }

    public String getKurssi() {
        return this.Kurssi;
    }

    public void setKurssi(String Kurssi) {
        this.Kurssi = Kurssi;
    }




}
