package src;

public class MyparentClass {

    static String s="hello World";
    public static void main(String[] args) {


        MyparentClass p1 = new MyparentClass();
        p1.charger();
        p1.laptop();
        p1.phone();

    }

    public void charger(){

        System.out.println("charger");
    }
    public void laptop(){
        System.out.println("laptop");
    }
    public void phone(){
        System.out.println("phone");
    }
}
