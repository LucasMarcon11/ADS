
package Trabalho_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Não lembro quando exatamente fizemos esse trabalho, sei que foi beeeeeem no começo do ano letivo.
 * 
 * 
 * 
 * 
 * 
 * 
 * @author Lucas && Sander
 */


public class CNPJ {
    public static void main(String[] args) throws IOException {
      
        BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Digite seu CNPJ: ");
        String cnpj = leitura.readLine();
        
        if((cnpj.length() != 14)){
            System.out.println("CNPJ deve conter 14 dígitos para ser válido."); 
        }
        else{           
            int pos11 = Integer.parseInt(String.valueOf(cnpj.charAt(11))) * 2;
            int pos10 = Integer.parseInt(String.valueOf(cnpj.charAt(10))) * 3;
            int pos9 = Integer.parseInt(String.valueOf(cnpj.charAt(9))) * 4;
            int pos8 = Integer.parseInt(String.valueOf(cnpj.charAt(8))) * 5;
            int pos7 = Integer.parseInt(String.valueOf(cnpj.charAt(7))) * 6;
            int pos6 = Integer.parseInt(String.valueOf(cnpj.charAt(6))) * 7;
            int pos5 = Integer.parseInt(String.valueOf(cnpj.charAt(5))) * 8;
            int pos4 = Integer.parseInt(String.valueOf(cnpj.charAt(4))) * 9;
            int pos3 = Integer.parseInt(String.valueOf(cnpj.charAt(3))) * 2;
            int pos2 = Integer.parseInt(String.valueOf(cnpj.charAt(2))) * 3;
            int pos1 = Integer.parseInt(String.valueOf(cnpj.charAt(1))) * 4;
            int pos0 = Integer.parseInt(String.valueOf(cnpj.charAt(0))) * 5;

            int soma = pos11 + pos10 + pos9 + pos8 + pos7 + pos6 + pos5 + pos4 + pos3 + pos2 + pos1 + pos0;
            
            int resto = soma % 11;
            
            if (resto < 2) {
                int pos12 = Integer.parseInt(String.valueOf(cnpj.charAt(12)));
                if(pos12 != 0){
                    System.out.println("1º Dígito Inválido");
                }
                else{
                    System.out.println("1º Dígito Válido");
                }
            }
            else{
                int pos12 = Integer.parseInt(String.valueOf(cnpj.charAt(12)));
                int dv1 = 11 - resto;
                
                if (pos12 == dv1) {
                    System.out.println("1º Dígito Válido");
                }
                else{
                    System.out.println("1º Dígito Inválido");
                }
            }
            
            int pos12 = Integer.parseInt(String.valueOf(cnpj.charAt(12))) * 2;
            pos11 = Integer.parseInt(String.valueOf(cnpj.charAt(11))) * 3;
            pos10 = Integer.parseInt(String.valueOf(cnpj.charAt(10))) * 4;
            pos9 = Integer.parseInt(String.valueOf(cnpj.charAt(9))) * 5;
            pos8 = Integer.parseInt(String.valueOf(cnpj.charAt(8))) * 6;
            pos7 = Integer.parseInt(String.valueOf(cnpj.charAt(7))) * 7;
            pos6 = Integer.parseInt(String.valueOf(cnpj.charAt(6))) * 8;
            pos5 = Integer.parseInt(String.valueOf(cnpj.charAt(5))) * 9;
            pos4 = Integer.parseInt(String.valueOf(cnpj.charAt(4))) * 2;
            pos3 = Integer.parseInt(String.valueOf(cnpj.charAt(3))) * 3;
            pos2 = Integer.parseInt(String.valueOf(cnpj.charAt(2))) * 4;
            pos1 = Integer.parseInt(String.valueOf(cnpj.charAt(1))) * 5;
            pos0 = Integer.parseInt(String.valueOf(cnpj.charAt(0))) * 6;

            soma = pos12 + pos11 + pos10 + pos9 + pos8 + pos7 + pos6 + pos5 + pos4 + pos3 + pos2 + pos1 + pos0;

            resto = soma % 11;

            if(resto < 2){
                int pos13 = Integer.parseInt(String.valueOf(cnpj.charAt(13)));
                if(pos13 != 0){
                    System.out.println("2º dígito Inválido");
                }
                else{
                    System.out.println("2º dígito Válido");
                }
            }
            else{
                int pos13 = Integer.parseInt(String.valueOf(cnpj.charAt(13)));
                int dv2 = 11 - resto;

                if (pos13 == dv2){
                    System.out.println("2º dígito Válido");
                }
                else{
                    System.out.println("2º dígito Inválido");
                }
            }
        }
    } 
} 