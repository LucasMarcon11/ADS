
package Lista_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exc_2 {

     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          System.out.print("Digite qualquer texto: ");
          String texto = br.readLine();
          
          System.out.println("\n");
          System.out.print("Qual frase/palavra/letra do texto deseja substituir? ");
          String a = br.readLine();
          
          System.out.println("\n");
          System.out.print("Qual frase/palavra/texto será a substituta? ");
          String b = br.readLine();
          
          System.out.println("\n");
          texto = texto.replace(a, b);
          
          System.out.println(texto);
     }
}
