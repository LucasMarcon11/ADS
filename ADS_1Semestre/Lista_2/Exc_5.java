
package Lista_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exc_5 {

     public static void main(String[] args) throws IOException {
          
          Scanner sc = new Scanner(System.in);
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          System.out.println("Informe o total gasto: ");
          double total = sc.nextInt();
          
          System.out.println("Deseja contribuir com uma gorjetinha? (s || n)");
          String operacao = br.readLine().toLowerCase();
          
          if (operacao.equals("s")) {
               
               double gorjeta = total / 10;
               total += gorjeta;
               
               System.out.println("O total pago cliente é de R$ " +total+ " e a gorjeta é de R$ " +gorjeta);
          } else {
               
               System.out.println("O total pago pelo cliente é de R$ " +total);
          }
     }
}
