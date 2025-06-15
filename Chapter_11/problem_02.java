// 3/5. Create a class monkey with jump() and bite() methods, create a class human which inherits this monkey class and implements BasicAnimal interface with eat() and sleep() methods, also demonstrate polymorphism.

package Chapter_11;
interface BasicAnimal {
    void eat();
    void sleep();
}
class Monkey {
    void jump() {
        System.out.println("Monkey is jumping...");
    }
    void bite() {
        System.out.println("Monkey is biting...");
    }
}
class Human extends Monkey implements BasicAnimal {
    @Override
    public void eat() {
        System.out.println("Human is eating...");
    }
    @Override
    public void sleep() {
        System.out.println("Human is sleeping...");
    }
    void speak() {
        System.out.println("Human is speaking...");
    }
}
public class problem_02 {
    public static void main(String[] args) {
        Human human = new Human();       
        human.jump();       // Monkey class methods
        human.bite(); 
        human.eat();        // BasicAnimal interface methods
        human.sleep();
        human.speak();      // Human-specific method
        // polymorphism 
        Monkey m1 = new Human();
        m1.jump();
        m1.bite();
        // m1.speak(); --> Cannot speak method bcz the reference is monkey which dows not have speak method.
        BasicAnimal john = new Human();
        john.eat();
        john.sleep();
        // john.speak() --> error
    }
}
// Output:
// Monkey is jumping...
// Monkey is biting... 
// Human is eating...  
// Human is sleeping...
// Human is speaking...
// Monkey is jumping...
// Monkey is biting... 
// Human is eating...  
// Human is sleeping...