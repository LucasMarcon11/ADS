
package Lista_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exc_1 {

     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          Scanner sc = new Scanner(System.in);
          
          double cargaHoraria = 80;
          
          System.out.println("Informe o nome do aluno: ");
          String aluno = br.readLine();
          
          System.out.println("Informe a frequência do aluno em %: ");
          double frequencia = sc.nextDouble();
          
          if (((frequencia / 100) * cargaHoraria) < 60) {
               
               System.out.println("O aluno " +aluno+ " foi reprovado por baixa frequência. ");
          } else {
               
               System.out.println("Informe a 1ª nota: ");
               double nota1 = sc.nextDouble();

               System.out.println("Informe a 2ª nota: ");
               double nota2 = sc.nextDouble();

               System.out.println("Informe a 3ª nota: ");
               double nota3 = sc.nextDouble();
               
               double media = (nota1 + nota2 + nota3) / 3;
               
               if (media < 7) {
                    
                    System.out.println("O aluno " +aluno+ " foi reprovado por média " +media+ ".");
               } else {
                    
                    System.out.println("O aluno " +aluno+ " foi aprovado por média " +media+ ".");
               }
          }
     }
}