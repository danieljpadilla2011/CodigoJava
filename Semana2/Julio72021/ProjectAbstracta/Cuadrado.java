public class Cuadrado extends FiguraGeometrica {
    private float lado;

    public Cuadrado(float lado, int cantLados) {
        super(cantLados);
        this.lado = lado;
    }

    @Override
    public float area() {
        return (lado * lado);
    }

    @Override
    public float perimetro() {
        return (4 * lado);
    }

}
