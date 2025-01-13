package homework.lesson9;

public class Animal {

    private int length;
    private String name;
    static int countAn = 0;

    public Animal(String name) {
        this.name = name;
        countAn++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int length) {

        System.out.println(" I can run " + length + " m.");
    }

    public void swim(int length) {

        System.out.println(" I can swim " + length + " m.");
    }
}

