import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private boolean estaPagado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estaPagado = false;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void pagar() {
        estaPagado = true;
    }

    public String toString() {
        return "Pedido del cliente: " + cliente.getNombre() + ", Total: " + calcularTotal();
    }
}
