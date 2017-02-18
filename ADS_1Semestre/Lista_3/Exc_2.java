
package Lista_3;

import java.util.Scanner;

public class Exc_2 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Informe o valor do produto: ");
          double valor = sc.nextDouble();
          
          if (valor < 20) {
               
               valor += valor * 0.45;
          } else {
               
               valor += valor * 0.3;
          }
          
          System.out.println("O valor da compra está em R$ " +valor+ ".");
     }
}
