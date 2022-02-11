package Lab4P2_FavioNataren_22141210;

import java.util.ArrayList;

public class familias {

    ArrayList<Aldeanos> Aldeanos = new ArrayList();
    String apellido;

    public familias() {
    }

    public familias(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Aldeanos> getAldeanos() {
        return Aldeanos;
    }

    public void setAldeanos(Aldeanos aldeanos) {
        this.Aldeanos.add(aldeanos);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return ", apellido: " + apellido + " Aldeanos: " + Aldeanos;
    }

}
