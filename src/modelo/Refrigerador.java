package modelo;

public class Refrigerador extends Producto {
    private String gastoElectrico;
    private int puertas;

    public Refrigerador() {
    }

    public Refrigerador(String gastoElectrico, int puertas) {
        this.gastoElectrico = gastoElectrico;
        this.puertas = puertas;
    }

    public Refrigerador(String precio, int cantidadDisponible, String gastoElectrico, int puertas) {
        super(precio, cantidadDisponible);
        this.gastoElectrico = gastoElectrico;
        this.puertas = puertas;
    }
}
