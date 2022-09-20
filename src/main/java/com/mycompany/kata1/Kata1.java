
package com.mycompany.kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
       
        LocalDate birthdate = LocalDate.of(1949, 9, 24);
        Person persona = new Person( birthdate, "Minerva");
        System.out.println(persona.getName()+
                " tiene "+persona.getAge()+" años");
    }
}