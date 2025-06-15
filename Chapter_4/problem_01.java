// 1.What will be the output of the following code? |single = is assignment operator |
// int a = 10;                                      |double == is comparison operator|
// if (a = 11) {                        
//     system.out.println("I am 11");
// }
// else {
//     system.out.println("I am not 11");
// }
package Chapter_4;
public class problem_01 {
    public static void main(String[] args) {
        int a = 10;
        if (a == 11) {
            System.out.println("I am 11");
        } else {
            System.out.println("I am not 11");
        }
    }
}
// output: I am not 11