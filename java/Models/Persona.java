package Models;

public class Persona {
    //Creamos los atributos
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Telefono;
    
    //Constructor vacia para que sea instanciado sin parametros es util

    public Persona() {
    }
    //Contructor con los atributos 
    

    public Persona(String Nombre, String Apellido, String Correo, String Telefono) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
    
    
}
