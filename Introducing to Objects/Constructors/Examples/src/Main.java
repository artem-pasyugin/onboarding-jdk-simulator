public class Main {

    public static void main(String[] args) {
        //Представляем нового научного сотрудника
        Scientist scientist = new Scientist("Петр Петров Петрович");
        System.out.println(scientist);

        //Представляем студента для научных работ
        Student student = new Student("Егор Егоров Егорович", 5);
        System.out.println(student);
    }
}