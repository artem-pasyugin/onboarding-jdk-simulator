public class TrueOrFalse {

    public static void main(String[] args) {
        int b = 1;

        // b строго меньше 3
        System.out.println(trueOrFalse(b < 3));
        // b больше или равно 3
        System.out.println(trueOrFalse(b >= 3));
    }

    static String trueOrFalse(boolean exp) {
        if (exp) {
            return "Это корректно!";
        }
        return "Это некорректно!";
    }
}
