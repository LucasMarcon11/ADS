package Trabalho_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JogoDaForca {

     public static void main(String[] args) throws IOException {

          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          Scanner sc = new Scanner(System.in);

          int vidas;
          int quemJoga = 1;
          int jogador1 = 0;
          int jogador2 = 0;
          boolean parar = false;
          
          do {
               
               String palavra;
               String palavraEncriptada = "";
               String letras = "";
               
               System.out.print("O jogador " + quemJoga + " deve escolher a palavra/frase/letra: ");
               palavra = br.readLine();
               
               System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

               String aux = "";
               for (int i = 0; i < palavra.length(); i++) {

                    if (String.valueOf(palavra.charAt(i)).equals(" ")) {

                         palavraEncriptada += " ";
                    } else {

                         palavraEncriptada += "_ ";
                    }

                    if (!" ".equals(String.valueOf(palavra.charAt(i)))) {

                         aux += String.valueOf(palavra.charAt(i)) + " ";
                    } else {

                         aux += " ";
                    }
               }

               palavra = aux;

               System.out.print("Quantas tentativas são permitidas pós erro? ");
               vidas = sc.nextInt();

               System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

               int pontos = 0;
               int aus = palavra.replace(" ", "").length();

               while (vidas > 0) {

                    boolean acertou = false;
                    
                    System.out.println("Letras jogadas: " +letras);
                    System.out.println("Palavra encriptada: " + palavraEncriptada + "\n");
                    System.out.print("Digite uma letra: "); String tentativa = br.readLine();
                    
                    letras += tentativa + "; ";
                    System.out.println("\n");
                    
                    for (int i = 0; i < palavra.length(); i++) {

                         if (String.valueOf(palavra.charAt(i)).equals(tentativa)) {

                              String anterior = palavraEncriptada.substring(0, i);
                              String posterior = palavraEncriptada.substring(i + 1);
                              palavraEncriptada = anterior + tentativa + posterior;

                              pontos++;
                              acertou = true;
                         }
                    }

                    if (aus == pontos) {
                         
                         if (quemJoga == 1) {
                              
                              jogador1++;
                         } else {
                              
                              jogador2++;
                         }
                         
                         break;
                    }

                    if (acertou == false) {

                         vidas--;
                    }
               }

               if (vidas > 0) {

                    System.out.println("\n\n");
                    System.out.print("\t* ----------------------------- *\n");
                    System.out.print("\t* ---- O JOGADOR " + quemJoga + " VENCEU! ---- *\n");
                    System.out.print("\t* ----------------------------- *\n");
                    System.out.println("\n\n");
                    
                    System.out.print("\t* ----------------------------- *\n");
                    System.out.print("\t* PALAVRA: \t" +palavraEncriptada+ "\n");
                    System.out.print("\t* ----------------------------- *\n");
                    
                    System.out.println("\n\n");
                    System.out.print("\t* ----------------------------- *\n");
                    System.out.print("\t* ----------- PLACAR ---------- *\n");
                    System.out.print("\t* ----------------------------- *\n");
                    System.out.print("\t* ----------------------------- *\n");
                    System.out.print("\t* -------- JOGADOR 1) " +jogador1+ " ------- *\n");
                    System.out.print("\t* ----------------------------- *\n");
                    System.out.print("\t* -------- JOGADOR 2) " +jogador2+ " ------- *\n");
                    System.out.print("\t* ----------------------------- *\n");
                    System.out.print("\t* ----------------------------- *\n");
                    System.out.println("\n\n");

               } else {

                    System.out.println("\n\n");
                    System.out.print("\t* ----------------------------- *\n");
                    System.out.print("\t* ---- O JOGADOR " + quemJoga + " PERDEU! ---- *\n");
                    System.out.print("\t* ----------------------------- *\n");
                    System.out.println("\n\n");
                    
                    System.out.print("\t* ----------------------------- *\n");
                    System.out.print("\t* ----------- PLACAR ---------- *\n");
                    System.out.print("\t* ----------------------------- *\n");
                    System.out.print("\t* ----------------------------- *\n");
                    System.out.print("\t* -------- JOGADOR 1) " +jogador1+ " ------- *\n");
                    System.out.print("\t* ----------------------------- *\n");
                    System.out.print("\t* -------- JOGADOR 2) " +jogador2+ " ------- *\n");
                    System.out.print("\t* ----------------------------- *\n");
                    System.out.print("\t* ----------------------------- *\n");
                    System.out.println("\n\n");
               }

               if (quemJoga == 1) {

                    quemJoga++;
               } else {

                    quemJoga--;
               }
          } while (parar == false);
     }
}
