package homework.lesson11;

public class MainArray {

    private static int sum;

    public static int inputArray(String[][] array) throws MyArraySizeException, MyArrayDataException {

        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(String.format("Incorrect data in the field [%d,%d]", i, j));
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        String[][] arr1 = new String[][]{{"1", "1", "1", "c"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        String[][] arr2 = new String[][]{{"1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        try {
            int sum = inputArray(arr);
            System.out.println("Sum of elements is " + sum);
        } catch (MyArraySizeException ex) {
            System.err.println("Incorrect size of array.");
        } catch (MyArrayDataException ex) {
            System.err.println(ex.getMessage());
        }
        try {
            int sum1 = inputArray(arr1);
            System.out.println("Sum of elements is " + sum1);
        } catch (MyArraySizeException ex) {
            System.err.println("Incorrect size of array.");
        } catch (MyArrayDataException ex) {
            System.err.println(ex.getMessage());
        }
        try {
            int sum2 = inputArray(arr2);
            System.out.println("Sum of elements is " + sum2);
        } catch (MyArraySizeException ex) {
            System.err.println("Incorrect size of array.");
        } catch (MyArrayDataException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
