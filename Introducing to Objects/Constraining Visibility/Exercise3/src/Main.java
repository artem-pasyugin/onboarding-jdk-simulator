public class Main {

    static void printPositive(int x) {
        if (x <= 0) {
            System.out.printf("Некорректные вводные: %s должен быть положительным", x);
            return;
        }
        System.out.println(x);
    }

    static void printNegative(int x) {
        if (x >= 0) {
            System.out.printf("Некорректные вводные: %s должен быть отрицательным", x);
            return;
        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        printPositive(-10);
        printNegative(-10);
    }
}