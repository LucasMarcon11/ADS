
package Lista_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exc_5 {

     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          System.out.println("Digite algo: ");
          String texto = br.readLine().toLowerCase();
          
          int espacos = 0;
          int vogais = 0;
          int consoantes = 0;
          
          for (int i = 0; i < texto.length() - 1; i++) {
               
               switch (String.valueOf(texto.charAt(i))) {
                    
                    case " ":
                         
                         espacos++;
                         break;
                    case "a": case "e": case "i": case "o": case "u":
                         
                         vogais++;
                         break;
                    default :
                         
                         consoantes++;
                         break;
               }
          }
          
          System.out.println("");
          System.out.println("Espaços: " +espacos);
          System.out.println("Vogais: " +vogais);
          System.out.println("Consoantes: " +consoantes);
     }
}
