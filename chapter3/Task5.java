package chapter3;

import java.util.Arrays;
import java.util.Scanner;


public class Task5 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] arraysofnumber = new int[3];
        System.out.print("Enter 3 numbers: ");

        for (int a = 0; a < arraysofnumber.length; a++)
          arraysofnumber [a] = input.nextInt();
          Arrays.sort(arraysofnumber);


          if (arraysofnumber[0] == arraysofnumber[1] && arraysofnumber[1] == arraysofnumber[2])
              System.out.println("All numbers are equal");
          else
            System.out.println(arraysofnumber[2]);
    }
}