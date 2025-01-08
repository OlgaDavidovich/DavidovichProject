package homework.lesson7;

public class CheckPosOrNegBoolean {
    public static void main(String[] args) {
        System.out.println(isNegative(-96));
    }
    public static boolean isNegative(int x) {
        if (x>=0) {
            return true;
        }
        return false;
    }
}
