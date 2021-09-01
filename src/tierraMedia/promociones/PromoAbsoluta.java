package tierraMedia.promociones;

import tierraMedia.Atraccion;
import tierraMedia.TipoAtraccion;

import java.util.List;

public class PromoAbsoluta extends Promocion {
    private int descuento;

    public PromoAbsoluta(String nombre, TipoAtraccion tipoAtraccion, List<Atraccion> atracciones, int monedas) {
        super(nombre, tipoAtraccion, atracciones);
        this.descuento = monedas;
    }

    @Override
    public int getCosto() {
        return super.getCosto() - this.descuento;
    }

}
