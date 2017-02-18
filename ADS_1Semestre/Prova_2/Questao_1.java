
package Prova_2;

import java.util.Scanner;

public class Questao_1 {

     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int i, a, fat = 1;
        
        System.out.println("Digite o número para calcular o fatorial: ");
        a = input.nextInt();
        
        if(a == 0) {
            
            a = 1;
            System.out.println("O fatorial de número é: " + a);
        } else {
            
            for(i = 1; i <= a; i++) {
                
                fat *= i;
            }
            
            System.out.println("O fatorial do número é: " + fat);
        }
    }
}
