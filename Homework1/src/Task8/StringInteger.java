package Task8;

public class StringInteger {
    public static void main(String[] args) {
        int d = 9;
        String string = "Пряник имбирный - самый вкусный";
        printInConsole(d,string);
    }

    public static void printInConsole(int d,String string){
        for (int i = 0; i < d; i++) {
            System.out.println(string);
        }
    }
}
