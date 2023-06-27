public class ProductoTest {
    public static void main(String[] args) {

        Producto[] productos = {
                new Producto("jose",new double[]{8},5),
                new Producto("juan",new double[]{8},2),
                new Producto("gian", new double[]{4},81)
        };

        for (Producto producto : productos) {
            System.out.println("nombre: " + producto.getNombre());
            System.out.println("valor total: $" + producto.getValorTotal());
            System.out.println("--------------------");

        }



    }
}
