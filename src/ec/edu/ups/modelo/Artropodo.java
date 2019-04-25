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
public final class Artropodo extends Invertebrado {
    //Clase hija Artropodo que contiene los atributos finales
    private String forma;
    private boolean apendice;
    private boolean cabeza;
    private boolean poro;

    //Constructor vacio
    public Artropodo() {
    }

    //Constructor de herencia con la clase Abuelo Animal
    public Artropodo(int codigo, String nombre, int edad, int peso, String tipoAlimentacion) {
        super(codigo, nombre, edad, peso, tipoAlimentacion);
    }
    
    //Constructor de herencia con la clase Padre Invertebrados
    public Artropodo(boolean proteccionCorporal, boolean excepcion, boolean movilidad, boolean venenoso,int codigo, String nombre, int edad, int peso, String tipoAlimentacion) {
        super(proteccionCorporal, excepcion, movilidad, venenoso,codigo ,nombre, edad, peso, tipoAlimentacion);
    }

    //Constructor de herencia con la clase Padre Inverberados y con los atributos de la clase Hija Artropodo
    public Artropodo(String forma, boolean apendice, boolean cabeza, boolean poro, boolean proteccionCorporal, boolean excepcion, boolean movilidad, boolean venenoso,int codigo ,String nombre, int edad, int peso, String tipoAlimentacion) {
        super(proteccionCorporal, excepcion, movilidad, venenoso,codigo ,nombre, edad, peso, tipoAlimentacion);
        this.forma = forma;
        this.apendice = apendice;
        this.cabeza = cabeza;
        this.poro = poro;
    }

    //Getter and Setter de la clase Artropodo
    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public boolean isApendice() {
        return apendice;
    }

    public void setApendice(boolean apendice) {
        this.apendice = apendice;
    }

    public boolean isCabeza() {
        return cabeza;
    }

    public void setCabeza(boolean cabeza) {
        this.cabeza = cabeza;
    }

    public boolean isPoro() {
        return poro;
    }

    public void setPoro(boolean poro) {
        this.poro = poro;
    }

    //Metodo toString de la clase Artropodo
    @Override
    public String toString() {
        return "Animal: " + "\n\tNombre: " + super.getNombre() + "\n\tCodigo: " + super.getCodigo() + "\n\tEdad: " + super.getEdad() + "\n\tPeso: " + super.getPeso() + "\n\tAlimentacion: " + super.getTipoAlimentacion() + "\n\n"
                + "\tInvertebrado: " + "\n\t\t\tExcepcion: " + super.isExcepcion() + "\n\t\t\tMovilidad: " + super.isMovilidad() + "\n\t\t\tProteccion Corporal: " + super.isProteccionCorporal() + "\n\t\t\tVenenoso: " + super.isVenenoso() + "\n\n"
                + "\t\t\tArtropodo:" + "\n\t\t\t\t\tForma: " + forma + "\n\t\t\t\t\tApendice: " + apendice + "\n\t\t\t\t\tCabeza: " + cabeza + "\n\t\t\t\t\tPoros: " + poro + "\n\n";
    }

    //Metodos de la clase Artropodo
    public void picar() {

    }

    public void trepar() {

    }

    public void atacar() {

    }

    @Override
    public void multiplicarCelulas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
