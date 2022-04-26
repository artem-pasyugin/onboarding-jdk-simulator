public class Task {

    public static void main(String[] args) {
        X x = new X();
        System.out.println(x.add());
    }
}

class X {
    private final int a = 3;
    private final int b = 42;
    private int c = 0;

    public int add(){
        c = a + b;
        return c;
    }
}