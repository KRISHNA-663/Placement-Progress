public class number_zig_pattern {
    public static void main(String[] args) {
        int start = 1;
        int increment = 2;

        for (int i = 1; i <= 5; i++) { // The outer loop for 5 rows
            int num = start;
            for (int j = i; j <= 5; j++) { // The inner loop for printing the numbers in each row
                System.out.print(num + " ");
                num += increment; // Increment the number to get the next value in the row
                increment++; // Increase the increment for the next number in the row
            }
            start++; // Move the start to the next number for the new row
            increment = start + 1; // Reset increment for the next row
            System.out.println();
        }
    }
}
