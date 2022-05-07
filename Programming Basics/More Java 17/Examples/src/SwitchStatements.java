public class SwitchStatements {
    enum Animal {
        DOG, CAT, PARROT, GOLDFISH
    }

    public static void main(String[] args) {
        System.out.printf("Количество ног у собаки %s\n", getCountLegs(Animal.DOG));
        System.out.printf("Количество ног у кошки %s\n", getCountLegs(Animal.CAT));
        System.out.printf("Количество ног у попугая %s\n", getCountLegs(Animal.PARROT));
        // ошибка вышла!
        System.out.printf("Количество ног у золотой рыбки %s\n", getCountLegs(Animal.GOLDFISH));
    }

    static int getCountLegs(Animal pet) {
        return switch (pet) {
            case DOG, CAT -> 4;
            case PARROT -> {
                System.out.println("Попка-дурак!");
                yield 2;
            }
            case GOLDFISH -> throw new IllegalArgumentException("Ноги у рыбов?! Красивое…");
        };
    }
}
