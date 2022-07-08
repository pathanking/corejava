package core.java8;

@FunctionalInterface
public interface MyFunctionalInterface {
    int add(int a, int b); //SAM
}
class TestFunctionalInterface {
    public static void main(String[] args) {
        MyFunctionalInterface obj = Integer::sum;
        int result = obj.add(20, 30);
        System.out.println("Sum : " + result);
    }
}