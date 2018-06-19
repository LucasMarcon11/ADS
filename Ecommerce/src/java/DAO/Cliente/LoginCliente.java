
package DAO.Cliente;

import Conexao.ConnectionPostgresql;
import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author LucasMarcon
 */
public class LoginCliente {

    private final Connection connection;

    public LoginCliente() {
        connection = ConnectionPostgresql.getConnection();
    }
    
    public boolean consultarLogin(Cliente cliente) {
        
        try (PreparedStatement ps = connection.prepareStatement(Queries.LoginCliente())) {
            
            ps.setString(1, cliente.getLogin());
            ps.setString(2, cliente.getSenha());
            
            return ps.execute();
        } catch (Exception e) {}
        
        return false;
    }
}
