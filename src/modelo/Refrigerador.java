package modelo;

import interfaces.ProductoInterface;

public class Refrigerador extends Producto implements ProductoInterface {
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

    public String getGastoElectrico() {
        return gastoElectrico;
    }

    public void setGastoElectrico(String gastoElectrico) {
        this.gastoElectrico = gastoElectrico;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Refrigerador{" +
                "gastoElectrico='" + gastoElectrico + '\'' +
                ", puertas=" + puertas +
                ", precio=" + getPrecio() +
                ", cantidadDisponibles=" + getCantidadDisponible() +
                '}';
    }

    @Override
    public void cambiarPrecio() {
        System.out.println("cambiar precio en refrigerador");
    }

    @Override
    public void disponilbles() {
        System.out.println("disponibles en refrigerador");
    }
}
