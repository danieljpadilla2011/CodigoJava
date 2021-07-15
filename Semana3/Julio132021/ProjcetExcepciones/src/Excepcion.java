public class Excepcion {
    public static void main(String[] args) {
        int div = 8;
        int x = 0;
        int y;
        try {
            y = div / x;

        } catch (Exception e) {
            System.out.println("Se activó la excepción");
        }

    }
}