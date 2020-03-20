package Exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//BufferedReader
//Scanner

public class UserInput {
    public static void main(String[] args) throws Exception
    {

        System.out.println("Enter your age ");

        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        System.out.println(n);
    }
}
