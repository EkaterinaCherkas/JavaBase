package Task3;

public class DifferentColors {
    public static void main(String[] args) {
       printColor();
    }
    public static void printColor() {
        int value = 99;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 0 && value < 100 ){
            System.out.println("Жёлтый");
        }
        else {
            System.out.println("Зелёный");
        }
    }
}
