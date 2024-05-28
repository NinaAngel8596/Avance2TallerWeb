
package Models;


import java.util.List;


public class Admin extends Persona{
    private int Id_Admin;
    private String contra;
    private List<Usuarios> Usuarios;
       

    public Admin() {
    }

    public Admin(int Id_Admin, String contra, List<Usuarios> Usuarios, String Nombre, String Apellido, String Correo, String Telefono) {
        super(Nombre, Apellido, Correo, Telefono);
        this.Id_Admin = Id_Admin;
        this.contra = contra;
        this.Usuarios = Usuarios;
    }

    public int getId_Admin() {
        return Id_Admin;
    }

    public void setId_Admin(int Id_Admin) {
        this.Id_Admin = Id_Admin;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public List<Usuarios> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(List<Usuarios> Usuarios) {
        this.Usuarios = Usuarios;
    }

    
    
    
    
    
}
