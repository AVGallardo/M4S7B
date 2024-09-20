package modelo;

import interfaces.CocinaInterface;

public class Cocina extends Producto implements CocinaInterface {
    private int quemadores;

    public Cocina() {

    }
    public Cocina(String precio, int cantidadDisponible, int quemadores) {
        super(precio, cantidadDisponible);
        this.quemadores = quemadores;
    }

    public int getQuemadores() {
        return quemadores;
    }

    public void setQuemadores(int quemadores) {
        this.quemadores = quemadores;
    }

    @Override
    public String toString() {
        return "Cocina{" +
                "precio=" + getPrecio() +
                ", cantidadDisponible=" + getCantidadDisponible() +
                ", quemadores=" + quemadores +
                '}';
    }

    @Override
    public void incluirGas() {
        System.out.println("Con gas incluido");
    }
}
