import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task {

    private static Map<String, Contact> buildNumberToContactMap(List<Contact> contactList) {
        HashMap<String, Contact> map = new HashMap<>();
        //TODO
        return map;
    }

    public static void main(String[] args) {
        List<Contact> contactList = List.of(
                new Contact("Миша", "8(999)8887766"),
                new Contact("Света", "8(888)7776655")
        );
        var contactsByNumber = buildNumberToContactMap(contactList);
        System.out.println(contactsByNumber);
    }

    private static class Contact {
        private String name;
        private String number;

        public Contact(String name, String number) {
            this.name = name;
            this.number = number;
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "name='" + name + '\'' +
                    ", number='" + number + '\'' +
                    '}';
        }
    }
}