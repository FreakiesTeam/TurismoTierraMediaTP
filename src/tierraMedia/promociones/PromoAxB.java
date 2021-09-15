package tierraMedia.promociones;

import tierraMedia.atracciones.Atraccion;
import tierraMedia.atracciones.TipoAtraccion;

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

    public Atraccion getAtraccionGratis(){
        return this.atraccionGratis;
    }

    @Override
    public List<Atraccion> getAtraccionesTotales(){
        List<Atraccion> atracciones = super.getAtracciones();
        atracciones.add(this.atraccionGratis);
        return atracciones;
    }

    @Override
    public boolean tieneCupo() {
        return super.tieneCupo() && this.atraccionGratis.tieneCupo();
    }

    @Override
    public void actualizarCupo() {
        super.actualizarCupo();
        this.atraccionGratis.actualizarCupo();
    }

}
