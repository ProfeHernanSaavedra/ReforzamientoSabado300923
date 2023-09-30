

/**
 *
 * @author Hernan
 */
public class Martillo extends Producto{

    private char tamaño; //G: Grande, P:pequeño

    public Martillo() {
        
    }

    public Martillo(char tamaño, int codigo, int precio, int stock, String tipo, String marca) {
        super(codigo, precio, stock, tipo, marca);
        this.setTamaño(tamaño);
        //this.tamaño = tamaño;
    }

    public char getTamaño() {
        return tamaño;
    }

    public void setTamaño(char tamaño) {
        if (tamaño == 'G' ||tamaño == 'P') {
            this.tamaño = tamaño;
        }
        else{
            System.out.println("Debe ingresar P: pequeño o G: grande");
        }
        
    }

    @Override
    public String toString() {
        return "Martillo{" + "tamano=" + tamaño + '}' + " " + super.toString();
    }
    
    @Override
    public int calcularDescuento(String dia) {
        
        int descuento = 0;
        dia = dia.toUpperCase();
        if (dia.equals("VIERNES")) {
            descuento = (int) (super.precio * ProductoDescontable.porcentajeDescuento);
        }
        return descuento;
    }
    
    
    
}
