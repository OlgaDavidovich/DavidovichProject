package homework.lesson10;

public class Main {

    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Apple apple7 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();

        Box<Apple> apBox1 = new Box<>();
        Box<Apple> apBox2 = new Box<>();
        Box<Orange> orBox1 = new Box<>();
        Box<Orange> orBox2 = new Box<>();

        apBox1.add(apple1);
        apBox1.add(apple2);
        apBox1.add(apple3);
        apBox2.add(apple4);
        apBox2.add(apple5);
        apBox2.add(apple6);
        apBox2.add(apple7);
        orBox1.add(orange1);
        orBox1.add(orange2);
        orBox1.add(orange3);
        orBox2.add(orange4);
        orBox2.add(orange5);

        System.out.println(apBox1.getTotalWeight());
        System.out.println(apBox2.getTotalWeight());
        System.out.println(orBox1.getTotalWeight());
        System.out.println(orBox2.getTotalWeight());

        System.out.println(apBox1.compare(orBox1));
        System.out.println(apBox1.compare(orBox2));

        apBox1.moveFruits(apBox2);
        System.out.println(apBox1.getTotalWeight());
        System.out.println(apBox2.getTotalWeight());

        apBox2.moveFruits(apBox1);
        System.out.println(apBox1.getTotalWeight());
        System.out.println(apBox2.getTotalWeight());


    }
}
