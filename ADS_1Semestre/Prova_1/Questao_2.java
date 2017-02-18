
package Prova_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questao_2 {

     public static void main(String[] args) throws IOException {
        
        BufferedReader dad = new BufferedReader(new InputStreamReader(System.in));
        
        String t1, t2, aux;
        int t, q;
        
        System.out.print("Digite o texto 1: ");
        t1 = dad.readLine().toUpperCase();
        
        System.out.print("Digite o texto 2: ");
        t2 = dad.readLine().toLowerCase();
        
        t = t1.length() / 2;
        
        aux = t1.substring(t);
        t1 = t1.replace(aux, t2);
        t1 += aux;
        
        System.out.println(t1);  
    }
}
