package homework.lesson7;

public class PrintStringNTimes {
    public static void main(String[] args) {
        printWordNTimes("hello", 5);
    }

    public static void printWordNTimes(String word, int times) {
        if (times > 0) {
            for (int i = 1; i <= times; i++) {
                System.out.println(word);
            }
        } else {
            System.out.println("Enter positive number.");
        }
    }
}
