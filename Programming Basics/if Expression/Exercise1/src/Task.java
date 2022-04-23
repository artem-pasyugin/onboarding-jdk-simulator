public class Task {

    public static void main(String[] args) {
        System.out.println(checkSign(-19)); // негатив
    }

    static String checkSign(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }
}