public class ForEachLoop {

    public static void main(String[] args) {
        // объявление массива из 10 ячеек
        int[] array = new int[10];

        // чтение массива и установка нового значения
        for (int i : array) {
            array[i] = i;
        }
    }
}
