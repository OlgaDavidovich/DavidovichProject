package homework.lesson9;

public class Cat extends Animal {

    private int appetite;

    static int countCat = 0;
    boolean isSatisfied = false;

    public Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
        countCat++;
    }

    @Override
    public void run(int length) {
        if (length <= 0) {
            System.out.println("I'm standing still");
        } else if (length <= 200) {
            System.out.println("I can run " + length + " m.");
        } else {
            System.out.println("Sorry, I'm tired.");
        }
    }

    @Override
    public void swim(int length) {

        System.out.println("I can't swim!");
    }

    public static int getCountCat() {

        return countCat;
    }

    public void eat(Plate p) {
        if (!isSatisfied && p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            isSatisfied = true;
        } else {
            System.out.println("There is not enough food!");
        }
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void infoCat() {
        System.out.print("My name is " + getName() + ". ");
        if (isSatisfied) {
            System.out.println("I'm not hungry.");
        } else {
            System.out.println("I'm hungry.");
        }
    }
}
