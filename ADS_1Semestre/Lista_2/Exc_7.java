
package Lista_2;

import java.util.Scanner;

public class Exc_7 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          int numero;
          int maior = 0;
          int intermediario = 0;
          int menor = 0;
          
          for (int i = 0; i < 3; i++) {
               
               System.out.println("Informe o "+(i + 1)+"º número: ");
               numero = sc.nextInt();
              
               if (numero > maior) {
                    
                    int aux = maior;
                    maior = numero;
                    int aus = intermediario;
                    intermediario = aux;
                    menor = aus;
               } else {
                    
                    if ((numero <= maior) && (numero >= intermediario)) {
                         
                         int aux = intermediario;
                         intermediario = numero;
                         menor = aux;
                    } else {
                         
                         menor = numero;
                    }
               }
          }
          
          System.out.println("\n");
          System.out.print("Maior número: " +maior+ "\n");
          System.out.print("Número Intermediário: " +intermediario+ "\n");
          System.out.print("Menor número: " +menor+ "\n");
     }
}
