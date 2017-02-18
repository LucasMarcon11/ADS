
package Lista_2;

import java.util.Scanner;

public class Exc_1 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Informe um número: ");
          int num = sc.nextInt();
          
          if (num < 0) {
               
               System.out.println("O número " +num+ " é negativo.");
          } else {
               
               System.out.println("O número " +num+ " é positivo.");
          }
     }
}
