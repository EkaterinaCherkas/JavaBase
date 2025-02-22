package Task9;

public class YearName {
    public static void main(String[] args) {
        int y = 2025;
        checkYear(y);
    }
    public static boolean checkYear(int y) {
        boolean result;
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            result = true;
            System.out.println(y + " Год високосный");
            }
        else{
            System.out.println(y + " Год не високосный");
            result = false;
        }
        return result;
    }
}
