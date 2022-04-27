package example;                                   // [1]

import example.constants.Months;                   // [2]
import static example.constants.Months.FEBRUARY;   // [3]

public class Main {

   public static void main(String[] args) {
      System.out.println(Math.PI);                 // [4]
      System.out.println(Months.JANUARY);          // [5]
      System.out.println(FEBRUARY);                // [6]
   }
}