import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Неизменяемый список из целых чисел
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);             // [1]

        List<Integer> arrayList = new ArrayList<>(list);               // [2]
        sum(arrayList);

        List<Integer> linkedList = new LinkedList<>(list);             // [3]
        sum(linkedList);
    }

    /**
     * Суммирование целых чисел
     *
     * @param integers список целых чисел
     */
    private static void sum(List<Integer> integers) {
        integers.add(6);                                               // [4]
        integers.remove(0);                                      // [5]

        int sumIntegers = integers.stream()                            // [6]
                .mapToInt(Integer::intValue)
                .sum();
        System.out.printf("Сумма чисел: %d\n", sumIntegers);
    }

}