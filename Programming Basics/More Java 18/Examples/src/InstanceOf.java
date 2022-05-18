import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanceOf {

    public static void main(String[] args) {
        processValue("Hello instanceOf");
        processValue(LocalDateTime.now());
        processValue(5);
        processValue(new Object());
    }

    static void processValue(Object obj) {
        if (obj instanceof String s) {
            System.out.printf("String: %s\n", s);
        } else if (obj instanceof LocalDateTime date) {
            System.out.printf("Date: %s\n", DateTimeFormatter.ISO_DATE.format(date));
        } else if (obj instanceof Number number && number.intValue() > 1) {
            System.out.printf("Number: %d\n", number);
        } else {
            System.out.println("Something else");
        }
    }
}
