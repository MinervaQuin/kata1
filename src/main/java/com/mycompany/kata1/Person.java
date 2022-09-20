/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Minerva
 */
public class Person {
    private final Calendar birthday;
    private final String name;
    private final long MILISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(Calendar birthday, String name) {
        this.birthday = birthday;
        this.name = name;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int) (milliSecondsToYear(today.getTimeInMillis() - birthday.getTimeInMillis()));
    }
    
    private long milliSecondsToYear(long milles){
        return milles / MILISECONDS_PER_YEAR;
    }
}
