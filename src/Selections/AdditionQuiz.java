package Selections;

/**
 * class: AlphabetQuiz
 * description:
 * 1) you will learn what currentTimeMillis() method
 * 2) you will learn how to utilize % mod to generate a remainder
 * 3) you will learn how to cast from long type value to int type value.
 */
import java.util.Scanner;
public class AlphabetQuiz {
    public static void main(String[] args){
       // System.out.println(System.currentTimeMillis());
        long singleDigit = System.currentTimeMillis() % 10;
        long singleDigit2 = System.currentTimeMillis() * 7 % 10;
         Scanner keyboard = new  Scanner(System.in);
         System.out.print("What is " + singleDigit + " + " + singleDigit2 +
                 "? ");
         long answer = keyboard.nextLong();

        System.out.println(singleDigit + " + " + singleDigit2 + " = " + answer
                + " is " + (singleDigit+singleDigit2 == answer));

    }
}
