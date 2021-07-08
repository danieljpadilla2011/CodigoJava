public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(3.0f, 4);
        // FiguraGeometrica fig1=new FiguraGeometrica(5)
        System.out.println("El area del cuadrado es: " + cuadrado1.area());
        cuadrado1.mostrarNumeroLados();
        System.out.println("El perimetro del cuadrado es: " + cuadrado1.perimetro());
    }

}
