package tierraMedia;

import org.junit.Assert;
import org.junit.Test;
import tierraMedia.servicios.GestorDeSugerencias;

public class GestorDeSugerenciasTest {
    GestorDeSugerencias gestor = new GestorDeSugerencias();

    @Test
    public void cargarListasTest() {
        gestor.cargarListas();
        Assert.assertEquals(4, gestor.getUsuarios().size());
        Assert.assertEquals(8, gestor.getAtracciones().size());
        Assert.assertEquals(3, gestor.getPromociones().size());
    }
}
