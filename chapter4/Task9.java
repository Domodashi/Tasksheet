package chapter4;

import static java.lang.Math.*;

import java.util.Scanner;

public class Task9{

    public static int add(int a, int b) {
        return addExact(a, b);
    }
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
 

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        String finput = input.nextLine();
        int a = Integer.parseInt(finput.trim().split(" " )[0]); // ignore the second number inserted 

        System.out.print("Enter the second number number: ");
        String finputs = input.nextLine();
        int b = Integer.parseInt(finputs.trim().split(" " )[0]);

        System.out.println(add(a, b));
        System.out.println(subtract(a, b));
        System.out.println(multiply(a, b));
        System.out.println(divide(a, b));


    }
}