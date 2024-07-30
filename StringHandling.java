package src;

public class StringHandling {

    public static void main(String[] args) {
        //Purchase amount is to check
        //Payment is $100 paid
        // requirement at where the $ should exist
        String str = "Payment $100 paid";// pre-defined class
        System.out.println(str.charAt(8));

        // indexOf
        String str1 = new String("Second way to write $ the string");
        System.out.println(str1.indexOf("$"));
        System.out.println(str1.substring(20));

        //
    }
}
