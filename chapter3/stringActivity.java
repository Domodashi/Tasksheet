package chapter3;

import java.util.Scanner;

public class stringActivity {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");

        String output = input.nextLine();
        System.out.println("Your input text is " + input);
        System.out.println( "1. Text lenght = " + output.length());
        System.out.println( "2. Text uppercase = " + output.toUpperCase());
        System.out.println( "3. Text lowercase = " + output.toLowerCase());
        System.out.println( "4. First letter = " + output.charAt(0));
        System.out.println( "5. Last letter = " + output.charAt(output.length()- 1));
        System.out.println( "6. Text second to fifth = " + output.substring(1, 5));
        //if (output.length() >= 5)
        //System.out.println( "6. Text second to fifth = " + output.substring(1, 5));
        


    }
}
