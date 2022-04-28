public class Task {

    public static void main(String[] args) {
        bar();
    }

    static void foo() {
        throw new IllegalStateException("Что-то пошло не так");
    }

    static void bar() {
        foo();
    }
}