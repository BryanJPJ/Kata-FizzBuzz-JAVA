package com.fizzbuzz;

public class FizzBuzz {

    public String FizzBuzzCheck(int numb){
        if(numb % 3 == 0 && numb % 5 == 0){
            return "fizzbuzz";
        }else if(numb % 5 == 0){
            return "buzz";
        }else if(numb % 3 == 0){
            return "fizz";
        }
        return Integer.toString(numb);
    }

    public char[] convert(int i) {
        return null;
    }
}
