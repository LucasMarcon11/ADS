
package Trabalho_2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author LucasMarcon
 * @date   24/05/2016
 */


public class GrelhaDeCardano {

     public static void main(String[] args) throws IOException {
          
          BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
          
          /* 
          ------------------------------------------------------------------------------------------
               ms -> Mensagem
               msWS -> Mensagem sem espaços
               sizeMsg -> Tamanho da mensagem
               grill -> Grelha
               i, j, k, iMsg, iAlph -> Contadores
               randomness -> Aleatoriedade, dos números gerados
               previous -> Número anterior
               next -> Próximo número
               sizeGrill -> Tamanho da grelha
               sizeAlphabeth -> Tamanho do alfabeto
               g1..g6 -> Variáveis auxiliares
          ------------------------------------------------------------------------------------------
          */
          
          String msg, grill = "", previous, next, g1, g2, g3, g4, g5, g6, alphabeth = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";
          int i = 0, j = 0, k = 0, sizeMsg, sizeGrill, sizeAlphabeth, randomness, iMsg = 0, iAlph;
          
          System.out.print("Mensagem a ser criptografada: ");
          msg = input.readLine().toUpperCase().trim().replace(" ", "");

          sizeMsg = msg.length();
          do {
               
               grill += "X";
               i++;
          } while(i < (sizeMsg * 2));

          do {
               
               randomness = (int) (Math.random() * grill.length());
               
               if(String.valueOf(grill.charAt(randomness)) .equals("X")) {
                    
                    previous = grill.substring(0, randomness);
                    next = grill.substring(randomness + 1);
                    grill = previous + "O" + next;
                    j++;
               }
          } while (j < sizeMsg);
                  
          System.out.print("\nGrade: " + grill);
      
          sizeGrill = grill.length();
          sizeAlphabeth = alphabeth.length();
          do {
               
               switch(String.valueOf(grill.charAt(k))) {
                    
                    case "O":
                         g1 = grill.substring(0, k);
                         g2 = String.valueOf(msg.charAt(iMsg));
                         g3 = grill.substring(k + 1);
                         grill = g1 + g2 + g3;
                         iMsg++;
                         break;
                         
                    case "X":
                         iAlph = (int) (Math.random() * sizeAlphabeth);
                         g4 = grill.substring(0, k);
                         g5 = String.valueOf(alphabeth.charAt(iAlph));
                         g6 = grill.substring(k + 1);
                         grill = g4 + g5 + g6;
                         iAlph++;
                         break;
               }
               
               k++;
               
          } while(k < sizeGrill);
          
          System.out.println("\n" + "Mensagem criptografada: " + grill);
     }
}