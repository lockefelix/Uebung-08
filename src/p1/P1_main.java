package p1;

public class P1_main {
    public static void main(String[] args) {
        int a = getNumber(5);
        IO.println(a);
    }

    public static int getNumber(int a) {
        return a < 42 ? 42 : 0;
    }
}