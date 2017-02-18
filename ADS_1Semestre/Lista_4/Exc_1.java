
package Lista_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exc_1 {

     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          System.out.println("Digite qualquer texto: ");
          String texto = br.readLine();
          
          String palavraInvertida = "";
          int aux = texto.length() - 1;
          
          while (aux >= 0) {
               
               palavraInvertida += String.valueOf(texto.charAt(aux));
               aux--;
          }
          
          System.out.println("Palavra invertida: " +palavraInvertida);
     }
}
