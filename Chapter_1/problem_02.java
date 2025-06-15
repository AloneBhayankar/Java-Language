// 2. Write a program to calculate CGPA using marks of three subjects (out of 100).     // cspell:ignore CGPA

public class problem_02 {   
    public static void main(String[] args) {
        int sub1 = 76;
        int sub2 = 85;
        int sub3 = 0;
        float cgpa = (sub1 + sub2 + sub3) / 30.0f;
        System.out.printf("CGPA: %.2f\n", cgpa);
    }
}

// Output: CGPA: 5.37