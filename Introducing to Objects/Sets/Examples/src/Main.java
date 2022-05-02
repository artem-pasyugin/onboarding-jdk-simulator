import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // список целых чисел с дублирующими элементами
        var arrayList = List.of(1, 1, 2, 3, 9, 9, 4);
        // преобразование в множество
        var intHashSet = new HashSet<>(arrayList);                                  // [1]
        // сравнение с результатом
        assert intHashSet.equals(Set.of(1, 2, 3, 9, 4, 5)) : "Нету совпадения";     // [2]
        // преобразование в отсортированное множество
        var intTreeSet = new TreeSet<>(arrayList);                                  // [3]
        // сравнение с результатом
        assert intTreeSet.equals(Set.of(1, 2, 3, 4, 9)): "Нету совпадения";         // [4]
    }
}