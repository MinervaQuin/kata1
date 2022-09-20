/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata1;

import java.util.Date;

/**
 *
 * @author Minerva
 */
public class Person {
    private final Date birthday;
    private final String name;

    public Person(Date birthday, String name) {
        this.birthday = birthday;
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return (int) ((new Date().getTime()- birthday.getTime())/31536000000L);
    }
    
}
