// 4. Create a Java program to add two matrices of size 2x3.
package Chapter_6;
public class problem_04 {
    public static void main(String[] args) {
        int[][] mat1 = { { 1, 2, 3 },
                { 4, 5, 6 } };
        int[][] mat2 = { { 2, 6, 8 },
                { 3, 7, 1 } };
        int[][] result = { { 0, 0, 0 },
                { 0, 0, 0 } };
        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints a new line
        }
    }
}
// Output:
// Setting value for i=0 and j=0
// Setting value for i=0 and j=1
// Setting value for i=0 and j=2
// Setting value for i=1 and j=0
// Setting value for i=1 and j=1
// Setting value for i=1 and j=2
// 3 8 11
// 7 12 7