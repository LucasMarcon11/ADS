
package Lista_1;

import java.util.Scanner;

public class Exc_3 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Informe o seu ano de nascimento: ");
          int ano = sc.nextInt();
          
          System.out.println("Informe o ano atual: ");
          int atual = sc.nextInt();
          
          System.out.println("Sua idade é: " +(atual - ano));
     }
}
