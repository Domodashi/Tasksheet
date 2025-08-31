package Tasksheet112;

public class ArithmeticTask {

    public static void main (String[] args){
          
        int result = 1 + 2; // result is now 3
        System.out.println(result);

        int mresult = result - 1; // result is now 2
        System.out.println(mresult);

        int mulresult = mresult * 2; // result is now 4
        System.out.println(mulresult);

        int dresult = mulresult / 2; // result is now 2
        System.out.println(dresult);

        int addresult = dresult + 8; // result is now 10
        System.out.println(addresult);
        
        int modresult = addresult % 7; // result is now 3
        System.out.println(modresult);
    }
}