package chapter4;

import java.util.Scanner;


public class Task8 {
    
int compute(int... arraysofnumber){
    int sums = 0; // initial value
        for (int b = 0; b < arraysofnumber.length; b++){ // get the first index
            int n = arraysofnumber[b]; // store the first index of number
            int total = n * (n + 1) / 2; // compute the numbers by using the traiangular formula
            sums += total; // add the computed total 
            System.out.println( arraysofnumber [b] + ": " + total); // print the current number
            
        }
        return sums;
}
public static void main(String[] args) {
    Task8 arrayAdd = new Task8();
    
    int arraySize;

    Scanner arrayAddition = new Scanner(System.in);
    System.out.print("Enter number of arrays: "); // getting the lenght of array
    String finput = arrayAddition.nextLine();   
    arraySize = Integer.parseInt(finput.trim().split(" ")[0]); 


    int [] arraysofnumber = new int[arraySize];
    System.out.print("Insert " + arraySize + " numbers: "); 
    for(int a = 0; a<arraySize; a++)
        arraysofnumber[a] = arrayAddition.nextInt(); // getting the numbers for array
    
    System.out.println("Total: " + arrayAdd.compute(arraysofnumber));

}
}
