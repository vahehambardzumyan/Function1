import com.sun.corba.se.impl.io.OptionalDataException;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int v = (int) Math.floor(Math.random() * (6 - 3) + 3);
        int[] b = new int[v + 1];

        readInteger(b, v);
        findMin(b);
        findMax(b);

    }

    public static void readInteger(int[] b, int v) {
        System.out.println("please enter the number");


        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= v; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println("you entered this numbers:");
        for (int g = 0; g <= v; g++) {
            System.out.print(b[g] + " ");
        }
    }


    public static void findMax(int[] b) {
        int m = 0;
        System.out.println(" ");
        System.out.println("And the Maxmum Value is ");
        for (int e = 0; e < b.length; e++) {
            if (m < b[e]) m = b[e];
        }
        System.out.println(m);
    }
    public static void findMin(int[] b) {
        int m = 10000000;
        System.out.println(" ");
        System.out.println("Your Minimum Value is ");
        for (int e = 0; e < b.length; e++) {
            if (m > b[e]) m = b[e];
        }
        System.out.println(m);
    }
}
