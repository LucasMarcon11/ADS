
package Prova_1;

import java.util.Scanner;

public class Questao_1 {

     public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        
        int x, y;
        
        System.out.println("Digite o valor de X para calcular sua orientação no plano cartesiano: ");
        x = ent.nextInt();
        
        System.out.println("Digite o valor de Y para calcular sua orientação no plano cartesiano: ");
        y = ent.nextInt();
        

        
        if((x == 0) && (y == 0)) {
            
            System.out.println("O X e o Y estão no ponto original.");
        } else {
            
            if((x > 0) && (y == 0)) {
                
                System.out.println("O ponto está no eixo X.");
            } else {
                
                if((x == 0) && (y > 0)) {
                    
                    System.out.println("O ponto está no eixo Y.");
                } else {
                    
                    if((x < 0) && (y == 0)) {
                        
                        System.out.println("O ponto está no eixo X.");
                    } else {
                        
                        if((x == 0) && (y < 0)) {
                            
                            System.out.println("O ponto está no eixo Y.");
                        } else {
                            
                            if((x > 0) && (y > 0)) {
                        
                                System.out.println("Os pontos X e Y estão no 1º Quadrante.");
                            } else {

                                if ((x < 0) && (y > 0)) {

                                    System.out.println("Os pontos X e Y estão no 2º Quadrante.");
                                } else {

                                    if((x < 0) && (y < 0)) {

                                        System.out.println("Os pontos X e Y estão no 3º Quadrante.");
                                    } else {

                                        if((x > 0) && (y < 0)) {

                                            System.out.println("Os pontos X e Y estão no 4º Quadrante.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
