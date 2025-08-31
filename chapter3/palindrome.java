package chapter3;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input text: ");

        String output = input.nextLine();
        StringBuilder routput = new StringBuilder(output);
        routput.reverse();

        
        if ( routput == input)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        


        
    }
}
