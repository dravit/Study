public class Main {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        System.out.println(s1.intern() == s2);
    }
}

class Test {
    protected int x,y;
}
