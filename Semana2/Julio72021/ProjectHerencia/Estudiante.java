public class Estudiante extends Persona {

    private int numeroCarnet;

    public Estudiante(String nombre, float edad, int documentoid, int numeroCarnet) {
        super(nombre, edad, documentoid);
        this.numeroCarnet = numeroCarnet;
    }

    @Override
    public void mostrarEdad() {
        System.out.println("La edad del Estudiante es: " + edad);
    }

    public int getNumeroCarnet() {
        return numeroCarnet;
    }

    public void setNumeroCarnet(int numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }

}
