
package DAO;

import Models.Usuarios;

public class ctrlPersUsuario {
    
    //se instancia el jpa para que puede acceder a sus metodo create
    UsuariosJpaController usuJpa=new UsuariosJpaController();
    //se crea un metodo de crear usuario
    public void crearUsuario(Usuarios usu){
         usuJpa.create(usu);
    }
}
