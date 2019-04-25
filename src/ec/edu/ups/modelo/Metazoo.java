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
public final class Metazoo extends Invertebrado{

    //Clase hija Metazoo que contiene los atributos finales
    private boolean cuerpoBlando;
    private String simetria;
    private String piel;
    private boolean antenas;

    //Constructor vacio
    public Metazoo() {
    }

    //Constructor de herencia con la clase Padre Invertebrados
    public Metazoo(int codigo,String nombre, int edad, int peso, String tipoAlimentacion) {
        super(codigo, nombre, edad, peso, tipoAlimentacion);
    }

    //Constructor de herencia y con los atributos de la clase Metazoo
    public Metazoo(boolean cuerpoBlando, String simetria, String piel, boolean antenas, boolean proteccionCorporal, boolean excepcion, boolean movilidad, boolean venenoso,int codigo ,String nombre, int edad, int peso, String tipoAlimentacion) {
        super(proteccionCorporal, excepcion, movilidad, venenoso,codigo ,nombre, edad, peso, tipoAlimentacion);
        this.cuerpoBlando = cuerpoBlando;
        this.simetria = simetria;
        this.piel = piel;
        this.antenas = antenas;
    }

    //Getter and Setter de la clase Metazoo
    public boolean isCuerpoBlando() {
        return cuerpoBlando;
    }

    public void setCuerpoBlando(boolean cuerpoBlando) {
        this.cuerpoBlando = cuerpoBlando;
    }

    public String getSimetria() {
        return simetria;
    }

    public void setSimetria(String simetria) {
        this.simetria = simetria;
    }

    public String getPiel() {
        return piel;
    }

    public void setPiel(String piel) {
        this.piel = piel;
    }

    public boolean isAntenas() {
        return antenas;
    }

    public void setAntenas(boolean antenas) {
        this.antenas = antenas;
    }

    //Metodo toString de la clase Metazoo
    @Override
    public String toString() {
        return "Animal: " + "\n\tNombre: " + super.getNombre() +"\n\tCodigo: " + super.getCodigo() + "\n\tEdad: " + super.getEdad() + "\n\tPeso: " + super.getPeso() + "\n\tAlimentacion: " + super.getTipoAlimentacion() + "\n\n"
                + "\tInvertebrado: " + "\n\t\t\tExcepcion: " + super.isExcepcion() + "\n\t\t\tMovilidad: " + super.isMovilidad() + "\n\t\t\tProteccion Corporal: " + super.isProteccionCorporal() + "\n\t\t\tVenenoso: " + super.isVenenoso() + "\n\n"
                + "\t\t\tMetazoo:" + "\n\t\t\t\t\tCuerpo Blando: " + cuerpoBlando + "\n\t\t\t\t\tSimetrai: " + simetria + "\n\t\t\t\t\tPiel: " + piel + "\n\t\t\t\t\tAntenas: " + antenas + "\n\n";
    }

    //Metodos de la clase Metazoo
    public void arrastrarse() {

    }

    public void descomponer() {

    }

    public void rastrear() {

    }

    @Override
    public void multiplicarCelulas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
