import java.util.List;

public class Task {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 2);
        int count = countMatches(integers, 2);

        System.out.println(count);
    }

    /**
     * Количество совпадений элементов из списка по значению
     *
     * @param integers список целых чисел
     * @param number   значение элемента для сравнения
     * @return количество совпадений
     */
    private static int countMatches(List<Integer> integers, int number) {
        //TODO
        return 0;
    }
}