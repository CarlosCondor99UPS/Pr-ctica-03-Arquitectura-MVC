/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Metazoo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tians
 */
public class ControladorMetazoo {
    private List<Metazoo> metazoos= new ArrayList<>();;

    public void ControladorPez() {
        metazoos = new ArrayList<>();
    }

    public void guardar(Metazoo ojeto) {
        metazoos.add(ojeto);
    }
    
    public Metazoo read(int codigo){
        for (Metazoo objeto : this.metazoos){
            if (objeto.getCodigo()==codigo){
                return objeto;
            }
        }
        return null;
    }
    
    public void update (Metazoo objeto){
        for (int i=0;i<metazoos.size();i++){
            Metazoo elemento=metazoos.get(i);
            if (elemento.getCodigo()==objeto.getCodigo()){
                metazoos.set(i, objeto);
                break;
            }
        }
    }
    
    public void delete(Metazoo objeto){
        for (int i=0;i<metazoos.size();i++){
            Metazoo elemento=metazoos.get(i);
            if (elemento.getCodigo()==objeto.getCodigo()){
                metazoos.remove(i);
                break;
            }
        }
    }
}
