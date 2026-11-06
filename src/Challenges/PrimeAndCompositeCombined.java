package Challenges;

public class PrimeAndCompositeCombined {
     static void main(String[] args) {
        System.out.println("===Numbers 1 to 100 ===");

        StringBuilder primesList = new StringBuilder("• First 25 primes (1 to 100): ");
        System.out.println("\n• Composite Numbers (Not Prime):");

        int compositeLineCounter = 0;
        for (int n = 1; n <= 100; n++) {
            // Case 1:number 1 (neither prime nor composite)
            if (n == 1) {
                continue;
            }
            // Case 2: The number 2 only even prime
            if (n == 2) {
                primesList.append(n).append(", ");
                continue;
            }

            // Case 3: All other even numbers immediately as composites
            if (n % 2 == 0) {
                printCompositeFactors(n, 2, n / 2);
                compositeLineCounter++;
                if (compositeLineCounter % 5 == 0) System.out.println();
                continue;
            }

            // Case 4: Run the optimized loop for odd numbers
            boolean isPrime = true;
            int maxLimit = (int) Math.sqrt(n);

            for (int i = 3; i <= maxLimit; i += 2) {
                if (n % i == 0) { // It's composite!
                    isPrime = false;
                    printCompositeFactors(n, i, n / i);
                    compositeLineCounter++;
                    if (compositeLineCounter % 5 == 0) System.out.println();
                    break; // Stop looking for more factors once one pair is found
                }
            }
            // Case 5: If no factors were found in the loop, it's prime
            if (isPrime) {
                primesList.append(n).append(", ");
            }
        }

        // Clean up the trailing comma on the primes list and print it
        String finalPrimes = primesList.toString().replaceAll(", $", "");
        System.out.println("\n\n" + finalPrimes);
    }
    private static void printCompositeFactors(int target, int factor1, int factor2) {
        System.out.print(target + " (" + factor1 + " x " + factor2 + ")  ");
    }
}
