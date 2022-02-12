package Lab4P2_FavioNataren_22141210;

public abstract class Aldeanos {
    
    //atributos
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int vida;
    

    //constructor
    public Aldeanos(String nombre, String apellido, int edad, int vida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.vida = vida;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellido;
    }

    public void setApellidos(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    @Override
    public String toString() {
        return "Aldeano{" + " Nombre: " + nombre + ", Apellido: " + apellido;
    }
    
        public abstract double ataque(Aldeanos persona);

       
}
