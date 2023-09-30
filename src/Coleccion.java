
import java.util.ArrayList;



/**
 *
 * @author Hernan
 */
public class Coleccion {
    
    private ArrayList<Producto> listaProductos;

    public Coleccion() {
        listaProductos = new ArrayList<>();
        
    }
    
    public void agregarProducto(Producto prod)      
    {
        listaProductos.add(prod);
    }
    
    public void listarProductos()
    {
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
    }
    
    
    
}
