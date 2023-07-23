import java.util.ArrayList;
import java.util.List;

public class Orden {
    private List<Producto> productos;

    public Orden() {
        productos = new ArrayList<>();
    }
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    public double calcularTotalOrden() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularPrecioTotal();
        }
        return total;
    }

    public void mostrarDetallesOrden() {
        System.out.println("Detalles:");
        for (Producto producto : productos) {
            producto.imprimirInformacion();
            System.out.println("Precio total: " + producto.calcularPrecioTotal());
        }
        System.out.println("Total de la orden: " + calcularTotalOrden());
    }
}
