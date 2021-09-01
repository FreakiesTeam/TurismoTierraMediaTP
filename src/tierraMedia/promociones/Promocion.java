package tierraMedia.promociones;

import tierraMedia.Atraccion;
import tierraMedia.Producto;
import tierraMedia.TipoAtraccion;

import java.util.List;

public abstract class Promocion implements Producto, Comparable<Promocion> {
    protected String nombre;
    protected List<Atraccion> atracciones;
    protected TipoAtraccion tipoAtraccion;


    public Promocion(String nombre, TipoAtraccion tipoAtraccion, List<Atraccion> atracciones) {
        this.nombre = nombre;
        this.tipoAtraccion = tipoAtraccion;
        this.atracciones = atracciones;
    }

    //TODO Los getter estan públicos para poder testear pero no está bien eso?
    public String getNombre() {
        return nombre;
    }

    public List<Atraccion> getAtracciones() {
        return atracciones;
    }

    public TipoAtraccion getTipoAtraccion() {
        return tipoAtraccion;
    }

    @Override
    public int compareTo(Promocion otraPromo) {
        return this.nombre.compareTo(otraPromo.nombre);
    }

    public Double getTiempo() {
        double total = 0;
        for (int i = 0; i < this.atracciones.size(); i++) {
            total += this.atracciones.get(i).getTiempo();
        }
        return total;
    }

    public int getCosto() {
        int total = 0;

        for (int i = 0; i < this.atracciones.size(); i++) {
            total += this.atracciones.get(i).getCosto();
        }
        return total;
    }

}
