public class Factura {
    private Pedido pedido;
    private double total;

    public Factura(Pedido pedido) {
        this.pedido = pedido;
        this.total = pedido.calcularTotal();
    }

    public void imprimirFactura() {
        System.out.println("Factura para el pedido de: " + pedido);
        System.out.println("Total a pagar: " + total);
    }
}
