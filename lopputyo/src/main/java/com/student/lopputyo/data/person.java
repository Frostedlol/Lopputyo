package com.student.lopputyo.data;

public class person {
    private String opiskelija;
    private static int idCounter;
    private int id;

   
    public person() {
        this("");
    }
 
    public person(String opiskelija) {
        this.opiskelija = opiskelija;
        this.id = idCounter++;
    }

   
    public String getOpiskelija() {
        return this.opiskelija;
    }

    public void SetOpiskelija(String opiskelija) {
        this.opiskelija = opiskelija;
    }

    public int getId(){return this.id;}

    public void addcourse(course cour) {
    }

    
}



