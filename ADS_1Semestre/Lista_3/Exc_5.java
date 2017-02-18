
package Lista_3;

import java.util.Scanner;

public class Exc_5 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Informe sua idade: ");
          int idade1 = sc.nextInt();
          
          System.out.println("Informe sua idade: ");
          int idade2 = sc.nextInt();
          
          System.out.println("Informe sua idade: ");
          int idade3 = sc.nextInt();
          
          int mediaIdade = (idade1 + idade2 + idade3) / 3;
          
          if (mediaIdade < 25) {
               
               System.out.println("Turma jovem. Média de idade: " +mediaIdade);
          } else {
               
               if ((mediaIdade >= 25) && (mediaIdade <= 40)) {
                    
                    System.out.println("Turma adulta. Média de idade: " +mediaIdade);
               } else {
                    
                    System.out.println("Turma idosa. Média de idade: " +mediaIdade);
               }
          }
     }
}
