public class Estudiante extends Persona {

    private int numeroCarnet;

    public Estudiante(String nombre, float edad, int documentoid, int numeroCarnet ) {
        this.nombre=nombre;
        this.edad=edad;
        this.documentoid=documentoid;
        this.numeroCarnet=numeroCarnet;
    }

    public int getNumeroCarnet() {
        return numeroCarnet;
    }

    public void setNumeroCarnet(int numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }


    
    
}
