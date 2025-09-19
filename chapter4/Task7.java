package chapter4;

import java.util.Scanner;




public class Task7 {

double addNumbers(double a, double b){
    return a + b;
}

double minusNumbers(double a, double b){
    return a - b;
}

double multiplyNumbers(double a, double b){
    return a * b;
}

double divideNumbers(double a, double b){
    return a / b;
}

    public static void main(String[] args) {
        Task7 act7 = new Task7();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = input.nextInt();
        System.out.print("Enter second number: ");
        double b = input.nextInt();

        System.out.println(act7.addNumbers(a, b));
        System.out.println(act7.minusNumbers(a, b));
        System.out.println(act7.multiplyNumbers(a, b));
        System.out.println(act7.divideNumbers(a, b));


    }

    
    
}
