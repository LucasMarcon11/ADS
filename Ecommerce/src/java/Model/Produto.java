
package Model;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author LucasMarcon
 */
public class Produto {

    private Integer id;
    private Integer quantidadeEstoque;
    private Integer idCategoria;
    private Double preco;
    private String nome;
    private String marca;
    private String modelo;
    private String descricao;
    private Map<Integer, Produto> produtos = new LinkedHashMap<>();

    public Produto() {
    }

    public Produto(Integer id, Integer quantidadeEstoque, Integer idCategoria, Double preco, String nome, String marca, String modelo, String descricao) {
        this.id = id;
        this.quantidadeEstoque = quantidadeEstoque;
        this.idCategoria = idCategoria;
        this.preco = preco;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.descricao = descricao;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Collection<Produto> getProdutos() {
        return produtos.values();
    }
    
    public Produto getProdutoPorId(int id) {
        return produtos.get(id);
    }
}
