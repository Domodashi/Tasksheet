package chapter3;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input text: ");

        String output = input.nextLine();
        StringBuilder routput = new StringBuilder(output).reverse();
        String revOutput = routput.toString();

        if(output.equalsIgnoreCase(revOutput))
            System.out.println("This is a palindrome");

        else
            System.out.println("This is not a palindrome");
        

        
    }
}
