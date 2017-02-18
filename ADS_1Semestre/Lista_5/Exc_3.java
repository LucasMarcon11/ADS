
package Lista_5;

import java.util.Scanner;

public class Exc_3 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Informe um dia: ");
          int dia = sc.nextInt();
          
          switch (dia) {
               
               case 1: case 2: case 3: case 4: case 5:
                    
                    System.out.println("Dia útil/Dia de semana.");
                    
                    break;
               case 6: case 7:
                    
                    System.out.println("Fim de semana.");
                    
                    break;
               default:
                    
                    System.out.println("Dia inválido.");
                    
                    break;
          }
     }
}