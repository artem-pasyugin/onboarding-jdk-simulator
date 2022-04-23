public class PositiveOrNegativeOrZero {

    public static void main(String[] args) {
        int n = -11;

        if (n > 0) {
            System.out.println("Это позитивное значение");
        } else if (n == 0) {
            System.out.println("Это ноль");
        } else {
            System.out.println("Это негативное значение");
        }
    }
}