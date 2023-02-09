package com.fizzbuzz;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       FizzBuzz checkResult = new FizzBuzz();
       for (int index = 0; index < 101; index++) {
        String result = checkResult.have_Fizz(index);
        System.out.println(result);
        
       }
    }
}
