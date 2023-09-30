

/**
 *
 * @author Hernan
 */
public interface ProductoDescontable {
    
    //solamente declara variables ----> final ----> constantes, que no cambian
    // metodos abstractos---> declarados, escritos no con código entre {} 
    
    public static final double porcentajeDescuento = 0.08;
    
    public abstract int calcularDescuento(String dia);
    
}
