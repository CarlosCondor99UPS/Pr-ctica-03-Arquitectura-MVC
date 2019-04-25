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
public abstract class Vertebrado extends Animal {

    //Clase padre Invertebrado que contiene los atributos padre de Metazoo y Artropodo
    public int numeroHuesos;
    public String esqueleto;
    public String sangre;
    public String tejido;

    //Constructor vacio
    public Vertebrado() {
    }

    //Constructor de herencia con la clase Abuelo Animal
    public Vertebrado(int codigo,String nombre, int edad, int peso, String tipoAlimentacion) {
        super(codigo, nombre, edad, peso, tipoAlimentacion);
    }

    //Constructor de herencia y con los atributos de la clase Padre Vertebrado
    public Vertebrado(int numeroHuesos, String esqueleto, String sangre, String tejido, int codigo, String nombre, int edad, int peso, String tipoAlimentacion) {
        super(codigo,nombre, edad, peso, tipoAlimentacion);
        this.numeroHuesos = numeroHuesos;
        this.esqueleto = esqueleto;
        this.sangre = sangre;
        this.tejido = tejido;
    }

    //Getter and Setter de la clase Vertebrado
    public int getNumeroHuesos() {
        return numeroHuesos;
    }

    public void setNumeroHuesos(int numeroHuesos) {
        this.numeroHuesos = numeroHuesos;
    }

    public String getEsqueleto() {
        return esqueleto;
    }

    public void setEsqueleto(String esqueleto) {
        this.esqueleto = esqueleto;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public String getTejido() {
        return tejido;
    }

    public void setTejido(String tejido) {
        this.tejido = tejido;
    }

    //Metodo toString de la clase Vertebrado
    @Override
    public String toString() {
        return "Vertebrado{" + "numeroHuesos=" + numeroHuesos + ", esqueleto=" + esqueleto + ", sangre=" + sangre + ", tejido=" + tejido + '}';
    }

    //Metodos de la clase Vertebrado
    public void romperHueso() {

    }

    public void repararHueso() {

    }

    public void crecerHueso() {

    }

    //Metodos abstracto
    public abstract void crecerColumnaVertebral();

}
