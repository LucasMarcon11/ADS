
package Model;

/**
 *
 * @author LucasMarcon
 */
public class Cliente {

    private Integer id;
    private String login;
    private String senha;
    private String cpf;
    private String email;
    private String telefone;
    private String nascimento;
    private String cep;
    private String endereco;
    private String numeroEndereco;
    private String complemento;
    private String cidade;
    private String bairro;
    private String pontoReferencia;
    private String estado;
    private boolean administrador;

    public Cliente() {
    }

    public Cliente(String login, String senha, String email) {
        this.login = login;
        this.senha = senha;
        this.email = email;
    }

    public Cliente(Integer id, String login, String senha, String cpf, String email, String telefone, String nascimento, String cep, String endereco, String numeroEndereco, String complemento, String cidade, String bairro, String pontoReferencia, String estado, boolean administrador) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.cep = cep;
        this.endereco = endereco;
        this.numeroEndereco = numeroEndereco;
        this.complemento = complemento;
        this.cidade = cidade;
        this.bairro = bairro;
        this.pontoReferencia = pontoReferencia;
        this.estado = estado;
        this.administrador = administrador;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
    
    
}
