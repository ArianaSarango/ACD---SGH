public abstract class Persona {
    private final String nombre;
    private final String id;
    private final String dni;
    private final String direccion;

    public Persona (String nombre, String id, String dni, String direccion){
        this.nombre = nombre;
        this.id = id;
        this.dni = dni;
        this.direccion = direccion;

    }

    public String getNombre(){
        return id;
    }

    public String getId(){
        return id;
    }

    public String getDni(){
        return dni;
    }

    public String getDireccion(){
        return direccion;
    }

}
