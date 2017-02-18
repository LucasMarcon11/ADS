
package Lista_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exc_6 {

     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          System.out.println("Digite algo: ");
          String texto = br.readLine().toLowerCase();
          
          texto = texto.replace(" ", "");
          
          int j = 0;
          int contador = 0;
          
          for (int i = texto.length() - 1; i >= 0; i--) {
               
               if (String.valueOf(texto.charAt(i)) .equals(String.valueOf(texto.charAt(j)))) {
                    
                    j++;
                    contador++;
               }
          }
          
          if (contador == texto.length()) {
               
               System.out.println("O texto é um palíndromo.");
          } else {
               
               System.out.println("Não é um palíndromo.");
          }
     }
}
