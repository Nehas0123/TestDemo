package src;

public class Mulidimensional {

    public static void main(String[] args) {

        int a[][] = new int[5][5];
        a[0][0] = 1;
        a[1][0] = 2;
        a[2][0] = 3;

        int b[][] = {{2,3,5},{3,5,7},{6,8,9}};

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {

                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

    }
}
