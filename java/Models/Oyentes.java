
package Models;


public class Oyentes extends Persona{
    private int Id_Oyente;

    public Oyentes() {
    }

    public Oyentes(int Id_Oyente, String Nombre, String Apellido, String Correo, String Telefono) {
        super(Nombre, Apellido, Correo, Telefono);
        this.Id_Oyente = Id_Oyente;
    }

    public int getId_Oyente() {
        return Id_Oyente;
    }

    public void setId_Oyente(int Id_Oyente) {
        this.Id_Oyente = Id_Oyente;
    }
    
   
    
}
