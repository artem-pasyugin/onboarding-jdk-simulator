public class Main {

    /**
     * Расчет средней прибыли
     *
     * @param income общая прибыль
     * @param months количестов месяцев
     * @return средняя прибыль
     */
    static int averageIncome(int income, int months) {
        if (months == 0) {
            throw new IllegalArgumentException("Количество месяцев не может быть 0");    // [1]
        }

        return income / months;
    }

    /**
     * Расчет первой прибыли
     *
     * @param income общая прибыль
     * @return первая прибыль
     * @throws CustomDateException - исключение в расчете
     */
    static int firstIncome(int income) throws CustomDateException {                      // [2]
        if (income == 0) {
            throw new CustomDateException("Нету прибыли");                               // [3]
        }

        return income / 12;
    }

    public static void main(String[] args) {
        System.out.println(averageIncome(10_000, 1));

        try {                                                                            // [4]
            System.out.println(firstIncome(10_000));
        } catch (CustomDateException e) {                                                // [5]
            System.out.println("Ошибка: " + e.getMessage());                             // [6]
        }
    }
}