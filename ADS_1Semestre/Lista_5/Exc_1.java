
package Lista_5;

import java.util.Scanner;

public class Exc_1 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Informe o ano: ");
          int ano = sc.nextInt();
          
          System.out.println("Informe o mês: ");
          int mes = sc.nextInt();
          
          int dias = 31;
          
          switch (mes) {
               
               case 2:
                    
                    if ((ano % 4) == 0) {
                         
                         dias -= 2;
                    } else {
                         
                         dias -= 3;
                    }
               
                    break;
               case 4: case 6: case 9: case 11:
                    
                    dias--;
                    
                    break;
          }
          
          System.out.println("O mês possui " +dias+ " dias.");
     }
}
