
package Model;

/**
 *
 * @author LucasMarcon
 */
public class Venda {

    private Integer idItemvenda;
    private Integer idProduto;
    private Integer quantidade;

    public Venda() {
    }

    public Venda(Integer idItemvenda, Integer idProduto, Integer quantidade) {
        this.idItemvenda = idItemvenda;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }

    public Integer getIdItemvenda() {
        return idItemvenda;
    }

    public void setIdItemvenda(Integer idItemvenda) {
        this.idItemvenda = idItemvenda;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
