package Task5;

public class SumCheck {
    public static void main(String[] args) {
        int a = 13;
        int b = 30;
        System.out.println(checkUp(a, b));
    }

    public static Boolean checkUp(int a, int b) {
        boolean result;
        int c = a + b;
        if (c >= 10 && c <= 20) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}


