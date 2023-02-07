package com.fizzbuzz;

public class App 
{
    public static void main( String[] args )
    {
        
        FizzBuzz checking = new FizzBuzz();
        for (int i = 1; i <= 100; i++) {
            String result = checking.FizzBuzzCheck(i);
            System.out.println(result);
        }
        }
}