import java.util.ArrayList;
import java.util.List;

public class Venta {
    private List<Producto> productosVendidos;
    private Cliente cliente;
    
    public Venta(Cliente cliente) {
        this.cliente = cliente;
        this.productosVendidos = new ArrayList<>();
    }

    // Método para agregar productos vendidos
    public void agregarProductoVendido(Producto producto) {
        productosVendidos.add(producto);
        System.out.println("Producto vendido: " + producto.getNombre() + " al cliente " + cliente.getNombre());
    }

    // Método para calcular el total de la venta
    public double calcularTotalVenta() {
        double total = 0;
        for (Producto producto : productosVendidos) {
            total += producto.getPrecio();
        }
        return total;
    }

    // Método para generar un recibo de la venta
    public void generarRecibo() {
        System.out.println("Recibo para el cliente: " + cliente.getNombre());
        for (Producto producto : productosVendidos) {
            System.out.println("- " + producto.getNombre() + ": $" + producto.getPrecio());
        }
        System.out.println("Total: $" + calcularTotalVenta());
    }
}
