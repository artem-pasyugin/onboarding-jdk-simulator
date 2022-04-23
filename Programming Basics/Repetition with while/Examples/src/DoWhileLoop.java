public class DoWhileLoop {

    public static void main(String[] args) {
        int i = 0;
        do {                              // Начало цикла - выполняется минимум один раз
            System.out.println(".");
            i += 10;                      // Шаг для завершения цикла
        } while (i < 100);                // Условия продолжения цикла
    }
}
