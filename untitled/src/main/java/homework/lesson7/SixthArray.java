package homework.lesson7;

public class SixthArray {
    public static void main(String[] args) {
        int[] array2 = {2, 4, 6, 7, 8, 9, 0};
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        int[] array3 = moveElements(array2, 15);
        for (int j = 0; j < array3.length; j++) {
            System.out.print(array3[j] + " ");
        }
    }
    public static int[] moveElements(int[] array, int n) {

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int x = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = x;
            }
        } else {
            for (int i = 0; i > n; i--) {
                int x = array[0];
                for (int j = 1; j < array.length; j++) {
                    array[j - 1] = array[j];
                }
                array[array.length - 1] = x;
            }
           }  return array;
    }
}

