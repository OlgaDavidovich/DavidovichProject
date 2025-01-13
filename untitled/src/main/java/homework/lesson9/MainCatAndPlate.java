package homework.lesson9;

public class MainCatAndPlate {

    public static void main(String[] args) {
        Cat murzik = new Cat("murzik", 50);
        Cat murzik1 = new Cat("murzik1", 15);
        Cat murzik2 = new Cat("murzik2", 10);
        Cat murzik3 = new Cat("murzik3", 24);
        Plate plate = new Plate(40);
        Cat[] arrayOfCats = new Cat[4];
        arrayOfCats[0] = murzik;
        arrayOfCats[1] = murzik1;
        arrayOfCats[2] = murzik2;
        arrayOfCats[3] = murzik3;

        for (Cat x : arrayOfCats) {
            x.eat(plate);
            x.infoCat();
        }

    }
}
