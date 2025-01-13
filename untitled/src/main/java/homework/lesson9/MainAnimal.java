package homework.lesson9;

public class MainAnimal {

    public static void main(String[] args) {
        Dog bobik = new Dog("bobik");
        bobik.run(50);
        bobik.swim(25);
        Cat murzik = new Cat("murzik", 10);
        murzik.run(50);
        murzik.swim(120);
        Cat murzik1 = new Cat("murzik1", 15);
        murzik.run(100);
        murzik.swim(5);

        int countAn = Animal.countAn;
        int countDog = Dog.countDog;
        int countCat = Cat.countCat;

        System.out.println(countAn);
        System.out.println(countDog);
        System.out.println(countCat);
    }
}
