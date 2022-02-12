package Lab4P2_FavioNataren_22141210;

import java.util.Random;

public class explosivos extends Aldeanos{
    
    public explosivos(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida);
    }
    
    public double ataque(Aldeanos aldeano){
        Random r=new Random();
        int ran=1+r.nextInt(100);
        if (ran<=15) {
            return 0;
        }else{
            if (aldeano instanceof herrero) {
                return 250+250*0.05;
            }
            if (aldeano instanceof agronomo) {
                return 250+250*0.10;
            }else{
                return 250;
            }
        }
        
    }


    @Override
    public String toString() {
        return super.toString()+" ,Ocupacion: explosivo } "; 
    }
}
