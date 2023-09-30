

/**
 *
 * @author Hernan
 */
public class Prinicipal {
    
    public static void main(String[] args) {
        
        Pintura pintura1 = new Pintura(1, 1,15000, 10, "Pintura al temple", "Ceresita");
        Pintura pintura2 = new Pintura(2, 2,30000, 20, "Pintura al aceite", "Ceresita");
        
        Martillo martillo1 = new Martillo('G',2, 5000, 5, "Martillo de bola", "martillito");
        Martillo martillo2 = new Martillo('G',3, 5500, 10, "Martillo común de carpintero ", "martillito");
        
        //obtener total
        System.out.println("Total: $ " + pintura1.calcularTotal(1, "lunes"));
        System.out.println("Total: $ " + martillo1.calcularTotal(3, "Viernes"));
        
        //mostrar atributos
        System.out.println(pintura1);
        System.out.println(martillo1);
        
        System.out.println("********COLECCION*********");
        //usando colecciones
        Coleccion col = new Coleccion();
        col.agregarProducto(pintura1);
        col.agregarProducto(pintura2);
        col.agregarProducto(martillo1);
        col.agregarProducto(martillo2);
        
        col.listarProductos();
        
    }
    
}
