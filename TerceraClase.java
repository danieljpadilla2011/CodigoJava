public class TerceraClase {
    public static void main(String[] args) {
        Productos prod1 = new Productos(2500.0,0.19);
        System.out.println("El Precio es de: "+prod1.getPrecio()); 
        System.out.println("El  IVA es de: "+prod1.getIva());               
    }
    
}
class Productos{
    private Double precio;
    private Double iva;
    
    public Double getPrecio() {
        return precio;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Productos(Double precio, Double iva) {
        this.precio = precio;
        this.iva = iva;
        
    }

    



}
