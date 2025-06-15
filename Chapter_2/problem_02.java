// 2. Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade. 
package Chapter_2;
public class problem_02 {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char)(grade + 8);      // Encrypting the grade
        System.out.println("Encrypted grade: " + grade);     
        grade = (char)(grade - 8);      // Decrypting the grade
        System.out.println("Decrypted grade: " + grade);
    }
}

// Output:
// Encrypted grade: J
// Decrypted grade: B
