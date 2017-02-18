
package Lista_1;

import java.util.Scanner;

public class Exc_6 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Informe o tempo gasto com a viagem: ");
          double tempo = sc.nextInt();
          
          System.out.println("Informe a velocidade média durante a viagem: ");
          double velocidadeMedia = sc.nextInt();
          
          double distancia = tempo * velocidadeMedia;
          double litrosUsados = distancia / 12;
          
          System.out.println("A quantidade de litros gasta na viagem é de: " +litrosUsados);
     }
}
