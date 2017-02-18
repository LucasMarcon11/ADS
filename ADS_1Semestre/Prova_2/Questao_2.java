
package Prova_2;

import java.util.Scanner;

public class Questao_2 {

     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int i, n, a = 0;
        
        System.out.println("Digite um número para testar se ele é primo ou não: ");
        n = input.nextInt();
        
        if(n <= 1) {
            
            System.out.println("Não é um número primo!");
        } else {
            
            for(i = 1; i <= n; i++) {
                
                if((n % i) == 0) {
                    
                    a++;
                    i++;
                } 
            }
            
            if(a != 2) {
                
                System.out.println("Não é primo.");
            } else {
                
                System.out.println("É primo.");
            }
        }
    }
}
