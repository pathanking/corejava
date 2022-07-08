package core.strings;

public class StringDemo3 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("hello");
        String string = builder.reverse().toString();
        System.out.println(string);

        //text-blocks since Java 14
        String str =
                """ 
                                         hello world!! 
                                         Welcome to Java 18!
                                         Java is easy to learn
                                         Java is a distributed language
                                         It support multithreading out-of-box 
                        """;
        System.out.println(str);
        System.out.println(str.lines().count());
        System.out.println(str.strip());
    }
}