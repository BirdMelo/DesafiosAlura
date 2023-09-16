package tasks.desafios02.compareble;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("João");
        p1.setOldY(11);

        Person p2 = new Person();
        p2.setName("Maria");
        p2.setOldY(11);

        Person p3 = new Person();
        p3.setName("Bruxa");
        p3.setOldY(68);

       List<Person> charactes = new ArrayList<>();
       charactes.add(p1);
       charactes.add(p2);
       charactes.add(p3);

       System.out.println(charactes);
    }
}
