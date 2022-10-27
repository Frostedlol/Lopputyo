package com.student.lopputyo.service;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.student.lopputyo.data.person;
import com.student.lopputyo.data.course;

@Service
public class personService {
    public List<person> persons = new ArrayList<>();
    public List<course> courses = new ArrayList<>();


   public person addStudent(person p) {
        persons.add(p);
        return p;
   } 


   
   public course AddCourse(course k) {
        courses.add(k);
        return k;
    }

   public List<person> getStudent(person p) {
        return persons;
    }

    public List<course> getCourse(course k) {
        return courses;
    }


    public void AddtoCourse(String nimi, String KurssiNimi){
       
        for (course course : courses) {
            if(course.getKurssi().equals(KurssiNimi)) {
                for (person p : persons) {
                    if(p.getOpiskelija().equals(nimi)) {
                        course.setOpistomies(p);
                    }
                }
            } 
        }
    }

    public void removefCourse(String nimi, String KurssiNimi) {
        for (course course : courses) {
            if(course.getKurssi().equals(KurssiNimi)) {
                for (person p : persons) {
                    if(p.getOpiskelija().equals(nimi)) {
                        course.poistaOpiskelija(p);
                    }
                }
            } 
        }
        
    }
    

   

    





}







 








   


   
   

    

