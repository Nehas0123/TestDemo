package src;

public class ConceptArray {

    public static void main(String[] args) {

        int a[] = {2,34,456,45,77};

        for (int i = a.length-1; i>=0; i--) {
            System.out.println(a[i]);

        }
        int b[] = new int[10];
        b[7] = 3;

        for (int i = 0; i<= b.length; i++) {
            System.out.println(b[i]);

        }
    }
}
