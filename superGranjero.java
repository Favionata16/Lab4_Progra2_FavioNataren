/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4P2_FavioNataren_22141210;


public class superGranjero extends Aldeanos {

    public superGranjero(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida);
    }

     public double ataque(Aldeanos persona){
        if (persona instanceof herrero) {
            return 100+100*0.01;
        }
        if (persona instanceof explosivos) {
            return 100+100*0.15;
        }else{
            return 100;
        }
    }


    @Override
    public String toString() {
        return super.toString() + " ,Ocupacion: SuperGranjero } ";

    }
}
