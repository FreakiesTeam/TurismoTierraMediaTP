package tierraMedia;

public class Atraccion implements Producto {
    private String nombre;
    private TipoAtraccion tipo;
    private Integer costo;
    private Double tiempo;
    private int cupoDiario;
    private int cupoDisponible;

    public Atraccion(String nombre, int costo, double tiempo, int cupoDiario, String tipo) {
        this.nombre = nombre;
        this.tipo = TipoAtraccion.valueOf(tipo.toUpperCase());
        this.costo = costo;
        this.tiempo = tiempo;
        this.cupoDiario = cupoDiario;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoAtraccion getTipo() {
        return tipo;
    }

    public Double getTiempo() {
        return tiempo;
    }

    public int getCupoDiario() {
        return cupoDiario;
    }

    public int getCosto() {
        return this.costo;
    }

}
