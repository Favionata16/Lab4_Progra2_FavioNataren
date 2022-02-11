package Lab4P2_FavioNataren_22141210;

public class explosivos extends Aldeanos{
    
    public explosivos(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida);
    }
    
    public int ataque(){
    return 250;
    }

    @Override
    public String toString() {
        return super.toString()+" ,Ocupacion: explosivo } "; 
    }
}
