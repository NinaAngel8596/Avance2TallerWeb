
package Models;


public class Miembros extends Persona {
    private int Id_Miembro;
    private String Sexo;

    public Miembros() {
    }

    public Miembros(int Id_Miembro, String Sexo, String Nombre, String Apellido, String Correo, String Telefono) {
        super(Nombre, Apellido, Correo, Telefono);
        this.Id_Miembro = Id_Miembro;
        this.Sexo = Sexo;
    }

    public int getId_Miembro() {
        return Id_Miembro;
    }

    public void setId_Miembro(int Id_Miembro) {
        this.Id_Miembro = Id_Miembro;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
    
}
