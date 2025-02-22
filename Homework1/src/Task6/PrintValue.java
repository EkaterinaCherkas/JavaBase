package Task6;

public class PrintValue {
    public static void main(String[] args) {
        int d = -33;
        print(d);
    }

    public static void print(int d){
        if (d >= 0 ){
            System.out.println("Положительное число");
        }
        else {
            System.out.println("Отрицательное число");
        }
    }
}
