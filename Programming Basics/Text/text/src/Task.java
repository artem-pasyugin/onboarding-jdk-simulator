class Task {
    static final String result = "Hello World!";

    /**
     * Размер текста
     *
     * @return число с размером текста
     */
    public int length() {
        return 0;
    }


    /**
     * Сложение двух текстов
     *
     * @param anotherText - текст для сложения
     * @return новый текст
     */
    public String textPlus(String anotherText) {
        return result;
    }

    /**
     * Создается новый текст в новой области памяти
     *
     * @return новый текст
     */
    public String textNew() {
        return result;
    }

    /**
     * Сравнение текста
     *
     * @param anotherText - текст для сравнения
     * @return true или false
     */
    public boolean textEquals(String anotherText) {
        return false;
    }

    /**
     * Преобразование в верхний регистр
     *
     * @return Пример: hello world! -> HELLO WORLD!
     */
    public String textUpperCase() {
        return result;
    }
}