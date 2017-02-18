
package Lista_6;

import java.util.Scanner;

public class Exc_5 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          int maior = 0;
          int menor = 0;
          
          for (int i = 0; i < 10; i++) {
               
               System.out.println("Digite um número: ");
               int n = sc.nextInt();
               
               if (i == 0) {
                    
                    maior = n;
                    menor = n;
               } else {
                    
                    if (n > maior) {
                         
                         maior = n;
                    } else {
                         
                         if (n < menor) {
                              
                              menor = n;
                         }
                    }
               }
          }
          
          System.out.println("");
          System.out.println("Maior número: " +maior);
          System.out.println("Menor número: " +menor);
     }
}
