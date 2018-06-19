
package DAO.Cliente;

/**
 *
 * @author LucasMarcon
 */
public class Queries {

    public static String LoginCliente() {
        
        return "SELECT idCliente FROM Cliente WHERE login = ? AND senha = ?";
    }
}
