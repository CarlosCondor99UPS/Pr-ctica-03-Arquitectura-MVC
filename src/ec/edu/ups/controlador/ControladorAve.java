
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Ave;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ControladorAve {

    private SortedSet<Ave> aves;
    private int codigo;

    public ControladorAve() {
        aves = new TreeSet<>();
        codigo = 0;
    }

    public void guardar(Ave objeto){
        codigo ++;
        objeto.setCodigo(codigo);
        aves.add(objeto);
    }
    
    public Ave read(int codigo){
        for (Ave Ave : aves) {
            if(Ave.getCodigo() == codigo){
                return Ave;
            }
        }
        return null;
    }
    
    public void update(Ave objeto){
        if(aves.contains(objeto)){
            aves.remove(objeto);
            aves.add(objeto);
        }
    }
    
    public void delete(int codigo){
        for (Ave ave : aves) {
            if(ave.getCodigo() == codigo){
                aves.remove(ave);
            break;
            }
            
        }
    }

    
}