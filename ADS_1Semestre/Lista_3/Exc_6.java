
package Lista_3;

import java.util.Scanner;

public class Exc_6 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Informe o valor do 1º lado: ");
          int lado1 = sc.nextInt();
          
          System.out.println("Informe o valor do 2º lado: ");
          int lado2 = sc.nextInt();
          
          System.out.println("Informe o valor do 3º lado: ");
          int lado3 = sc.nextInt();
          
          if ((lado1 + lado2) >= lado3) {
               
               if ((lado1 == lado2) && (lado1 == lado3) && (lado2 == lado3)) {
                    
                    System.out.println("O triângulo é equilátero.");
               } else {
                    
                    if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
                         
                         System.out.println("O triângulo é isósceles.");
                    } else {
                         
                         System.out.println("O triângulo é escaleno.");
                    }
               }
          } else {
               
               System.out.println("Não é um triângulo.");
          }
     }
}
