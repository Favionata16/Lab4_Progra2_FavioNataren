package Lab4P2_FavioNataren_22141210;

public class normales extends Aldeanos {

    protected int d;
    @Override
    public double ataque(Aldeanos aldeano){
        if (aldeano instanceof pacifista) {
            return 50+50*0.05;
        }else{
            return 50;
        }
    }

    public normales(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida);
 
    }

    @Override
    public String toString() {
        return super.toString() + " ,Ocupacion: normales } ";
    }
}
