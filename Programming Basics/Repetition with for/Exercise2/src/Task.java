public class Task {

    public static void main(String[] args) {

        System.out.println(sumOfFactorials(8));
    }

    /**
     * Факториал целого числа
     *
     * @param n - значение факториала
     * @return результат
     */
    static long factorial(int n) {
        var result = 1L;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Сумма результатов факториала
     *
     * @param n - значение факториала
     * @return результат суммы
     */
    static long sumOfFactorials(int n) {
        var result = 0L;
        // TODO
        return result;
    }

}