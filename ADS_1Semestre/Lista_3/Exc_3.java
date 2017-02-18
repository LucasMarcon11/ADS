
package Lista_3;

import java.util.Scanner;

public class Exc_3 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          int operacao;
          double alcool = 1.9;
          double gasolina = 2.5;
          boolean interruptor = false;
          
          System.out.print("Preço do álcool: " +alcool+ "\n\n");
          System.out.print("Preço da gasolina: " +gasolina+ "\n");
          
          do {
               
               System.out.print("Abastecer: 1 - Álcool || 2 - Gasolina. -> ");
               operacao = sc.nextInt();
               
               if ((operacao != 1) && (operacao != 2)) {
                    
                    System.out.println("Informe um valor válido!\n");
               } else {
                    
                    interruptor = true;
               }
          } while (interruptor == false);
          
          
          System.out.print("Informe a quantidade de litros a ser abastecido: ");
          int litros = sc.nextInt();
          
          if (operacao == 1) {
               
               double valor;
               
               if (litros <= 20) {
                    
                    valor = (alcool += alcool * 0.03) * litros;
               } else {
                    
                    valor = (alcool += alcool * 0.05) * litros;
               }
               
               System.out.printf("O valor a ser pago pelo litro do álcool é de R$ %.2f", valor);
               System.out.println("");
          } else {
               
               double valor;
               
               if (litros <= 20) {
                    
                    valor = (gasolina += gasolina * 0.04) * litros;
               } else {
                    
                    valor = (gasolina += gasolina * 0.06) * litros;
               }
               
               System.out.printf("O valor a ser pago pelo litro da gasolina é de R$ %.2f", valor);
               System.out.println("");
          }
     }
}