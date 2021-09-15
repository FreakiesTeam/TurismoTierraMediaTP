package tierraMedia;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tierraMedia.atracciones.Atraccion;
import tierraMedia.atracciones.TipoAtraccion;
import tierraMedia.promociones.PromoAbsoluta;
import tierraMedia.promociones.PromoAxB;
import tierraMedia.promociones.PromoPorcentual;
import tierraMedia.promociones.Promocion;

import java.util.ArrayList;
import java.util.List;


public class UsuarioTest {
    Usuario usuario;
    Producto producto;
    PromoPorcentual porcentual;
    PromoAbsoluta absoluta;
    PromoAxB axb;
    Atraccion atraccionGratis;
    List<Atraccion> atracciones;
    Atraccion atraccion1,atraccion2;
    List<Promocion> promociones;

    @Before
    public void setup() {
        usuario = new Usuario("Marcos", "PAISAJE",10,10);

        atracciones = new ArrayList<>();
        atraccion1 = new Atraccion("atraccion1", 40, 1, 1, "AVENTURA");
        atraccion2 = new Atraccion("atraccion2", 60, 2, 2, "AVENTURA");
        atracciones.add(atraccion1);
        atracciones.add(atraccion2);
        atraccionGratis = new Atraccion("atraccionGratis", 10, 3, 3, "AVENTURA");

        axb = new PromoAxB("PROMO AXB", TipoAtraccion.valueOf("AVENTURA"), atracciones, atraccionGratis);
        absoluta = new PromoAbsoluta("PROMO absoluta", TipoAtraccion.valueOf("AVENTURA"), atracciones, 5);
        porcentual = new PromoPorcentual("PROMO Porcentual", TipoAtraccion.valueOf("AVENTURA"), atracciones, 10);

        promociones = new ArrayList<>();
        promociones.add(axb);
        promociones.add(absoluta);
        promociones.add(porcentual);

    }

    @Test
    public void noSeVisitoAtraccionTest(){
        Atraccion atraccion3 = new Atraccion("atraccion3", 60, 2, 2, "AVENTURA");
        usuario.setAtraccionesCompradas(atracciones);
        Assert.assertTrue(usuario.noSeVisito(atraccion3));
    }

    @Test
    public void seVisitoAtraccionEnPromocionTest() {
        atracciones.add(atraccionGratis);
        usuario.setAtraccionesCompradas(atracciones);
        Assert.assertFalse(usuario.noSeVisito(axb));
    }

}
