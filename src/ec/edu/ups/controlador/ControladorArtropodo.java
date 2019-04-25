package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Artropodo;
import java.util.ArrayList;
import java.util.List;

public class ControladorArtropodo {

    private List<Artropodo> artropodos = new ArrayList<>();
    private int cont;

    public void ControladorPez() {
        artropodos = new ArrayList<>();
        cont = 0;
    }

    public void guardar(Artropodo objeto) {
        cont++;
        objeto.setCodigo(cont);
        artropodos.add(objeto);
    }

    public Artropodo read(int codigo) {
        for (Artropodo objeto : this.artropodos) {
            if (objeto.getCodigo() == codigo) {
                return objeto;
            }
        }
        return null;
    }

    public void update(Artropodo objeto) {
        for (int i = 0; i < artropodos.size(); i++) {
            Artropodo elemento = artropodos.get(i);
            if (elemento.getCodigo() == objeto.getCodigo()) {
                artropodos.set(i, objeto);
                break;
            }
        }
    }

    public void delete(Artropodo objeto) {
        for (int i = 0; i < artropodos.size(); i++) {
            Artropodo elemento = artropodos.get(i);
            if (elemento.getCodigo() == objeto.getCodigo()) {
                artropodos.remove(i);
                break;
            }
        }
    }

    public void listar() {
        for (Artropodo objeto : this.artropodos) {
            System.out.println(objeto.getNombre());
        }
    }
}
