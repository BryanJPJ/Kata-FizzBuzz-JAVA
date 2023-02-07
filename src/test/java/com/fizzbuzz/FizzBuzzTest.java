package com.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
    
    @Test
    public void test_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.FizzBuzzCheck(3);
        assertEquals("fizz", result);
    }
    @Test
    public void test_Buzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.FizzBuzzCheck(5);
        assertEquals("buzz", result);
    }
    @Test
    public void test_FizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.FizzBuzzCheck(15);
        assertEquals("fizzbuzz", result);
    }
    @Test
    public void test_return_SameNumber(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.FizzBuzzCheck(1);
        assertEquals("1", result);
    }
    /**
     * 
     */
    @Test
    public void test_appWorks(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        for (int i = 1; i <= 100; i++) {
            System.out.println( fizzbuzz.convert(i) );
        }
    }
}