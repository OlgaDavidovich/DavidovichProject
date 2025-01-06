package homework.lesson7;

public class CheckPosOrNeg {
    public static void main(String[] args) {
        isPositiveOrNegative(25);

    }
    public static void isPositiveOrNegative(int x) {
        if (x>=0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }

}
