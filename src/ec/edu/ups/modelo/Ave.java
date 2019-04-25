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
public final class Ave extends Vertebrado {

    //Clase hija Ave que contiene los atributos finales
    private int numeroAlas;
    private boolean volador;
    private String formaPico;
    private int campoVision;

    //Constructor Vacio
    public Ave() {
    }

    //Constructor de herencia con la clase Abuelo Animal
    public Ave(int numeroHuesos, String esqueleto, String sangre, String tejido, int codigo, String nombre, int edad, int peso, String tipoAlimentacion) {
        super(numeroHuesos, esqueleto, sangre, tejido, codigo, nombre, edad, peso, tipoAlimentacion);
    }

    //Constructor de herencia con la clase Abuelo Animal y atributos de la clase Ave
    public Ave(int numeroAlas, boolean volador, String formaPico, int campoVision, int codigo, String nombre, int edad, int peso, String tipoAlimentacion) {
        super(codigo, nombre, edad, peso, tipoAlimentacion);
        this.numeroAlas = numeroAlas;
        this.volador = volador;
        this.formaPico = formaPico;
        this.campoVision = campoVision;
    }

    //Constructor de herencia con la clase padre Vertebrados y atributos de la clase Ave
    public Ave(int numeroAlas, boolean volador, String formaPico, int campoVision, int numeroHuesos, String esqueleto, String sangre, String tejido, int codigo, String nombre, int edad, int peso, String tipoAlimentacion) {
        super(numeroHuesos, esqueleto, sangre, tejido, codigo, nombre, edad, peso, tipoAlimentacion);
        this.numeroAlas = numeroAlas;
        this.volador = volador;
        this.formaPico = formaPico;
        this.campoVision = campoVision;
    }

    //Getter and Setter de la clase Ave
    public int getNumeroAlas() {
        return numeroAlas;
    }

    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }

    public boolean isVolador() {
        return volador;
    }

    public void setVolador(boolean volador) {
        this.volador = volador;
    }

    public String getFormaPico() {
        return formaPico;
    }

    public void setFormaPico(String formaPico) {
        this.formaPico = formaPico;
    }

    public int getCampoVision() {
        return campoVision;
    }

    public void setCampoVision(int campoVision) {
        this.campoVision = campoVision;
    }

    //Metodo toString de la clase Ave
    @Override
    public String toString() {
        return "Animal: " + "\n\tNombre: " + super.getNombre() + "\n\tCodigo: " + super.getCodigo() + "\n\tEdad: " + super.getEdad() + "\n\tPeso: " + super.getPeso() + "\n\tAlimentacion: " + super.getTipoAlimentacion() + "\n\n"
                + "\tVertebrado: " + "\n\t\t\tEsqueleto: " + super.getEsqueleto() + "\n\t\t\tSangre: " + super.getSangre() + "\n\t\t\tTejido: " + super.getTejido() + "\n\t\t\tHuesos: " + super.getNumeroHuesos() + "\n\n"
                + "\t\t\tAve:" + "\n\t\t\t\tAlas: " + numeroAlas + "\n\t\t\t\tVolador: " + volador + "\n\t\t\t\tForma Pico: " + formaPico + "\n\t\t\t\tCampo Vision(grados): " + campoVision + "\n\n";

    }

    //Metodos de la clase Ave  
    public void cambiarPlumas() {

    }

    public void volar() {

    }

    public void picotear() {

    }

    @Override
    public void crecerColumnaVertebral() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
