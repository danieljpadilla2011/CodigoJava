public abstract class FiguraGeometrica {
    private int numeroLados;

    public FiguraGeometrica(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public void mostrarNumeroLados() {
        System.out.println("El numero de lados es: " + numeroLados);
    }

    public abstract float area();

    public abstract float perimetro();

}
