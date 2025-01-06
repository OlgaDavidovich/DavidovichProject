package homework.lesson7;

public class FirstArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 0, 0, 0, 1, 1, 1};
        for (int i = 0; i < array.length; i++) {
            System.out.print((array[i])+ " ");}
        for (int i = 0; i < array.length; i++) {
               if (array [i]==1){
                   array [i]=0;
            } else {
                   array[i] = 1;
               }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print((array[i])+" ");}
    }
}
