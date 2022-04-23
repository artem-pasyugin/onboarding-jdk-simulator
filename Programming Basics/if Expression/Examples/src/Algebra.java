public class Algebra {

    public static void main(String[] args) {
        System.out.printf("Время 9 утра, магазин открыт %s\n\n", isOpen(9));

        System.out.printf("Время 14 дня, магазин открыт %s\n\n", isOpen(14));

        System.out.printf("Время 20 вечера, магазин открыт %s\n\n", isOpen(20));
    }

    static boolean isOpen(int hour) {
        int open = 9;
        int closed = 20;

        boolean isOpen = false;

        //магазин работает
        if (hour >= open && hour < closed) {
            //рабочее время
            if (hour != 14) {
                System.out.println("Открыто");
                isOpen = true;
            } else {
                //перерыв
                System.out.println("Технический перерыв");
            }
        } else {
            //закрыто
            System.out.println("Закрыто");
        }

        // время открытия ИЛИ закрытия магазина
        if (hour == open || hour == closed) {
            System.out.println("Настройка кассы");
        }

        return isOpen;
    }
}
