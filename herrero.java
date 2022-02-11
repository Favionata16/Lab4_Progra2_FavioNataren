/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4P2_FavioNataren_22141210;


public class herrero extends Aldeanos {

    public herrero(String nombre, String apellido, int edad, int puntos_vid) {
        super(nombre, apellido, edad, puntos_vid);
    }

    public int ataque() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " ,Ocupacion: Herrero } ";
    }
}

