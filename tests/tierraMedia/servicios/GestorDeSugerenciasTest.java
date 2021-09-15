package tierraMedia.servicios;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tierraMedia.Producto;
import tierraMedia.Usuario;
import tierraMedia.atracciones.Atraccion;
import tierraMedia.servicios.GestorDeSugerencias;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorDeSugerenciasTest {
    GestorDeSugerencias gestor = new GestorDeSugerencias();
    List<Producto> sugerencias = new ArrayList<>();
    Usuario usuario;

    @Before
    public void cargarListasTest() throws IOException {
        gestor.cargarUsuarios("entrada/usuarios.txt");
        gestor.cargarProductos("entrada/atracciones.txt","entrada/promociones.txt");
    }

    @Test
    public void generarSugerenciasUsuarioTest(){
        usuario = new Usuario("Sole", "PAISAJE", 0, 0);
        sugerencias = gestor.generarSugerenciasPara(usuario);

        Assert.assertEquals("Pack paisajes",sugerencias.get(0).getNombre());

        usuario = new Usuario("Sole", "AVENTURA", 0, 0);
        sugerencias = gestor.generarSugerenciasPara(usuario);

        Assert.assertEquals("Pack aventura",sugerencias.get(0).getNombre());

        usuario = new Usuario("Sole", "DEGUSTACIÓN", 0, 0);
        sugerencias = gestor.generarSugerenciasPara(usuario);

        Assert.assertEquals("Pack degustación",sugerencias.get(0).getNombre());
    }




}
