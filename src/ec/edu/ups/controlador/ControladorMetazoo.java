/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Metazoo;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author tians
 */
public class ControladorMetazoo {

    private Set<Metazoo> metazoos = new HashSet<>();
    private int cont;

    public void ControladorMetazoo() {
        metazoos = new HashSet<>();
        cont = 0;
    }

    public void guardar(Metazoo objeto) {
        cont++;
        objeto.setCodigo(cont);
        metazoos.add(objeto);
    }

    public Metazoo read(int codigo) {
        for (Metazoo objeto : this.metazoos) {
            if (objeto.getCodigo() == codigo) {
                return objeto;
            }
        }
        return null;
    }

    public void update(Metazoo objeto) {
        if (metazoos.contains(objeto)) {
            metazoos.remove(objeto);
            metazoos.add(objeto);
        }
    }

    public void delete(int codigo) {
        for (Metazoo metazoo : metazoos) {
            if (metazoo.getCodigo() == codigo) {
                metazoos.remove(metazoo);
                break;
            }
        }
    }

    public void listar() {
        for (Metazoo objeto : this.metazoos) {
            System.out.println(objeto.getNombre());
        }
    }
}
