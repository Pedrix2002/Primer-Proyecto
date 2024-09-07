public class Main {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente1 = new Cliente("Juan Pérez", "Calle Falsa 123");

        // Crear productos
        Producto sombrilla = new Producto("Sombrilla", false, 100);
        Producto taza = new Producto("Taza", true, 50);

        // Crear compra (adquisición de productos)
        Compra compra = new Compra();
        compra.agregarProducto(sombrilla);
        compra.agregarProducto(taza);

        // Mostrar productos comprados
        compra.mostrarProductosComprados();

        // Crear pedido (asociado al cliente)
        Pedido pedido = new Pedido(cliente1);
        pedido.agregarProducto(sombrilla);
        pedido.agregarProducto(taza);

        // Imprimir total del pedido
        System.out.println(pedido);

        // Generar factura
        Factura factura = new Factura(pedido);
        factura.imprimirFactura();

        // Crear venta (productos vendidos)
        Venta venta = new Venta(cliente1);
        venta.agregarProductoVendido(sombrilla);
        venta.agregarProductoVendido(taza);

        // Generar recibo de la venta
        venta.generarRecibo();
    }
}
