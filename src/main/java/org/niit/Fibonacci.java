package org.niit;

public class Fibonacci {
    public  int[] fibonacci(int number){
        int a = 0;
        int b = 1;
        int c ;
        int[] fiboSeries = new int[number];
        fiboSeries[0] = 0;
        fiboSeries[1] = 1;
//        System.out.print(number1 + " " + number2);

        for (int i = 0; i < number-2; i++) {
            c = a + b;
//            System.out.print(" " + number3);
            fiboSeries[i+2]=c;
            a = b;
            b = c;
        }

        return fiboSeries;
    }
}
