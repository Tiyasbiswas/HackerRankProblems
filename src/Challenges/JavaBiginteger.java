package Challenges;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBiginteger {

    /*
     In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.
    Use the power of Java's BigInteger class and solve this problem.
    Input Format There will be two lines containing two numbers,a and b .
    Constraints :a and b are non-negative integers and can have maximum 200 digits.
         */
    static void main(String[] args) {
        //There will be two lines containing two numbers, a andb .
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        in.close();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
