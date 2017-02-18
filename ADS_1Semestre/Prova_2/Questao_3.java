
package Prova_2;

import java.util.Scanner;

public class Questao_3 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          int numSort = (int) (Math.random() * 10) + 1;
          
          int tentativas = 0;
          boolean acertou = false;
          
          while (acertou == false) {
               
               int numDigit = 0;
               boolean interruptor = false;
               
               do {
                    
                    System.out.print("Tente adivinhar o número. Chute entre 0 e 10: ");
                    numDigit = sc.nextInt();
                    
                    if ((numDigit < 0) || (numDigit > 10)) {
                         
                         System.out.println("Digite um número válido.\n\n");
                    } else {
                         
                         interruptor = true;
                    }
               } while (interruptor == false);
               
               if (numDigit == numSort) {
                    
                    tentativas++;
                    System.out.println("\n");
                    System.out.print("* ==================================================== *\n");
                    System.out.print("* ===== Você acertou em um total de " +tentativas+ " tentativas ===== *\n");
                    System.out.print("* ==================================================== *\n");
                    
                    acertou = true;
               } else {
                    
                    if (numDigit > numSort) {
                         
                         System.out.println("Chute acima do número sorteado.\n\n");
                    } else {
                         
                         System.out.println("Chute abaixo do número sorteado.\n\n");
                    }
                    
                    tentativas++;
               }
          }
     }
}
