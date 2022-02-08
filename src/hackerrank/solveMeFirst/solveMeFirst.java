package hackerrank.solveMeFirst;

import java.util.Scanner;

public class solveMeFirst {

    static int solveMeFirst(int a, int b) {
        if (a <= 100 && b <= 00 && b >= 1 && a >= 1) {
            return a + b;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}
