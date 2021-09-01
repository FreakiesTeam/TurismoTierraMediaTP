package tierraMedia.servicios;

import tierraMedia.Atraccion;
import tierraMedia.Producto;
import tierraMedia.Usuario;
import tierraMedia.promociones.Promocion;

import java.util.ArrayList;
import java.util.List;

public class GestorDeSugerencias {
    private List<Usuario> usuarios;
    private List<Atraccion> atracciones;
    private List<Promocion> promociones;
    private List<Producto> sugerencias;

    public GestorDeSugerencias(){
        this.sugerencias = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.atracciones = new ArrayList<>();
        this.promociones = new ArrayList<>();
    }

    public void cargarListas() {
        this.usuarios = ManejadorDeArchivos.cargarUsuarios("entrada/usuarios.txt");
        this.atracciones = ManejadorDeArchivos.cargarAtracciones("entrada/atracciones.txt");
        this.promociones = ManejadorDeArchivos.cargarPromociones("entrada/promociones.txt",this.atracciones);
    }

    public List<Atraccion> getAtracciones(){
        return this.atracciones;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Promocion> getPromociones() {
        return promociones;
    }

    private void generarSugerenciaPara(Usuario usuario){
        //TODO
    }

}
