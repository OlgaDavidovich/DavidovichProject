package homework.lesson13;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private String name;
    private String number;

    HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

    public void add(String name, String number) {
        if (hashMap.get(name) != null) {
            if (!hashMap.get(name).contains(number)) {
                hashMap.get(name).add(number);
            } else {
                System.out.println("This number already exists");
            }
        } else {
            ArrayList<String> array = new ArrayList<>();
            array.add(number);
            hashMap.put(name, array);
        }
    }

    public void search(String name) {
        System.out.println(hashMap.get(name));
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "255698");
        phoneBook.add("Ivanov", "589636");
        phoneBook.add("Petrov", "789685");
        phoneBook.add("Sidorov", "158789");
        phoneBook.search("Ivanov");
        phoneBook.search("Petrov");
        phoneBook.search("Sidorov");
    }
}
