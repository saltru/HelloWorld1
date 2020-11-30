import java.*;

import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld1 {

    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);

          ArrayList<Person> m = new ArrayList<Person>(10);

          for (int i = 30; i < 35; i++) {
              Person p = new Person("Michael", "Semenov", "",
                      i);
              m.add(p);
          }

          for (int i = 35; i < 40; i++) {
            Student s = new Student("Michael", "Semenov", "Sergeevich",
                    i, 5, 4.5);
              m.add((Person)s);
            }

        for (int i = 0; i < m.size(); i++) {
            m.get(i).print();
        }
    }


}
