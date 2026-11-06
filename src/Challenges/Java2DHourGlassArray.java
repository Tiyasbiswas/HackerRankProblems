package Challenges;

import java.util.Scanner;

public class Java2DHourGlassArray {
  /* Step:1 To find the maximum hourglass sum in a 2D array,we need to traverse the matrix
    using a nested loop, calculate the sum of each valid hourglass shape, and keep
   track of the maximum value found.*/
    static void main(String[] args) {
/*
Stencil Row	Array Code used above	What it means
Top 3 Squares    :	matrix[r][c], matrix[r][c+1], matrix[r][c+2]	Same row r, moving right 3 squares.
Middle 1 Square  :	matrix[r+1][c+1]	Go down 1 row, go right 1 column.
Bottom 3 Squares :	matrix[r+2][c], matrix[r+2][c+1], matrix[r+2][c+2]	Go down 2 rows, moving right 3 squares.
*/

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrayLength = scan.nextInt();
        // 1. Create a blank 6x6 grid
        int[][] matrix = new int[arrayLength][arrayLength];
        // 2. Read the input stream to fill the grid
        for (int row = 0; row < arrayLength; row++) {
            for (int column = 0; column < arrayLength; column++) {
                matrix[row][column] = scan.nextInt();
            }
        }
        scan.close(); // Close the scanner to free resources
        // 3. Keep track of the high score (handles negative totals safely)
        int maxHighScore = Integer.MIN_VALUE;
        // 4. Slide the stencil across all 16 valid anchor spots
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {

                // Add up the 7 squares inside the hourglass
                int top    = matrix[r][c]   + matrix[r][c+1]   + matrix[r][c+2];
                int mid    = matrix[r+1][c+1];
                int bot    = matrix[r+2][c] + matrix[r+2][c+1] + matrix[r+2][c+2];

                int currentTotal = top + mid + bot;
                // Keep the biggest score
                if (currentTotal > maxHighScore) {
                    maxHighScore = currentTotal;
                }
            }
        }
        // 5. Print the ultimate winner to the platform console
        System.out.println(maxHighScore);

    }
}
/*
Hacker Rank Solutions:

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> arr = new ArrayList<>();
        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        // --- HOURGLASS LOGIC START ---
        // 1. Initialize high score tracking at the absolute minimum value
        int maxHighScore = Integer.MIN_VALUE;

        // 2. Slide the 3x3 stencil through the 6x6 List of Lists
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {

                // 3. Extract and sum the 7 slots using .get(row).get(column)
                int top = arr.get(r).get(c)   + arr.get(r).get(c+1)   + arr.get(r).get(c+2);
                int mid = arr.get(r+1).get(c+1);
                int bot = arr.get(r+2).get(c) + arr.get(r+2).get(c+1) + arr.get(r+2).get(c+2);

                int currentTotal = top + mid + bot;

                // 4. Update tracking if a new high score is found
                if (currentTotal > maxHighScore) {
                    maxHighScore = currentTotal;
                }
            }
        }
        // 5. Print the exact answer expected by the grading system
        System.out.println(maxHighScore);
        // --- HOURGLASS LOGIC END ---
    }
}

 */