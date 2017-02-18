
package Lista_6;

import java.util.Scanner;

public class Exc_8 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Digite um número para calcular a sua tabuada: ");
          int n = sc.nextInt();
          
          System.out.println("");
          for (int i = 0; i <= 10; i++) {
               
               System.out.println(n+ " x " +i+ " = " +(n * i));
          }
     }
}
