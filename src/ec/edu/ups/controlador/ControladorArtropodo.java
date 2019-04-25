/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Artropodo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tians
 */
public class ControladorArtropodo {
    private List<Artropodo> artropodos= new ArrayList<>();;

    public void ControladorPez() {
        artropodos = new ArrayList<>();
    }

    public void guardar(Artropodo ojeto) {
        artropodos.add(ojeto);
    }
    
    public Artropodo read(int codigo){
        for (Artropodo objeto : this.artropodos){
            if (objeto.getCodigo()==codigo){
                return objeto;
            }
        }
        return null;
    }
    
    public void update (Artropodo objeto){
        for (int i=0;i<artropodos.size();i++){
            Artropodo elemento=artropodos.get(i);
            if (elemento.getCodigo()==objeto.getCodigo()){
                artropodos.set(i, objeto);
                break;
            }
        }
    }
    
    public void delete(Artropodo objeto){
        for (int i=0;i<artropodos.size();i++){
            Artropodo elemento=artropodos.get(i);
            if (elemento.getCodigo()==objeto.getCodigo()){
                artropodos.remove(i);
                break;
            }
        }
    }
}
