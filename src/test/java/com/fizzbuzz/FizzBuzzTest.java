package com.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
    FizzBuzz fizzBuzztest = new FizzBuzz();

    
    @Test
    public void test_fizzbuzz_divisible_both() {
       String result =fizzBuzztest.have_Fizz(15);

        assertEquals("Fizzbuzz", result);
    }


       
    @Test
    public void test_fizzbuzz_divisible_3() {
       String result =fizzBuzztest.have_Fizz(3);

        assertEquals("Fizz", result);
    }



       
    @Test
    public void test_fizzbuzz_divisible_5() {
       String result =fizzBuzztest.have_Fizz(5);

        assertEquals("Buzz", result);
    }

}
