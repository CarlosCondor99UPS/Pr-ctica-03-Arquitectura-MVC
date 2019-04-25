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
public class Animal {

    //Clase abuelo Animal que contiene los atributos padre de vertebrado e invertebrado
    private int codigo;
    private String nombre;
    private int edad;
    private int peso;
    private String tipoAlimentacion;

    //Constructur Vacio
    public Animal() {
    }

    //Contructor con atributos de la clase Animal
    public Animal(int codigo,String nombre, int edad, int peso, String tipoAlimentacion) {
        this.codigo=codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.tipoAlimentacion = tipoAlimentacion;
    }
    
    //Getter and Setter de la clase Animal
    public int getCodigo() {
        return codigo;
    }

    
    public void setCodigo(int codigo) {    
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    //Metodo toString de la clase Animal
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", tipoAlimentacion=" + tipoAlimentacion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    
    
    
    
}
