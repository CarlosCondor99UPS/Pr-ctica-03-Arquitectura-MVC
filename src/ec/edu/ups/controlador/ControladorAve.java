
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Ave;
import java.util.SortedSet;
import java.util.TreeSet;

public class ControladorAve {

    private SortedSet<Ave> aves=new TreeSet<>();
    private int cont;

    public ControladorAve() {
        cont = 0;
    }
    
    public void guardar(Ave objeto){
        cont ++;
        objeto.setCodigo(cont);
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
    
    public void listar (){
        for (Ave objeto : this.aves){
            System.out.println(objeto.toString());
        }
    }

    
}