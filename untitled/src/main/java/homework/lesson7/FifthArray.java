package homework.lesson7;


import java.sql.Array;

public class FifthArray {
    public static void main(String[] args) {
   int [] array2 = createArray(7,5);
   for (int i = 0; i< array2.length; i++){
   System.out.print(array2 [i] + " ");
    }
    }
    public static int [] createArray (int len, int initialValue){
        int [] array = new int[len];
        for (int i = 0; i < array.length; i++){
           array[i] = initialValue;
        }
        return array;
    }
}
