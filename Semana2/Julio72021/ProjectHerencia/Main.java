public class Main {
    public static void main(String[] args) {
        // Estudiante estudiante = new Estudiante();

        Estudiante estudiante = new Estudiante("Marla", 25.0f, 12345, 67892);
        estudiante.mostrarEdad();
        System.out.println(estudiante.getNombre());
        System.out.println(estudiante.getNumeroCarnet());

        Profesor profesor1 = new Profesor("Milena", 48.0f, 8652, "Derecho");
        profesor1.mostrarEdad();

        System.out.println(profesor1.getNombre());
        System.out.println(profesor1.getMateriaEsp());
    }

}
