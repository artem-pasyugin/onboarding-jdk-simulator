public class Task {

    public static void main(String[] args) {
        System.out.println(sumOfFactorials(10));  // 4037913
    }

    static long factorial(int n) {
        var result = 1L;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static long sumOfFactorials(int n) {
        var result = 0L;
        //TODO
        return result;
    }

}