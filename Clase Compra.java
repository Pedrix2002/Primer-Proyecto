import java.util.ArrayList;
import java.util.List;

public class Compra {
    private List<Producto> productosComprados;

    public Compra() {
        this.productosComprados = new ArrayList<>();
    }

    // Método para agregar productos comprados
    public void agregarProducto(Producto producto) {
        productosComprados.add(producto);
        System.out.println("Producto comprado: " + producto.getNombre());
    }

    // Método para mostrar los productos comprados
    public void mostrarProductosComprados() {
        System.out.println("Productos comprados:");
        for (Producto producto : productosComprados) {
            System.out.println("- " + producto);
        }
    }
}
