package core.strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("hello");
        builder.append(" world!");

        System.out.println(builder); //hello or hello world!

        String string = new String("hello");
        string.concat(" world!"); //hello world! will garbage collected

        System.out.println(string); //hello or hello world!
    }
}
