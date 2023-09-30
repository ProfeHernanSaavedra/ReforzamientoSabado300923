

/**
 *
 * @author Hernan
 */
public abstract class Producto implements ProductoDescontable{
    
    protected int codigo,precio,stock;
    protected String tipo;
    protected String marca;

    public Producto() {
    }

    public Producto(int codigo, int precio, int stock, String tipo, String marca) {
        this.codigo = codigo;
        this.precio = precio;
        //this.stock = stock;
        this.setStock(stock);
        this.tipo = tipo;
        this.marca = marca;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >=0) {
            this.stock = stock;
        }else{
            System.out.println("El stock debe ser mayor a cero");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", precio=" + precio + ", stock=" + stock + ", tipo=" + tipo + ", marca=" + marca + '}';
    }
    
    
    public boolean validarStockVenta(int cantidadComprar)
    {
        if (cantidadComprar <= this.getStock()) {
            return true;
        }
        else{
            System.out.println("No hay stock");
            return false;
        }
    }
    
    
    public int calcularTotal(int cantidad,String dia)
    {
        int descuento = 0;
        int total = 0;
        if (this.validarStockVenta(cantidad)) {
            System.out.println(tipo + " Stock anterior " + stock);
            stock = stock-cantidad;
            System.out.println(tipo + " stock actual es: " + stock );
            descuento = calcularDescuento(dia);
            total = this.precio*cantidad - descuento * cantidad;
        }
        return total;
    }
   
    
}
