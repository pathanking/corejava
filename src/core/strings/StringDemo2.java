package core.strings;

public class StringDemo2 {
    public static void main(String[] args) {
        String str = "hello"; //inside constant pool of heap

        String str2 = new String("hello");//inside
        String str3 = "hello";
        String str4 = "hello";
        str = str.concat(" raza!");

        System.out.println(str.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());

        System.out.println(str  == str2); //false
        System.out.println(str == str3); //true
        System.out.println(str3 == str4); //true
    }
}
