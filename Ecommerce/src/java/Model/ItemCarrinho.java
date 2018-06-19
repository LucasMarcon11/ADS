
package Model;

/**
 *
 * @author LucasMarcon
 */
public class ItemCarrinho {

    private Produto produto;
    private Integer quantidade;

    public ItemCarrinho(Produto produto) {
        this.produto = produto;
        quantidade = 1;
    }

    public ItemCarrinho(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    public void aumentarQuantidade() {
        this.quantidade++;
    }
    
    public void diminuirQuantidade() {
        this.quantidade--;
    }
    
    public double valorTotal() {
        double valor = getQuantidade() * produto.getPreco();
        return valor;
    }
}
