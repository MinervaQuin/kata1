
package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person persona = new Person( new Date(49,8,24),"Minerva");
        System.out.println(persona.getName()+" tiene "+persona.getAge()+" años");
    }
}