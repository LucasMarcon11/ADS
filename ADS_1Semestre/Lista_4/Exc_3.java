
package Lista_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exc_3 {

     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Digite um texto qualquer: ");
          String texto1 = br.readLine();
          
          System.out.println("Escreva um texto qualquer que será incluso no primeiro texto: ");
          String texto2 = br.readLine();
          
          System.out.println("Informe a posição onde o texto será incluso: ");
          int posicao = sc.nextInt();
          
          String aux = texto1.substring(posicao, texto1.length());
          texto1 = texto1.substring(0, posicao) + texto2;
          texto1 += aux;
          
          System.out.println(texto1);
     }
}
