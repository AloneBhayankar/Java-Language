// 1. Create a class employee with following properties and methods:
// Salary (property)(int) -- getSalary (method returning int)
// name (property)(String) -- getName (method returning String)
// setSalary (method changing salary) -- setName (method changing name)

import java.util.Scanner;
class Employee {
    int salary;
    String name;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int s) {
        this.salary = s;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }
}
public class problem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.print("Enter employee name: ");         // Input name
        String name = scanner.nextLine();
        emp.setName(name);
        System.out.print("Enter employee salary: ");       // Input salary
        int salary = scanner.nextInt();
        emp.setSalary(salary);
        System.out.println("\nEmployee Details:");        // Output details
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        scanner.close();
    }
}
// Output:
// Employee Details:
// Name: James  
// Salary: 25000