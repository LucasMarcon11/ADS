
package Lista_7;

public class Exc_1 {

     public static void main(String[] args) {
          
          for (int i = 1; i <= 10; i++) {
               
               int dado = (int) (Math.random() * 6) + 1;
               
               System.out.println("Na " +i+ "ª jogada, o dado apresenta o número: " +dado);
          }
     }
}
