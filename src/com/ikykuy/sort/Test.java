package com.ikykuy.sort;

import edu.princeton.cs.algs4.StdOut;

public class Test {

    public static void main(String argv[]) {

        int f = 0, g = 1;
        for (int i = 0; i <=15 ;i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }

        double t = 9.0;
        while (Math.abs(t - 9.0/ t) > .001) {
            t = (9.0/t + t) / 2.0;
        }
        StdOut.printf("%.5f\n", t);

        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j =0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);


        System.out.println('b');
        System.out.println('b'+'c');
        System.out.println((char)('a'+4));

        System.out.println(exR1(6));
        System.out.println(mystery(2, 25));
        System.out.println(mystery(3, 11));


    }

    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2);
    }

    public static int mystery(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b % 2 == 0) {
            return mystery(a+a, b/2);
        }
        return mystery(a+a, b/2) + a;
    }
}
