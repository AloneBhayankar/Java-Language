// 2. Write a java program to replace spaces with underscore.
package Chapter_3;
public class problem_02 {
    public static void main(String[] args) {
        String str = " Hello , World! "; 
        str = str.replace(" ", "_"); 
        System.out.println(str); // Output:_Hello_,_World!_
    }
}
