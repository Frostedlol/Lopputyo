package com.student.lopputyo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.lopputyo.data.course;
import com.student.lopputyo.data.person;
import com.student.lopputyo.service.personService;

@RestController
public class Rest {

    @Autowired
    personService pService;

    @GetMapping("person")
    public List<person> getPerson(){
        return pService.getStudent(null);
    }

    @GetMapping("course")
    public List<course> getCourse(){
        return pService.getCourse(null);
    }

    @PutMapping("addtocourse") 
     public void AddtoCourse(@RequestParam String nimi, @RequestParam String kurssi) {
        pService.AddtoCourse(nimi, kurssi);
    }


    @PutMapping("removefromcourse")
     public void RemovefCourse(@RequestParam String nimi, @RequestParam String kurssi) {
        pService.removefCourse(nimi, kurssi);
     }

    @PostMapping("addcourse")
    public course addCourse(@RequestBody course k){
        return pService.AddCourse(k);
    }

    @PostMapping("addcourses")
    public course addCourse(@RequestParam String Opettaja,@RequestParam String Luokka,@RequestParam String Kurssi){ // Postman / Thunderclient
        course k = new course(Opettaja, Luokka, Kurssi);
        return pService.AddCourse(k);
    }

    @PostMapping("addstudent")
    public person addPerson(@RequestBody person p) {
        return pService.addStudent(p);
    }

    @PostMapping("addstudents") 
    public person addPerson(@RequestParam String nimi) { // Postman / Thunderclient
        person p = new person(nimi);
        return pService.addStudent(p);
    }

    





 



}
