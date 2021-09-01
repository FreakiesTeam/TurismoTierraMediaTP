package tierraMedia;

import tierraMedia.servicios.GestorDeSugerencias;

import java.util.List;

public class Usuario {
    private String nombre;
    private int monedas;
    private TipoAtraccion tipoPreferido;
    private int tiempoDisponible;
    private Producto[] itinerario;
    private Atraccion[] atraccionesVisitadas;

    public Usuario(String nombre, String preferencia, int monedas, int tiempo) {
        this.nombre = nombre;
        this.tipoPreferido = TipoAtraccion.valueOf(preferencia.toUpperCase());
        this.monedas = monedas;
        this.tiempoDisponible = tiempo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getMonedas() {
        return monedas;
    }

    public TipoAtraccion getTipoPreferido() {
        return tipoPreferido;
    }

    public int getTiempoDisponible() {
        return tiempoDisponible;
    }

}
