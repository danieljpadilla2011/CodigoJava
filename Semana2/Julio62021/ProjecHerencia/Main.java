public class Main {
    public static void main(String[] args) {
        Estudiante estudiante= new Estudiante("Marla", 25.3f, 12345, 67892);
        estudiante.mostrarEdad();
        System.out.println(estudiante.getNombre());
        System.out.println(estudiante.getNumeroCarnet());
    }
    
}
