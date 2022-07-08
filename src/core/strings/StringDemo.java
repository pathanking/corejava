package core.strings;

public class StringDemo {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Before Concatenation : "+ str.hashCode());
        str = str.concat(" world!"); //abc world!
        System.out.println("After Concatenation : "+ str.hashCode());

        char[] chars = {'a', 'b', 'c'};
        String str2 = new String(chars);

        System.out.println(str);
        System.out.println(str2);
    }
}
