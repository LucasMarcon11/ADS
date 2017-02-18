
package Lista_6;

import java.util.Scanner;

public class Exc_10 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Digite a base: ");
          int base = sc.nextInt();
          
          System.out.println("Digite o expoente: ");
          int expoente = sc.nextInt();
          
          if ((base >= 2) && (expoente > 1)) {
               
               int resultado = 1;
               
               for (int i = 0; i < expoente; i++) {
                    
                    resultado *= base;
               }
               
               System.out.println("\nResultado: " +resultado);
          } else {
               
               System.out.println("Base ou expoente inválido(s).");
          }
     }
}
