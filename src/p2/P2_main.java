package p2;

public class P2_main {
    public static void main(String[] args) {
        IO.println(shortenToLowerCase("Hallolkoololo", 7));
    }

    public static String shortenToLowerCase(String input, int shortenBy) {
        if (shortenBy >= input.length()) {
            return "";
        }
        String shortened = input.substring(0, input.length() - shortenBy);

        return shortened.toLowerCase();
    }
}