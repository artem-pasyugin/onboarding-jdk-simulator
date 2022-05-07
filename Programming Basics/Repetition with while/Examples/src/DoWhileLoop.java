public class DoWhileLoop {

    public static void main(String[] args) {
        int i = 0;
        // Начало цикла - выполняется минимум один раз
        do {
            System.out.println(".");
            // Шаг для завершения цикла
            i += 10;
            // Условия продолжения цикла
        } while (i < 100);
    }
}
