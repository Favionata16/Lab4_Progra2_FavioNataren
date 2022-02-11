package Lab4P2_FavioNataren_22141210;

public class agronomo extends Aldeanos{

    public agronomo(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida);
    }

    public int ataque() {
        return 100;
    }

    @Override
    public String toString() {
        return super.toString()+" ,Ocupacion: agronomo } " ;
    }
}
