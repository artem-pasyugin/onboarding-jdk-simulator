public class PositiveOrNegativeOrZero {

    public static void main(String[] args) {
        System.out.println(checkSign(-11));
    }

    /**
     * Проверка на положительное и отрицательное число, иначе 0.
     *
     * @param number - целое число
     * @return результат проверки
     */
    static String checkSign(int number) {
        if (number > 0) {
            return "Это положительное значение";
        } else if (number == 0) {
            return "Это ноль";
        } else {
            return "Это негативное значение";
        }
    }
}