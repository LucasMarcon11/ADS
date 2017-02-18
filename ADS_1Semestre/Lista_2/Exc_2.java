
package Lista_2;

import java.util.Scanner;

public class Exc_2 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Digite um número: ");
          int num = sc.nextInt();
          
          if (num >= 0) {
               
               if ((num % 2) == 0) {
                    
                    System.out.println("O número " +num+ " é par.");
               } else {
                    
                    System.out.println("O número " +num+ " é impar.");
               }
          } else {
               
               System.out.println("Operação realizada somente com números positivos.");
          }
     }
}
