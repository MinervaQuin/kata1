
package com.mycompany.kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date= GregorianCalendar.getInstance();
        date.set(1949, 9, 24);
        
        Person persona = new Person( date, "Minerva");
        System.out.println(persona.getName()+
                " tiene "+persona.getAge()+" años");
    }
}