// 5 Find the value of 'a' in expression given below: int x = 7              
//                                                    int a = 7*49/7 + 35/7
package Chapter_2;
public class problem_05 {
    public static void main(String[] args) {
        int a = 7 * 49 / 7 + 35 / 7;
        System.out.println("The value of a is: " + a);
    }
}

// Output: 54
// 7 * 49 = 343
// 343 / 7 = 49
// 35 / 7 = 5
// 49 + 5 = 54