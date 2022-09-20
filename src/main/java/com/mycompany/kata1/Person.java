/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kata1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Minerva
 */
public class Person {
    private final LocalDate birthday;
    private final String name;

    public Person(LocalDate birthday, String name) {
        this.birthday = birthday;
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return (int) (Period.between(birthday,LocalDate.now()).getYears());
    }
    
}
