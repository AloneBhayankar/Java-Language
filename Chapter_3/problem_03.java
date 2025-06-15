// 3. Write a java program to fill in a letter template which looks like below:
// letter = "Dear </name>, thanks a lot!"
// replace <name> with a string (your name)
package Chapter_3;
public class problem_03 {
    public static void main(String[] args) {
        String letter = "Dear </name>, thanks a lot!"; 
        letter = letter.replace("</name>", "James"); 
        System.out.println(letter); // Output: Dear James, thanks a lot!
    }
}
