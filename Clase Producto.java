public class Producto {
    private String nombre;
    private boolean esImportado;
    private double precio;

    public Producto(String nombre, boolean esImportado, double precio) {
        this.nombre = nombre;
        this.esImportado = esImportado;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esImportado() {
        return esImportado;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", Importado: " + esImportado + ", Precio: " + precio;
    }
}
