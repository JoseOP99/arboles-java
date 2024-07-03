package arbolAVL;

public class Contacto {

    private String contacto;
    private String nombre;

    public Contacto(String contacto, String nombre) {
        this.contacto = contacto;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

}
