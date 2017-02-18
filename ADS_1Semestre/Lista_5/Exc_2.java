
package Lista_5;

import java.util.Scanner;

public class Exc_2 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          System.out.print("\t* ================================== *\n");
          System.out.print("\t* =====    Escolha um mês...   ===== *\n");
          System.out.print("\t* ================================== *\n");
          System.out.print("\t* =====       1) Janeiro       ===== *\n");
          System.out.print("\t* =====       2) Fevereiro     ===== *\n");
          System.out.print("\t* =====       3) Março         ===== *\n");
          System.out.print("\t* =====       4) Abril         ===== *\n");
          System.out.print("\t* =====       5) Maio          ===== *\n");
          System.out.print("\t* =====       6) Junho         ===== *\n");
          System.out.print("\t* =====       7) Julho         ===== *\n");
          System.out.print("\t* =====       8) Agosto        ===== *\n");
          System.out.print("\t* =====       9) Setembro      ===== *\n");
          System.out.print("\t* =====       10) Outubro      ===== *\n");
          System.out.print("\t* =====       11) Novembro     ===== *\n");
          System.out.print("\t* =====       12) Dezembro     ===== *\n");
          System.out.print("\t* ================================== *\n");
          System.out.print("\t* ================================== *\n");
          System.out.print("\t* ================================== *\n");
          System.out.print("\t* Mês: "); int mes = sc.nextInt();
          System.out.println("");
          
          switch (mes) {
               
               case 1: case 2: case 6: case 7: case 12:
                    
                    System.out.println("\tMês de alta temporada.");
                    
                    break;
               default:
                    System.out.println("\tMês de baixa temporada.");
          }
     }
}