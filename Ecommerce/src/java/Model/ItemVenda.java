
package Model;

/**
 *
 * @author LucasMarcon
 */
public class ItemVenda {

    private Integer idItemVenda;
    private Integer valorProduto;
    private String dataVenda;
    private Cliente cliente;

    public ItemVenda() {
    }

    public ItemVenda(Integer idItemVenda) {
        this.idItemVenda = idItemVenda;
    }

    public ItemVenda(Integer idItemVenda, Integer valorProduto, String dataVenda) {
        this.idItemVenda = idItemVenda;
        this.valorProduto = valorProduto;
        this.dataVenda = dataVenda;
    }

    public ItemVenda(Integer idItemVenda, Integer valorProduto, String dataVenda, Cliente cliente) {
        this.idItemVenda = idItemVenda;
        this.valorProduto = valorProduto;
        this.dataVenda = dataVenda;
        this.cliente = cliente;
    }
    
    public Integer getIdItemVenda() {
        return idItemVenda;
    }

    public void setIdItemVenda(Integer idItemVenda) {
        this.idItemVenda = idItemVenda;
    }

    public Integer getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Integer valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
