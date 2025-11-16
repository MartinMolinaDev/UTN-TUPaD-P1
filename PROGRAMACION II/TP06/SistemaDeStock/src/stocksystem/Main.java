package stocksystem;

public class Main {

    public static void main(String[] args) {
        Inventario inv = new Inventario();
        inv.agregarProducto(new Producto("P1", "Arroz", 800, 50, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P2", "TV", 2500, 10, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P3", "Remera", 1500, 30, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("P4", "Silla", 3000, 5, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("P5", "Mouse", 1200, 20, CategoriaProducto.ELECTRONICA));
        inv.listarProductos();
    }
}
