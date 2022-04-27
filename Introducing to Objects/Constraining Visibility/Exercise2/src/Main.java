public class Main {

    public static void main(String[] args) {
        printPositive(-10);
    }

    static void printPositive(int x) {
        if (x <= 0) {
            System.out.printf("Некорректные вводные: %s должен быть положительным", x);
            return;
        }
        System.out.println(x);
    }
}