
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Pez;
import java.util.Map;
import java.util.TreeMap;

public class ControladorPez {

    private Map<Integer, Pez> peces;
    private int cont;

    public void ControladorPez() {
        peces = new TreeMap();
        cont=0;
    }

    public void guardar(Pez objeto) {
        cont++;
        objeto.setCodigo(cont);
        peces.put(cont, objeto);
    }
    
    public Pez read(int codigo){
        return peces.get(codigo);
    }
    
    public void update (Pez objeto){
        for (int i=0;i<peces.size();i++){
            Pez elemento=peces.get(i);
            if (elemento.getCodigo()==objeto.getCodigo()){
                peces.remove(i);
                peces.put(objeto.getCodigo(),objeto);
                break;
            }
        }
    }
    
    public void delete(Pez objeto){
        for (int i=0;i<peces.size();i++){
            Pez elemento=peces.get(i);
            if (elemento.getCodigo()==objeto.getCodigo()){
                peces.remove(i);
                break;
            }
        }
    }

}
