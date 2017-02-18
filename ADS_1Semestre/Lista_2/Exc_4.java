
package Lista_2;

import java.util.Scanner;

public class Exc_4 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Informe a quantidade de maças compradas: ");
          int qt = sc.nextInt();
          
          if (qt < 12) {
               
               double macas = 1.3;
               double custo = macas * qt;
               
               System.out.println("O valor a ser pago pela compra é de R$" +custo);
          } else {
               
               double macas = 1;
               double custo = macas * qt;
               
               System.out.println("O valor a ser pago pela compra é de R$" +custo);
          }
     }
}
