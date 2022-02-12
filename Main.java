package Lab4P2_FavioNataren_22141210;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<familias> familias = new ArrayList();

    public static void main(String[] args) {
        int opcion;
        
        //familias preestablecidas
        //aldeanos de la familia 1
        familias.add(new familias("capuleto"));
        herrero nor = new herrero("julieta", "capuleto", 46, 33, 65);
        familias.get(0).setAldeanos(nor);
        explosivos explosivos = new explosivos("marco", "capuleto", 13, 45);
        familias.get(0).setAldeanos(explosivos);
        
        //aldeanos de la familia 1
        familias.add(new familias("montesco"));
        superGranjero h = new superGranjero("romeo", "montesco", 20, 750);
        familias.get(1).setAldeanos(h);
        herrero q = new herrero("carlos", "montesco", 12, 500, 350);
        familias.get(1).setAldeanos(q);
        agronomo agro = new agronomo("alexander", "Montesco", 13, 500);
        familias.get(1).setAldeanos(agro);

        

        //aldeanos de la familia 3
        familias.add(new familias("dotados"));
        pacifista pacifista = new pacifista("daniel", "natare", 16, 60);
        familias.get(2).setAldeanos(pacifista);
        normales agroooo = new normales("favio", "nataren", 17, 45);
        familias.get(2).setAldeanos(agroooo);

        boolean end = true;

        while (end == true) {
            System.out.println("1. crear familia \n2. crear aldeanos"
                    + "\n3. imprimir las familias disponibles"
                    + "\n4. pelear \n0. Salir");
            System.out.print("Ingrese Opcion: ");
            int opcion2 = leer.nextInt();
            switch (opcion2) {

                case 1: {
                    String nombre = "";
                    int posicion = 0;
                    for (int k = 0; k < familias.size(); k++) {
                        if (k == 0) {
                            System.out.println("Ingrese Nombre de la familia");
                            nombre = leer.nextLine();
                            nombre = leer.nextLine();
                        }
                        if (nombre.equals(familias.get(k).getApellido())) {
                            posicion++;
                        }
                    }
                    if (posicion == 1) {
                        System.out.println("ya existe una familia con ese apellido");
                    } else {
                        familias.add(new familias(nombre));
                    }
                }
                break;
                case 2: {
                    int possicion;
                    int posicion2 = 0;
                    System.out.print("ingrese nombre para el aldeano: ");
                    String nombre = leer.nextLine();
                    nombre = leer.nextLine();
                    String apellido = "";
                    for (int e = 0; e < familias.size(); e++) {
                        if (e == 0) {
                            System.out.print("ingrese apellido para el aldeano: ");
                            apellido = leer.nextLine();
                        }
                        if (apellido.equals(familias.get(e).getApellido())) {
                            possicion = e;
                            int edad;
                            int vida;
                            e = familias.size();

                            System.out.print("ingrese la edad: ");
                            edad = leer.nextInt();
                            System.out.print("ingrese la Vida: ");
                            vida = leer.nextInt();
                            System.out.println("1. Normales \n2. pacifista"
                                    + "\n3. herrero \n4. agronomo"
                                    + "\n5. explosivo");
                            System.out.print("Ingrese Ocupacion: ");
                            opcion = leer.nextInt();

                            int d = leer.nextInt();
                            if (opcion == 1) {
                                familias.get(possicion).setAldeanos(new normales(nombre,apellido,edad,vida));
                            } else if (opcion == 2) {
                                familias.get(possicion).setAldeanos(new pacifista(nombre,apellido,edad,vida));
                            } else if (opcion == 3) {
                                familias.get(possicion).setAldeanos(new herrero(nombre,apellido,edad,vida+vida/2,d));
                            } else if (opcion == 4) {
                                familias.get(possicion).setAldeanos(new agronomo(nombre,apellido,edad,vida));
                            } else if (opcion == 5) {
                                familias.get(possicion).setAldeanos(new explosivos(nombre,apellido,edad,vida));
                            } else {
                                System.out.println("opcion incorrecta");
                            }

                        } else {
                            posicion2++;
                        }
                        if (posicion2 == familias.size()) {
                            System.out.println("no se encontro ese apellido en una familia");
                        }

                    }

                }
                break;

                case 3: {
                    for (int i = 0; i < familias.size(); i++) {
                        int nume = i + 1;
                        System.out.println("Familia " + nume + ":" + familias.get(i));
                    }
                    System.out.println();
                }
                break;
                case 4: {
                    int posicion1 = 0;
                    int posicion2 = 0;
                    String nombrefamilia = "";
                    boolean end2 = true;
                    for (int j = 0; j < familias.size(); j++) {
                        if (j == 0) {
                            System.out.println("La Familia montesco va a pelar con la familia: ");
                            nombrefamilia = leer.nextLine();
                            nombrefamilia = leer.nextLine();
                        }

                        if (nombrefamilia.equals(familias.get(j).getApellido())) {
                            posicion1 = j;
                            j = familias.size();

                        } else {
                            posicion2++;
                        }

                        if (posicion2 == familias.size()) {
                            System.out.println();
                            System.out.println("No se encontro ese apellido en una familia");
                            System.out.println();
                            end2 = false;
                        }

                    }

                    if (end2 == true) {
                        int x = 0;
                        int vidaf1 = 1;
                        int vidaf2 = 1;

                        familias familia1 = (familias) familias.get(0);
                        familias familia2 = (familias) familias.get(posicion1);

                        do {
                            if (!familia1.getAldeanos().isEmpty() && !familia2.getAldeanos().isEmpty()) {
                                vidaf1 = familia1.getAldeanos().get(x).vida;
                                vidaf2 = familia2.getAldeanos().get(x).vida;
                            }
                            do {
                                double pelea = familia1.getAldeanos().get(x).ataque(familia2.getAldeanos().get(x));
                                System.out.println(familia1.getAldeanos().get(x).getNombre() + " ataco a " + familia2.getAldeanos().get(x).getNombre()
                                        + " quitandole " + familia1.getAldeanos().get(x).ataque(familia2.getAldeanos().get(x))
                                        + " puntos de daño y quedo con una vida de: " + (vidaf2 - pelea));
                                vidaf2 = (int) (vidaf2 - pelea);
                                if (vidaf2 <= 0) {
                                    break;
                                }
                                pelea = familia2.getAldeanos().get(x).ataque(familia2.getAldeanos().get(x));
                                System.out.println(familia2.getAldeanos().get(x).getNombre()
                                        + " ataco a " + familia1.getAldeanos().get(x).getNombre()
                                        + " quitandole " + familia2.getAldeanos().get(x).ataque(familia1.getAldeanos().get(x))
                                        + " puntos de daño y quedo con una vida de: " + (vidaf1 - pelea));
                                vidaf1 = (int) (vidaf1 - pelea);
                            } while (vidaf1 > 0 && vidaf2 > 0);

                            if (vidaf1 <= 0) {
                                if (!familia1.getAldeanos().isEmpty()) {
                                    System.out.println(familia1.getAldeanos().get(x).getNombre()
                                            + " se murio ");
                                    familia1.getAldeanos().remove(x);
                                }
                            } else {
                                if (vidaf2 <= 0) {
                                    if (!familia2.getAldeanos().isEmpty()) {
                                        System.out.println(familia2.getAldeanos().get(x).getNombre()
                                                + " se murio ");
                                        familia2.getAldeanos().remove(x);
                                    }
                                }
                            }
                        } while (familia2.getAldeanos().size() > 0 && familia1.getAldeanos().size() > 0);
                        
                        if (familia2.getAldeanos().isEmpty()) {
                            familias.remove(posicion1);
                        } else {
                            if (familia1.getAldeanos().isEmpty()) {
                                familias.remove(0);
                                System.out.println("se termino el juego porque se murio Romeo ");
                                System.exit(0);
                            }
                        }
                    }
                }
                break;
                case 0: {
                    System.out.println("Gracias por usar el programa....");
                    System.exit(0);
                }
                break;
                default: {
                    System.out.println("opcion incorrecta");
                }
                break;
            }
        }

    }
}
