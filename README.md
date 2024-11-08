import java.util.Scanner;

public class ArrayTable {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        
        // Create a 2D array with the specified rows and columns
        int[][] array = new int[rows][columns];
        
        // Populate the 2D array using a nested for loop
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = i * j;  // Set each element to i * j
            }
        }
        
        // Print the 2D array in a table-like format
        System.out.println("\nGenerated Table (i * j):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "\t");  // Print each element with tab space
            }
            System.out.println();  // Move to the next line after each row
        }
        
        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}
