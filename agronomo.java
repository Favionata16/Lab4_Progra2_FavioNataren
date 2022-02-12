package Lab4P2_FavioNataren_22141210;

import java.util.Random;

public class agronomo extends Aldeanos {

    public agronomo(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida);
    }

    public double ataque(Aldeanos persona) {
        Random R = new Random();
        int ran = 1 + R.nextInt(100);
        if (ran <= 5) {
            return 0;
        } else {
            if (persona instanceof pacifista) {
                return 100 + 100 * 0.05;
            }
            if (persona instanceof normales) {
                return 100 + 100 * 0.10;
            } else {
                return 100;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + " ,Ocupacion: agronomo } ";
    }
}
