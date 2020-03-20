package Exceptions;

import java.util.Scanner;

//Scanner does not need Exceptions
public class ScannerDemo {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("Enter a number ");

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        System.out.println("The number is: " + n);
    }
}
