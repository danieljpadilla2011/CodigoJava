public class Profesor extends Persona {
    private String materiaEsp;

    public Profesor(String nombre, float edad, int documentoid, String materiaEsp) {
        super(nombre, edad, documentoid);
        this.materiaEsp = materiaEsp;
    }

    public void usarSuper() {
        System.out.println(super.documentoid);
        System.out.println(super.edad);
        System.out.println(super.nombre);
        super.mostrarEdad();
    }

    @Override
    public void mostrarEdad() {
        // super.mostrarEdad();
        System.out.println("La edad del Profesor es: " + edad);
    }

    public String getMateriaEsp() {
        return materiaEsp;
    }

    public void setMateriaEsp(String materiaEsp) {
        this.materiaEsp = materiaEsp;
    }

}

