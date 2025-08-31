public class forStatement {
    public static void main(String[] args) {
        
        String[] colors = {"black", "blue", "green", "pink"};
        for(String color : colors){
            if (color == "pink")
                System.out.println("Hakdog = " + color);
        }

        int i = 10;
        int n = ++i%5;
        System.out.println("i = " + i + " and " + "n = " + n);

    }
}
