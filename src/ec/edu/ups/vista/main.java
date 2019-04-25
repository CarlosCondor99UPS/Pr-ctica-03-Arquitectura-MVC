/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Artropodo;
import ec.edu.ups.modelo.Ave;
import ec.edu.ups.modelo.Metazoo;
import ec.edu.ups.modelo.Pez;
import ec.edu.ups.controlador.ControladorArtropodo;
import ec.edu.ups.controlador.ControladorAve;
import ec.edu.ups.controlador.ControladorMetazoo;
import ec.edu.ups.controlador.ControladorPez;
import java.util.Scanner;

/**
 *
 * @author tians
 */
public class main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ControladorPez controladorPez = new ControladorPez();
        ControladorAve controladorAve = new ControladorAve();
        ControladorArtropodo controladorArtro = new ControladorArtropodo();
        ControladorMetazoo controladorMetazoo = new ControladorMetazoo();
        int op = 0, op2 = 0, op3 = 0, op4 = 0, op5 = 0;
        do {
            System.out.println("******* MENU ********");
            System.out.println("** 1. CRUD clase Pez");
            System.out.println("** 2. CRUD clase Ave");
            System.out.println("** 3. CRUD clase Artropodo");
            System.out.println("** 4. CRUD clase Metazoo");
            System.out.println("** 5. Salir");
            System.out.println("*********************");
            op = sc.nextInt();

            if (op == 1) {
                do {
                    System.out.println("****** CRUD PEZ *******");
                    mostrarCrud();
                    op2 = sc.nextInt();
                    switch (op2) {
                        case 1:
                            System.out.println("*** Crear Pez ***");
                            String[] animal1 = new String[2];
                            animal1 = crearAnimal1();
                            int[] animal2 = new int[3];
                            animal2 = crearAnimal2();
                            int numeroHuesos = crearVertebrado1();
                            String[] vertebrado = new String[3];
                            vertebrado = crearVertebrado2();
                            System.out.println("** Ingrese el agua");
                            String agua = sc.next();
                            System.out.println("** Ingrese la aleta(true/false)");
                            boolean aleta = sc.nextBoolean();
                            System.out.println("** Ingrese la mandibula(true/false)");
                            boolean mandibula = sc.nextBoolean();
                            System.out.println("** Ingrese el camuflaje(true/false)");
                            boolean camuflaje = sc.nextBoolean();
                            Pez objeto = new Pez(agua, aleta, mandibula, camuflaje, numeroHuesos, vertebrado[0], vertebrado[1], vertebrado[2], 0, animal1[0], animal2[1], animal2[2], animal1[1]);
                            controladorPez.guardar(objeto);
                            break;
                        case 2:
                            System.out.println("*** Leer Pez ***");
                            System.out.println("** Ingrese el codigo del pez");
                            int codigo = sc.nextInt();
                            System.out.println(controladorPez.read(codigo));
                            break;
                        case 3:
                            System.out.println("*** Actualizar Pez ***");
                            animal1 = new String[2];
                            animal1 = crearAnimal1();
                            animal2 = new int[3];
                            animal2 = crearAnimal2();
                            numeroHuesos = crearVertebrado1();
                            vertebrado = new String[3];
                            vertebrado = crearVertebrado2();
                            System.out.println("** Ingrese el agua");
                            agua = sc.next();
                            System.out.println("** Ingrese la aleta(true/false)");
                            aleta = sc.nextBoolean();
                            System.out.println("** Ingrese la mandibula(true/false)");
                            mandibula = sc.nextBoolean();
                            System.out.println("** Ingrese el camuflaje(true/false)");
                            camuflaje = sc.nextBoolean();
                            Pez objetoNuevo = new Pez(agua, aleta, mandibula, camuflaje, numeroHuesos, vertebrado[0], vertebrado[1], vertebrado[2], 0, animal1[0], animal2[1], animal2[2], animal1[1]);
                            controladorPez.update(objetoNuevo);
                            break;
                        case 4:
                            System.out.println("*** Eliminar Pez ***");
                            System.out.println("** Ingrese el codigo");
                            codigo = sc.nextInt();
                            controladorPez.delete(controladorPez.read(codigo));
                            break;
                        case 5:
                            System.out.println("*** Listar Pez ***");
                            controladorPez.listar();
                            break;
                            
                    }
                } while (op2 != 5);
            } else if (op == 2) {
                do {
                    System.out.println("****** CRUD AVE *******");
                    mostrarCrud();
                    op3 = sc.nextInt();
                    switch (op3) {
                        case 1:
                            System.out.println("*** Crear Ave ***");
                            String[] animal1 = new String[2];
                            animal1 = crearAnimal1();
                            int[] animal2 = new int[3];
                            animal2 = crearAnimal2();
                            int numeroHuesos = crearVertebrado1();
                            String[] vertebrado = new String[3];
                            vertebrado = crearVertebrado2();
                            System.out.println("** Ingrese el numero de Alas");
                            int numeroAlas = sc.nextInt();
                            System.out.println("** Ingrese si es volador(true/false)");
                            boolean volador = sc.nextBoolean();
                            System.out.println("** Ingrese la forma del pico");
                            String formaPico = sc.next();
                            System.out.println("** Ingrese el campo de Vision");
                            int campoVison = sc.nextInt();
                            Ave objeto = new Ave(numeroAlas, volador, formaPico, campoVison, numeroHuesos, vertebrado[0], vertebrado[1], vertebrado[2], 0, animal1[0], animal2[1], animal2[2], animal1[1]);
                            controladorAve.guardar(objeto);
                            break;
                        case 2:
                            System.out.println("*** Leer Ave ***");
                            System.out.println("** Ingrese el codigo del ave");
                            int codigo = sc.nextInt();
                            System.out.println(controladorAve.read(codigo));
                            break;
                        case 3:
                            System.out.println("*** Actualizar Ave ***");
                            animal1 = new String[2];
                            animal1 = crearAnimal1();
                            animal2 = new int[3];
                            animal2 = crearAnimal2();
                            numeroHuesos = crearVertebrado1();
                            vertebrado = new String[3];
                            vertebrado = crearVertebrado2();
                            System.out.println("** Ingrese el numero de Alas");
                            numeroAlas = sc.nextInt();
                            System.out.println("** Ingrese si es volador(true/false)");
                            volador = sc.nextBoolean();
                            System.out.println("** Ingrese la forma del pico");
                            formaPico = sc.next();
                            System.out.println("** Ingrese el campo de Vision");
                            campoVison = sc.nextInt();
                            Ave objetoNuevo = new Ave(numeroAlas, volador, formaPico, campoVison, numeroHuesos, vertebrado[0], vertebrado[1], vertebrado[2], 0, animal1[0], animal2[1], animal2[2], animal1[1]);
                            controladorAve.update(objetoNuevo);
                            break;
                        case 4:
                            System.out.println("*** Eliminar Ave ***");
                            System.out.println("** Ingrese el codigo");
                            codigo = sc.nextInt();
                            controladorAve.delete(codigo);
                            break;
                        case 5:
                            System.out.println("*** Listar Ave ***");
                            controladorAve.listar();
                            break;
                    }
                } while (op3 != 5);
            } else if (op == 3) {
                do {
                    System.out.println("****** CRUD ARTROPODO *******");
                    mostrarCrud();
                    op4 = sc.nextInt();
                    switch (op4) {
                        case 1:
                            System.out.println("*** Crear Artropodo ***");
                            String[] animal1 = new String[2];
                            animal1 = crearAnimal1();
                            int[] animal2 = new int[3];
                            animal2 = crearAnimal2();
                            boolean[] invertebrado = new boolean[4];
                            invertebrado = crearInvertebrado();
                            System.out.println("** Ingrese forma");
                            String forma = sc.next();
                            System.out.println("** Ingrese el apendice(true/false)");
                            boolean apendice = sc.nextBoolean();
                            System.out.println("** Ingrese la cabeza(true/false)");
                            boolean cabeza = sc.nextBoolean();
                            System.out.println("** Ingrese los poros(true/false)");
                            boolean poro = sc.nextBoolean();
                            Artropodo objeto = new Artropodo(forma, apendice, cabeza, poro, invertebrado[0], invertebrado[1], invertebrado[2], invertebrado[3], 0, animal1[0], animal2[1], animal2[2], animal1[1]);
                            controladorArtro.guardar(objeto);
                            break;
                        case 2:
                            System.out.println("*** Leer Artropodo ***");
                            System.out.println("** Ingrese el codigo del artropodo");
                            int codigo = sc.nextInt();
                            System.out.println(controladorArtro.read(codigo));
                            break;
                        case 3:
                            System.out.println("*** Actualizar Artropodo ***");
                            animal1 = new String[2];
                            animal1 = crearAnimal1();
                            animal2 = new int[3];
                            animal2 = crearAnimal2();
                            invertebrado = new boolean[4];
                            invertebrado = crearInvertebrado();
                            System.out.println("** Ingrese forma");
                            forma = sc.next();
                            System.out.println("** Ingrese el apendice(true/false)");
                            apendice = sc.nextBoolean();
                            System.out.println("** Ingrese la cabeza(true/false)");
                            cabeza = sc.nextBoolean();
                            System.out.println("** Ingrese los poros(true/false)");
                            poro = sc.nextBoolean();
                            Artropodo objetoNuevo = new Artropodo(forma, apendice, cabeza, poro, invertebrado[0], invertebrado[1], invertebrado[2], invertebrado[3], 0, animal1[0], animal2[1], animal2[2], animal1[1]);
                            controladorArtro.guardar(objetoNuevo);
                            break;
                        case 4:
                            System.out.println("*** Eliminar Artropodo ***");
                            System.out.println("** Ingrese el codigo");
                            codigo = sc.nextInt();
                            controladorArtro.delete(controladorArtro.read(codigo));
                            break;
                        case 5:
                            System.out.println("*** Listar Artropodos ***");
                            controladorArtro.listar();
                            break;
                    }

                } while (op4 != 6);
            } else if (op == 4) {
                do {
                    System.out.println("****** CRUD METAZOO *******");
                    mostrarCrud();
                    op5 = sc.nextInt();
                    switch (op5) {
                        case 1:
                            System.out.println("*** Crear Metazoo ***");
                            String[] animal1 = new String[2];
                            animal1 = crearAnimal1();
                            int[] animal2 = new int[3];
                            animal2 = crearAnimal2();
                            boolean[] invertebrado = new boolean[4];
                            invertebrado = crearInvertebrado();
                            System.out.println("** Ingrese simetria");
                            String simetria = sc.next();
                            System.out.println("** Ingrese el cuerpo blando(true/false)");
                            boolean cuerpoBlando = sc.nextBoolean();
                            System.out.println("** Ingrese las antenas(true/false)");
                            boolean antenas = sc.nextBoolean();
                            System.out.println("** Ingrese la piel");
                            String piel = sc.next();
                            Metazoo objeto = new Metazoo(cuerpoBlando, simetria, piel, antenas, invertebrado[0], invertebrado[1], invertebrado[2], invertebrado[3], 0, animal1[0], animal2[1], animal2[2], animal1[1]);
                            controladorMetazoo.guardar(objeto);
                            break;
                        case 2:
                            System.out.println("*** Leer Metazoo ***");
                            System.out.println("** Ingrese el codigo del metazoo");
                            int codigo = sc.nextInt();
                            System.out.println(controladorMetazoo.read(codigo));
                            break;
                        case 3:
                            System.out.println("*** Actualizar Metazoo ***");
                            animal1 = new String[2];
                            animal1 = crearAnimal1();
                            animal2 = new int[3];
                            animal2 = crearAnimal2();
                            invertebrado = new boolean[4];
                            invertebrado = crearInvertebrado();
                            System.out.println("** Ingrese simetria");
                            simetria = sc.next();
                            System.out.println("** Ingrese el cuerpo blando(true/false)");
                            cuerpoBlando = sc.nextBoolean();
                            System.out.println("** Ingrese las antenas(true/false)");
                            antenas = sc.nextBoolean();
                            System.out.println("** Ingrese la piel");
                            piel = sc.next();
                            Metazoo objetoNuevo = new Metazoo(cuerpoBlando, simetria, piel, antenas, invertebrado[0], invertebrado[1], invertebrado[2], invertebrado[3], 0, animal1[0], animal2[1], animal2[2], animal1[1]);
                            controladorMetazoo.update(objetoNuevo);
                            break;
                        case 4:
                            System.out.println("*** Eliminar Metazoo ***");
                            System.out.println("** Ingrese el codigo");
                            codigo = sc.nextInt();
                            controladorMetazoo.delete(codigo);
                            break;
                        case 5:
                            System.out.println("*** Listar Metazoo ***");
                            controladorMetazoo.listar();
                            break;
                    }
                } while (op5 != 5);
            }
        } while (op != 5);
    }

    public static void mostrarCrud() {
        System.out.println("** 1. Crear (Create)");
        System.out.println("** 2. Leer (Read)");
        System.out.println("** 3. Actualizar (Update)");
        System.out.println("** 4. Eliminar (Delete)");
        System.out.println("** 5. Listar (List)");
        System.out.println("** 6. Regresar");
        System.out.println("************************");
    }

    public static String[] crearAnimal1() {
        String[] animal = new String[2];
        System.out.println("** Ingrese el nombre");
        animal[0] = sc.next();
        System.out.println("** Ingrese el tipo de Alimentacion");
        animal[1] = sc.next();
        return animal;
    }

    public static int[] crearAnimal2() {
        int[] animal = new int[3];
        System.out.println("** Ingrese la edad");
        animal[1] = sc.nextInt();
        System.out.println("** Ingrese el peso");
        animal[2] = sc.nextInt();
        return animal;
    }

    public static int crearVertebrado1() {
        System.out.println("** Ingrese el numero de huesos");
        int numeroHuesos = sc.nextInt();
        return numeroHuesos;
    }

    public static String[] crearVertebrado2() {
        String[] vertebrado = new String[3];
        System.out.println("** Ingrese el esqueleto");
        vertebrado[0] = sc.next();
        System.out.println("** Ingrese la sangre");
        vertebrado[1] = sc.next();
        System.out.println("** Ingrese tejido");
        vertebrado[2] = sc.next();
        return vertebrado;
    }

    static public boolean[] crearInvertebrado() {
        boolean[] invertebrado = new boolean[4];
        System.out.println("** Ingrese la proteccion corporal(true/false)");
        invertebrado[0] = sc.nextBoolean();
        System.out.println("** Ingrese la excepcion(true/false)");
        invertebrado[1] = sc.nextBoolean();
        System.out.println("** Ingrese la movilidad(true/false)");
        invertebrado[2] = sc.nextBoolean();
        System.out.println("** Ingrese el veneno(true/false)");
        invertebrado[3] = sc.nextBoolean();
        return invertebrado;
    }
}
