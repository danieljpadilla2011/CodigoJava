public class SegundaClase {
    public static void main(String[] args) {
        Circulo circ1=new Circulo();
        circ1.setRadio(4.0f);        
        System.out.println("El radio es: "+ circ1.getRadio());
        System.out.println("El área del círculo es: "+circ1.calcularArea());               
    }
}

class Circulo{
    private Float radio;
    private final Float PI=3.1416f;

    public Float getRadio() {
        return this.radio;
    }

    public void setRadio(Float radio) {
        this.radio = radio;
    }
    
    // public Double calcularArea(){
    //     Double area;
    //     area = PI*Math.pow(this.radio, 2);
    //     return area;
    // }

    public float calcularArea(){
        float area;
        area = PI*(float)Math.pow(this.radio, 2);
        return area;
    }

    

}