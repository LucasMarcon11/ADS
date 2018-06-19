
package Carrinho;

import Model.ItemCarrinho;
import Model.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author LucasMarcon
 */
public class Carrinho {

    private List<ItemCarrinho> itens;
    private int quantidadeDeItens;
    private double total;

    public Carrinho() {
        itens = new ArrayList<>();
        quantidadeDeItens = 0;
        total = 0;
    }
    
    public synchronized void adicionarItem(Produto produto) {
        
        boolean novoItem = true;
        
        for (ItemCarrinho item : itens) {
            if (Objects.equals(item.getProduto().getId(), produto.getId())) {
                novoItem = false;
                item.aumentarQuantidade();
            }
        }
        
        if (novoItem) {
            ItemCarrinho ic = new ItemCarrinho(produto);
            itens.add(ic); 
            quantidadeDeItens++;
        }
    }
    
    public synchronized void atualizarItem(Produto produto, String quantidade) {
        
        int qt = Integer.parseInt(quantidade);
        
        if (qt >= 0) {
            
            ItemCarrinho ic = null;
            for (ItemCarrinho item : itens) {
                if (Objects.equals(item.getProduto().getId(), produto.getId())) {
                    if (qt != 0) item.setQuantidade(qt);
                    else {
                        ic = item;
                        break;
                    }
                }
            }
            
            if (ic != null) itens.remove(ic);
        }
    }
    
    public synchronized int quantidadeDeItens() {
        
        return quantidadeDeItens;
    }
    
    public synchronized List<ItemCarrinho> itensDoCarrinho() {
        
        return itens;
    }
    
    public synchronized double totalDoProduto() {
        
        return total;
    }
    
    public synchronized double subtotalDoProduto() {
        
        double valor = 0;
        for (ItemCarrinho item : itens) {
            
            Produto produto = (Produto) item.getProduto();
            valor += item.getQuantidade() * produto.getPreco();
        } 
        
        return valor;
    }
    
    public synchronized void limparCarrinho() {
        
        itens.clear();
        quantidadeDeItens = 0;
        total = 0;
    }
}
