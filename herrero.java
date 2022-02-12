/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4P2_FavioNataren_22141210;


public class herrero extends Aldeanos {

    int d;
    public herrero(String nombre, String apellido, int edad, int vida, int dano) {
        super(nombre, apellido, edad, vida);
        this.d=d;

    }

     public double ataque(Aldeanos aldeano){
        if (aldeano instanceof agronomo) {
            return d+d*0.1;
        }
        if (aldeano instanceof pacifista) {
            return d+d*0.05;
        }else{
            return d;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " ,Ocupacion: Herrero } ";
    }
}

