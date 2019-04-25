/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author tians
 * @version 8.2
 * @since 2019
 */
public abstract class Invertebrado extends Animal {

    //Clase padre Vertebrado que contiene los atributos padre de Pez y Ave
    private boolean proteccionCorporal;
    private boolean excepcion;
    private boolean movilidad;
    private boolean venenoso;

    //Constructor vacio
    public Invertebrado() {
    }

    //Constructor de herencia con la clase Abuelo Animal
    public Invertebrado(int codigo, String nombre, int edad, int peso, String tipoAlimentacion) {
        super(codigo, nombre, edad, peso, tipoAlimentacion);
    }

    //Constructor de herencia y con los atributos de la clase Padre Invertebrado
    public Invertebrado(boolean proteccionCorporal, boolean excepcion, boolean movilidad, boolean venenoso, int codigo, String nombre, int edad, int peso, String tipoAlimentacion) {
        super(codigo, nombre, edad, peso, tipoAlimentacion);
        this.proteccionCorporal = proteccionCorporal;
        this.excepcion = excepcion;
        this.movilidad = movilidad;
        this.venenoso = venenoso;
    }

    //Getter and Setter de la clase Invertebrado
    public boolean isProteccionCorporal() {
        return proteccionCorporal;
    }

    public void setProteccionCorporal(boolean proteccionCorporal) {
        this.proteccionCorporal = proteccionCorporal;
    }

    public boolean isExcepcion() {
        return excepcion;
    }

    public void setExcepcion(boolean excepcion) {
        this.excepcion = excepcion;
    }

    public boolean isMovilidad() {
        return movilidad;
    }

    public void setMovilidad(boolean movilidad) {
        this.movilidad = movilidad;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    //Metodo toString de la clase Invertebrado
    @Override
    public String toString() {
        return "Invertebrado{" + "proteccionCorporal=" + proteccionCorporal + ", excepcion=" + excepcion + ", movilidad=" + movilidad + ", venenoso=" + venenoso + '}';
    }

    //Metodos de la clase Invertebrado
    public void envenenar() {

    }

    public void moverse(boolean moverse) {

    }

    public void producircomida() {

    }

    //Metodos abstracto
    public abstract void multiplicarCelulas();

}
