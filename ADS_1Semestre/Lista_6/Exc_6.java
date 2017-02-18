
package Lista_6;

public class Exc_6 {

     public static void main(String[] args) {
          
          int quantidade = 0;
          int soma = 0;
          int i = 1;
          
          while (soma <= 250) {
               
               soma += i;
               i++;
               
               quantidade++;
          }
          
          System.out.println(quantidade);
     }
}
