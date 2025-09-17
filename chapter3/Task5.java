package chapter3;

import java.util.Arrays;
import java.util.Scanner;


public class Task5 {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] arraysofnumber = new int[3]; // storing the inputed numbers
        System.out.print("Enter 3 numbers (separated by space or 1 by 1): ");
        
        for (int a = 0; a < arraysofnumber.length; a++){
            arraysofnumber [a] = input.nextInt(); // getting the numbers
        }
            
        Arrays.sort(arraysofnumber); // sorting of numbers


          if (arraysofnumber[0] == arraysofnumber[1] && arraysofnumber[1] == arraysofnumber[2]) //codition to check if all numbers are equal
              System.out.println("All numbers are equal");
          else
            System.out.println(arraysofnumber[2]); // printing the highest number among 3 numbers entered.
    }
}