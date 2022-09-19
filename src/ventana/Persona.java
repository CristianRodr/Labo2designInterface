
package ventana;

/**
 *
 * @author an1me
 */
public class Persona {
    private String nombres,apellidos,cedula,equipo,direccion;

    public Persona(String nombres, String apellidos, String cedula, String equipo, String direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.equipo = equipo;
        this.direccion = direccion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString(){
        return this.nombres + " " + this.apellidos;
    }
}
