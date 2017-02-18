
package Lista_6;

import java.util.Scanner;

public class Exc_4 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          double soma = 0;
          
          for (int i = 1; i <= 4; i++) {
               
               System.out.println("Digite o " +i+ " número: ");
               double n = sc.nextDouble();
               
               soma += n;
          }
          
          System.out.println("A média aritimética desses números é: " +(soma / 4));
     }
}
