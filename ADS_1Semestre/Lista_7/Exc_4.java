
package Lista_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exc_4 {

     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          System.out.println("Digite algo: ");
          String texto = br.readLine();
          
          String aux = "";
          
          for (int i = texto.length() - 1; i >= 0; i--) {
               
               aux += String.valueOf(texto.charAt(i));
          }
          
          System.out.println(aux);
     }
}
