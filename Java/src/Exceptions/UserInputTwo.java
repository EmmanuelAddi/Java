package Exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInputTwo {
    public static void main(String[] args) throws Exception
    {
        int n = 0;
        System.out.println("Enter your age ");

        try (BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));)
        {
            n = Integer.parseInt(bufferedReader.readLine());
        }

        System.out.println(n);
    }
}
