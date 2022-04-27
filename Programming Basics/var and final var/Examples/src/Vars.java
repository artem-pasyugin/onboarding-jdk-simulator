public class Vars {

    public static void main(String[] args) {
        final var whole = 11;                    // [1]
        var fractional = 1.4;                    // [2]
        fractional = 1.5;                        // [3]
        var words = "Что-то здесь, что-то там";  // [4]
        System.out.println(whole);
        System.out.println(fractional);
        System.out.println(words);
    }
}