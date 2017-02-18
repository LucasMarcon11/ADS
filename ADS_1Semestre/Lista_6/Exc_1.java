
package Lista_6;

import java.util.Scanner;

public class Exc_1 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          System.out.print("Digite um número: ");
          int n = sc.nextInt();
          
          int soma = 0;
          
          if (n > 0) {
               
               for (int i = 1; i <= n; i++) {
                    
                    soma += i;
               }
               
               System.out.println("A soma dos números é: " +soma+ ".");
          } else {
               
               System.out.println("Número inválido.");
          }
     }
}
