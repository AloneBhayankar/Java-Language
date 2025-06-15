// 3. Create a class square with a method to initialize the side of the square, calculate the area and perimeter.

import java.util.Scanner;
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class problem_03 {
    public static void main(String[] args) {
        square sq = new square();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        sq.side = sc.nextInt();
        System.out.println("Area of the square: "+sq.area());
        System.out.println("Perimeter of the square: "+sq.perimeter());
        sc.close();
    }
}
// Output:
// Enter the side of the square: 3
// Area of the square: 9     
// Perimeter of the square: 12