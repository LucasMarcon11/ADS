
package Lista_2;

import java.util.Scanner;

public class Exc_6 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          double salarioBase = 1200;
          double comissao = 0;
          
          System.out.println("Informe o total de vendas no mês de fevereiro em R$: ");
          double totalVendas = sc.nextInt();
          
          if (totalVendas > 2000) {
               
               comissao = totalVendas * 0.10;
               System.out.println("A comissão é de R$ " +comissao+ " sobre o valor de vendas. O "
                                + "salário do funcionário mais a comissão é de R$ " +(totalVendas + comissao));
          } else {
               
               System.out.println("A comissão é de R$ " +comissao+ " sobre o valor de vendas. O "
                                + "salário do funcionário mais a comissão é de R$ " +(totalVendas + comissao));
          }
     }
}
