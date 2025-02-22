package Task2;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        checkSumSign();

    }

    public static void checkSumSign() {
        int a = 3;
        int b = -6;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
