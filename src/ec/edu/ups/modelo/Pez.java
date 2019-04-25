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
public final class Pez extends Vertebrado{

    //Clase hija Pez que contiene los atributos finales
    private String agua;
    private boolean aleta;
    private boolean mandibula;
    private boolean camuflaje;

    //Constructor vacio
    public Pez() {
    }

    //Constructor de herencia con la clase Abuelo Animal
    public Pez(int codigo, String nombre, int edad, int peso, String tipoAlimentacion) {
        super(codigo, nombre, edad, peso, tipoAlimentacion);
    }

    //Constructor de herencia con la clase Padre Vertebrados y atributos de la clase Pez
    public Pez(String agua, boolean aleta, boolean mandibula, boolean camuflaje,int codigo ,String nombre, int edad, int peso, String tipoAlimentacion) {
        super(codigo, nombre, edad, peso, tipoAlimentacion);
        this.agua = agua;
        this.aleta = aleta;
        this.mandibula = mandibula;
        this.camuflaje = camuflaje;
    }

    //Constructor de herencia con la clase Padre Invertebrados y atributos de la clase Pez
    public Pez(String agua, boolean aleta, boolean mandibula, boolean camuflaje, int numeroHuesos, String esqueleto, String sangre, String tejido,int codigo ,String nombre, int edad, int peso, String tipoAlimentacion) {
        super(numeroHuesos, esqueleto, sangre, tejido, codigo ,nombre, edad, peso, tipoAlimentacion);
        this.agua = agua;
        this.aleta = aleta;
        this.mandibula = mandibula;
        this.camuflaje = camuflaje;
    }

    //Getter and Setter de la clase Pez
    public String getAgua() {
        return agua;
    }

    public void setAgua(String agua) {
        this.agua = agua;
    }

    public boolean isAleta() {
        return aleta;
    }

    public void setAleta(boolean aleta) {
        this.aleta = aleta;
    }

    public boolean isMandibula() {
        return mandibula;
    }

    public void setMandibula(boolean mandibula) {
        this.mandibula = mandibula;
    }

    public boolean isCamuflaje() {
        return camuflaje;
    }

    public void setCamuflaje(boolean camuflaje) {
        this.camuflaje = camuflaje;
    }

    //Metodo toString de la clase Pez
    @Override
    public String toString() {
        return "Animal: " + "\n\tNombre: " + super.getNombre() +"\n\tCodigo: " + super.getCodigo() + "\n\tEdad: " + super.getEdad() + "\n\tPeso: " + super.getPeso() + "\n\tAlimentacion: " + super.getTipoAlimentacion() + "\n\n"
                + "\tVertebrado: " + "\n\t\t\tEsqueleto: " + super.getEsqueleto() + "\n\t\t\tSangre: " + super.getSangre() + "\n\t\t\tTejido: " + super.getTejido() + "\n\t\t\tHuesos: " + super.getNumeroHuesos() + "\n\n"
                + "\t\t\tPez:" + "\n\t\t\t\tAgua: " + agua + "\n\t\t\t\tAleta: " + aleta + "\n\t\t\t\tMandibula: " + mandibula + "\n\t\t\t\tcamuflaje: " + camuflaje + "\n\n";
    }

    //Metodos de la clase Pez
    public void ponerHuevos() {

    }

    public void nadar() {

    }

    public void camuflarse() {

    }

    @Override
    public void crecerColumnaVertebral() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
