package com.fizzbuzz;

public class FizzBuzz {
   public String have_Fizz(int numb) {

      if (numb % 3 == 0 && numb % 5 == 0) {
         return "Fizzbuzz";
      }

      if (numb % 3 == 0) {
         return "Fizz";
      }

      if (numb % 5 == 0) {
         return "Buzz";
      }

      return Integer.toString(numb);
   }

}
