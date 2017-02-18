
package Lista_2;

import java.util.Scanner;

public class Exc_3 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Informe um ano para calcular se é bissexto: ");
          int ano = sc.nextInt();
          
          if ((ano % 4) == 0) {
               
               System.out.println("O ano de " +ano+ " é bissexto.");
          } else {
               
               System.out.println("O ano de " +ano+ " não é bissexto.");
          }
     }
}
