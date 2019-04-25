
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Ave;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ControladorAve {

    private SortedSet<Ave> listaOrdenada;
    private int codigo;

    public ControladorAve() {
    
        listaOrdenada = new TreeSet<>();
        codigo = 1;
    
    }

    public void guardar(Ave objeto){
        codigo ++;
        objeto.setCodigo(codigo);
        listaOrdenada.add(objeto);
    }
    
    public Ave read(int codigo){
        for (Ave Ave : listaOrdenada) {
            if(Ave.getCodigo() == codigo){
                return Ave;
            }
        }
        return null;
    }
    
    public void update(Ave objeto){
        if(listaOrdenada.contains(objeto)){
            listaOrdenada.remove(objeto);
            listaOrdenada.add(objeto);
        }
    }
    
    public void delete(int codigo){
        for (Ave Ave : listaOrdenada) {
            if(Ave.getCodigo() == codigo){
                listaOrdenada.remove(Ave);
            break;
            }
            
        }
    }

    public void imprimir(){
        System.out.println("Lista Ordenada por Nombre");
        for (Ave Ave : listaOrdenada) {
            System.out.println(Ave.getNombre());
            
        }
    }
    
}