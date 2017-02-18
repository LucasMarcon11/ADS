
package Lista_7;

import java.util.Scanner;

public class Exc_3 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Informe o valor do lado: ");
          double lado = sc.nextInt();
          
          double volume = Math.floor(Math.pow(lado, 3));
          
          System.out.println("O volúme de água é de: " +volume);
     }
}
