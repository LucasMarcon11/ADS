package Prova_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Questao_3 {

     public static void main(String[] args) throws IOException {

          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          Scanner sc = new Scanner(System.in);

          System.out.print("Digite o primeiro número: ");
          int n1 = sc.nextInt();

          System.out.print("Digite o segundo número: ");
          int n2 = sc.nextInt();

          System.out.print("Digite: a (soma) || b (subtração) || c (multiplicação) || d (divisão) -> ");
          String op = br.readLine();

          int resultado = 0;

          switch (op) {

               case "a":

                    resultado = n1 + n2;
                    break;

               case "b":

                    resultado = n1 - n2;
                    break;

               case "c":
                    
                    resultado = n1 * n2;
                    break;

               case "d":
                    
                    resultado = n1 / n2;
                    break;
                    
               default:
                    
                    System.out.println("Operação inválida!");
                    break;
          }
          
          System.out.println("Resultado: " +resultado);
     }
}
