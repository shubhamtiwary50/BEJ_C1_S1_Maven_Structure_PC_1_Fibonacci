package org.niit;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int number = scanner.nextInt();
        Fibonacci fibonacci =new Fibonacci();
        int[] fibonacciNum = fibonacci.fibonacci(number);
        for (int i : fibonacciNum) {
            System.out.print(" " + i);
        }
    }
}
