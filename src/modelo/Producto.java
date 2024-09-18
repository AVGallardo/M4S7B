package modelo;

public class Producto {
    private String precio;
    private int cantidadDisponible;

    public Producto() {
    }

    public Producto(String precio, int cantidadDisponible) {
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "precio='" + precio + '\'' +
                ", cantidadDisponible=" + cantidadDisponible +
                '}';
    }
}
