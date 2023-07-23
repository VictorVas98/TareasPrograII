public class Electronico extends Producto {
    private String marca;
    public Electronico(int id, String nombre, double precio, int cantidad, String marca) {
        super(id, nombre, precio, cantidad);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double calcularDescuento(double porcentajeDescuento) {
        double descuento = getPrecio() * porcentajeDescuento / 100.0;
        return descuento;
    }

}
