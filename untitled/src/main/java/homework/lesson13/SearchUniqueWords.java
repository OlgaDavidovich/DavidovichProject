package homework.lesson13;

import java.util.*;

public class SearchUniqueWords {

    public static void main(String[] args) {
        String[] wordsArray = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Three", "Six", "Eight"};
        HashMap<String, Integer> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        for (String a : wordsArray) {
            arrayList.add(a);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            int count = Collections.frequency(arrayList, arrayList.get(i));
            hashMap.put(arrayList.get(i), count);
        }
        System.out.println(hashMap);
    }
}



