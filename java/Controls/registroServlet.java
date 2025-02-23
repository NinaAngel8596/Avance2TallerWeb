
package Controls;

import DAO.ctrlPersUsuario;
import Models.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "registroServlet", urlPatterns = {"/registroServlet"})
public class registroServlet extends HttpServlet {
controladoraUsuario ctrlUsu= new controladoraUsuario();

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //capturamos las variables par aser usadas con el controlador de Usuario
        String nombre=request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        String correo=request.getParameter("correo");
        String contrasenia=request.getParameter("contrasenia");
        
        Usuarios usu=new Usuarios();
        
        usu.setNombre(nombre);
        usu.setApellido(apellido);
        usu.setCorreo(correo);
        usu.setContra(contrasenia);
        
        ctrlUsu.crearUsuario(usu);
        
        request.setAttribute("success", "true");
        request.getRequestDispatcher("registerUsuario.jsp").forward(request, response);
       
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
