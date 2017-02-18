
package Lista_7;

public class Exc_2 {

     public static void main(String[] args) {
          
          int maior = 0;
          int menor = 0;
          
          for (int i = 0; i < 10; i++) {
               
               int numero = (int) (Math.random() * 100) + 1;
               
               if (i == 0) {
                    
                    maior = numero;
                    menor = numero;
               } else {

                    System.out.println("Números gerados aleatóriamente: " +numero);
                    maior = (int) (Math.max(maior, numero));
                    menor = (int) (Math.min(menor, numero));
               }
          }
          
          System.out.println("");
          System.out.println("Maior número: " +maior);
          System.out.println("Menor número: " +menor);
     }
}
