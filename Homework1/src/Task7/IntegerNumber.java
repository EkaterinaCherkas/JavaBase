package Task7;

public class IntegerNumber {
    public static void main(String[] args) {
        int d = -300;
        System.out.println((refundAnswer(d)));
    }

    public static boolean refundAnswer(int d){
        boolean result;
        if (d >= 0 ){
           result = false;
        }
        else {
            result = true;
        }
        return result;
    }
}
