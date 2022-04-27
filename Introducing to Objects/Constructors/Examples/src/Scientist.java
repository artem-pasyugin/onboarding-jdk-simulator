public class Scientist {
    private String name;

    /**
     * Обязательный конструктор
     *
     * @param name имя
     */
    public Scientist(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Меня зовут %s".formatted(name);
    }
}
