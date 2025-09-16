package chapter3;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //getting inputed text
        System.out.print("Input text: ");  

        String output = input.nextLine().toLowerCase(); // converting inputed text to string 
        StringBuilder routput = new StringBuilder(output).reverse(); // converting text to Stringbuilder and reverse it
        String revOutput = routput.toString(); // convert back string builder to string

        //checking if the inputed text is same with the output
        if(output.equalsIgnoreCase(revOutput))
            System.out.println("This is a palindrome");

        else
            System.out.println("This is not a palindrome");
        

        
    }
}
