public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto(1, "Playera", 40, 3);
        Producto producto2 = new Producto(2, "Pantalon", 150, 1);
        Producto electronico1 = new Electronico(3, "Telefono", 1500.99, 2, "Sony");

        Orden orden = new Orden();

        orden.agregarProducto(producto1);
        orden.agregarProducto(producto2);
        orden.agregarProducto(electronico1);

        orden.mostrarDetallesOrden();

        double porcentajeDescuento = 20;
        double descuentoElectronico = ((Electronico) electronico1).calcularDescuento(porcentajeDescuento);
        System.out.println("El descuento es de " + porcentajeDescuento + "% para " + electronico1.getNombre() + " " + descuentoElectronico);

        double nuevoPrecio = 19.99;
        producto1.setPrecio(nuevoPrecio);
        System.out.println("Este es el nuevo precio para " + producto1.getNombre() + ": " + nuevoPrecio);
        orden.mostrarDetallesOrden();
    }
}