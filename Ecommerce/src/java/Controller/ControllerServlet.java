
package Controller;

import DAO.Cliente.LoginCliente;
import Model.Cliente;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author LucasMarcon
 */
public class ControllerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        Cliente cliente = new Cliente();
        cliente.setLogin(request.getParameter("login"));
        cliente.setSenha(request.getParameter("senha"));
        
        if (request.getParameter("acao").equals("login")) {
            
            LoginCliente lc = new LoginCliente();
            if (lc.consultarLogin(cliente)) {
                
                HttpSession hs = request.getSession();
                hs.setAttribute("login", request.getParameter("login"));
                
                response.sendRedirect("View/Sucesso.jsp");
            } else System.out.println("ALGUMA COISA DEU MUITO ERRADO, PUTA QUE PARIU!");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
