package tierraMedia.promociones;

import tierraMedia.Atraccion;
import tierraMedia.TipoAtraccion;
import tierraMedia.promociones.Promocion;

import java.util.List;

public class PromoAxB extends Promocion {
    private Atraccion atraccionGratis;

    public PromoAxB(String nombre, TipoAtraccion tipoAtraccion, List<Atraccion> atracciones, Atraccion atraccionGratis) {
        super(nombre, tipoAtraccion, atracciones);
        this.atraccionGratis = atraccionGratis;
    }

    @Override
    public Double getTiempo() {
        double tiempo = super.getTiempo();

        return tiempo + this.atraccionGratis.getTiempo();
    }


}
