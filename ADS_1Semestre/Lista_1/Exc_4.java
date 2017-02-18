
package Lista_1;

import java.util.Scanner;

public class Exc_4 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Informe o valor do salário mínimo: ");
          double minimo = sc.nextDouble();
          
          System.out.println("Informe o quanto ganha: ");
          double salario = sc.nextDouble();
          
          double quantidade = salario / minimo;
          System.out.println("A quantidade de salários mínmos recebido é: " +quantidade);
     }
}
