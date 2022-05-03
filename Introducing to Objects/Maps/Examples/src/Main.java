import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();                          // [1]
        map.put("a", "Пример А");                                           // [2]

        String defaultValue = "Дефолтное значение";
        if (map.get("a") != null) {                                         // [3]
            String resultB = map.getOrDefault("b", defaultValue);           // [4]

            System.out.println("Результат равен дефолтному значению: " +
                    resultB.equals(defaultValue));                          // [5]
        }
    }
}