// 3. Write a java program which asks the user to enter his/her name and greets them with "Hello <name>, have a good day".

import java.util.Scanner; 
public class problem_03 {
    public static void main(String[] args) {       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ", have a good day!");
        scanner.close();
    }
}

// Output:
// Please enter your name: James
// Hello James, have a good day!