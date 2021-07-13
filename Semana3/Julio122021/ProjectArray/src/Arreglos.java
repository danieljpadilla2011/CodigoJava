public class Arreglos {
    public static void main(String[] args) {
        int[] arreglo = new int[3];
        int j = 10;

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = j;
            j++;
        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Elemento en el índice " + i + " : " + arreglo[i]);
        }

    }

}
