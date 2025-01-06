package homework.lesson7;

public class VisokYear {
    public static void main(String[] args) {
        System.out.println(checkvisokYear(600));
    }
    public static boolean checkvisokYear (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
