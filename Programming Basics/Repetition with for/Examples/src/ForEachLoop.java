public class ForEachLoop {

    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i : array) {
            array[i] = i;
        }
    }
}
