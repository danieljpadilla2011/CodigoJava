public class Persona{
    public String nombre;
    public float edad;
    public int documentoid;

    public void mostrarEdad(){
        System.out.println("La edad es: "+edad);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getEdad() {
        return edad;
    }
    public void setEdad(float edad) {
        this.edad = edad;
    }
    public int getDocumentoid() {
        return documentoid;
    }
    public void setDocumentoid(int documentoid) {
        this.documentoid = documentoid;
    }
}
