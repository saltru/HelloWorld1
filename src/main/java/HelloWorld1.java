import java.*;

import java.lang.*;
import java.util.Scanner;

public class HelloWorld1 {
    public static void main(String[] args) {
        //System.out.println("15 + 3 = " + add(15, 3));

        Scanner scan = new Scanner(System.in);
        //scan.close();
        Scanner scan1 = new Scanner(System.in);
        String s = scan1.nextLine();

        System.out.println(s);
    }

    public static int add(int a, int b)
    {

        boolean ab =true;
        return a + b;
    }
}
