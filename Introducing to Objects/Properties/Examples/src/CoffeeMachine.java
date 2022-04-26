public class CoffeeMachine {

   public static void main(String[] args) {
      //Первый вариант установки заполненности
      Cup1 cup1 = new Cup1();
      cup1.percentFull = 100;
      System.out.println(cup1.percentFull);

      //Второй вариант установки заполненности
      Cup2 cup2 = new Cup2();
      cup2.setPercentFull(100);
      System.out.println(cup2.getPercentFull());
   }
}