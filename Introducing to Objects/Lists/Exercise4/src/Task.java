import java.util.List;

public class Task {

    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "d", "e").subList(1, 3);

        System.out.println(list);
    }
}