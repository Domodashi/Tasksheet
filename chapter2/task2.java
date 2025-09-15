class task2 {

    public static void main(String[] args) {
        // Creata all of the primitive (except long and double) with different values. 
        //Concatenate into a string and print it to the screen so it will print "H3110 w0r1d 2.0 true"
        /*  all primitive data type (
        boolean /
        byte /
        short /
        int /
        long (di kasama)
        float (di kasama)
        double /
        char/ */
        boolean x = false;
        byte o = 0;
        short e = 3;
        int l = 1;
        char H = 'H';
        double two = 2;
        String output = "" + H + e + l + l + o + " " + "w" + o + "r" + l + "d" + " " + two + " " + !x;
        System.out.println(output);
    }
}