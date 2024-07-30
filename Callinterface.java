package src;

public class Callinterface implements Myinterface{


    public static void main(String[] args) {

        Myinterface a1=new Callinterface();
        a1.green();
        a1.red();
        a1.blue();
        System.out.println(p);
    }

    @Override
    public void green() {
        System.out.println("green");
    }

    @Override
    public void red() {
        System.out.println("red");
    }

    @Override
    public void blue() {
        System.out.println("blue");
    }
}
