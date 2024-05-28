
package Controls;

import DAO.ctrlPersUsuario;
import Models.Usuarios;


public class controladoraUsuario {
    ctrlPersUsuario ctrlUsuario=new ctrlPersUsuario();
    
    public void crearUsuario(Usuarios usu){
        ctrlUsuario.crearUsuario(usu);
    }
    
}
