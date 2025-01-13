package homework.lesson9;

public class Dog extends Animal {

    static int countDog = 0;

    public Dog(String name) {
        super(name);
        countDog++;
    }

    @Override
    public void run(int length) {
        if (length <= 0) {
            System.out.println("I'm standing still");
        } else if (length <= 500) {
            System.out.println(" I can run " + length + " m.");
        } else {
            System.out.println("Sorry, I'm tired.");
        }
    }

    @Override
    public void swim(int length) {
        if (length <= 0) {
            System.out.println("I'm standing still");
        } else if (length <= 10) {
            System.out.println(" I can swim " + length + " m.");
        } else {
            System.out.println("Sorry, I'm tired.");
        }
    }
}