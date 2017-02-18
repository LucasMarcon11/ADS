
package Lista_1;

public class Exc_5 {

     public static void main(String[] args) {
          
          double prestacoes = 12;
          double prestPagas = 5;
          double valorAtualPrestacao = 30;
          double totalPago = valorAtualPrestacao * prestPagas;
          double saldoDevedor = ((prestacoes - prestPagas) * valorAtualPrestacao);
          
          System.out.println("O total pago até o momento é de R$" +totalPago+ " e o saldo devedor é de R$" +saldoDevedor);
     }
}
