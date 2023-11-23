
package defini;

public class Defin {
    private String id;
    private String producto;
    private double precio;
    private String compania;

    public Defin(String id, String producto, double precio, String compania) {
        this.id = id;
        this.producto = producto;
        this.precio = precio;
        this.compania = compania;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
    
}
