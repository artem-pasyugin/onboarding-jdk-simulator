public class Animals {

    public static void main(String[] args) {
        //Создаем объекты классов
        Cat cat = new Cat();
        Dog dog = new Dog();
        Hamster hamster = new Hamster();

        /*
        Вывод в консоль название класса и адрес объекта в оперативной памяти
        Пример: Cat@18d93b30
        */
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(hamster);

        //Основные функции классов
        System.out.println(cat.meow());
        System.out.println(dog.bark());
        System.out.println(hamster.exercise());
    }
}