package homework.lesson7;

public class FourthArray {
    public static void main(String[] args) {
        int[][] array = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i == j ) || ((i+j) ==(array.length -1))){
                    array[i][j] =1;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
