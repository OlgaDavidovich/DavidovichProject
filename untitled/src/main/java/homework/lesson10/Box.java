package homework.lesson10;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    ArrayList<T> box = new ArrayList<>();

    public float getTotalWeight() {
        float totalWeight;
        if (!box.isEmpty()) {
            totalWeight = box.size() * box.get(0).getWeight();
        } else {
            totalWeight = 0;
        }
        return totalWeight;
    }

    public boolean compare(Box otherbox) {
        if (getTotalWeight() == otherbox.getTotalWeight()) {
            return true;
        } else {
            return false;
        }
    }

    public void moveFruits(Box<T> otherbox) {
        otherbox.box.addAll(box);
        box.clear();
    }

    public void add(T Fruit) {
        box.add(Fruit);
    }
}
