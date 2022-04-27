public class Student {
    private String name;
    private int grade;

    /**
     * Обязательный конструктор
     *
     * @param name имя
     */
    public Student(String name) {
        this.name = name;
    }

    /**
     * Опциональный конструктор
     *
     * @param name  имя
     * @param grade курс
     */
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Меня зовут %s, я учусь на %s курсе".formatted(name, grade);
    }
}
