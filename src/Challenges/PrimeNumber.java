package Challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.classfile.instruction.SwitchCase;
import java.math.BigInteger;

/*
A prime number is a natural number greater than  whose only positive divisors are 1 and itself.
For example, the first six prime numbers are 2,3,5,7,11,13 and .
Given a large integer,n, use the Java BigInteger class' isProbablePrime method to determine
and print whether it's prime or not prime.
 */
public class PrimeNumber {
    static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println(checkNumberIsPrime(num));
//------
   //Solution : HackerRank passed
        // 1. Read the input line as a String
        String nStr = bufferedReader.readLine().trim();
        // 2. Convert it to a BigInteger to safely hold up to 100 digits
        BigInteger n = new BigInteger(nStr);
        // 3. Use isProbablePrime with a certainty of 100
        if (n.isProbablePrime(100)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
//----------------
        bufferedReader.close();
    }
//Solution: normal solution
    private static String checkNumberIsPrime(int n) {
        if (n <= 1) return "Not prime"; // Check if it expects "not prime" lowercase instead
        if (n == 2 || n == 3) return "prime";
        if (n % 2 == 0 || n % 3 == 0) return "Not prime";

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return "Not prime";
            }
        }
        return "prime";
    }

}
