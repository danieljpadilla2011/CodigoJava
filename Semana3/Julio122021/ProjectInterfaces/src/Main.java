public class Main {
    public static void main(String[] args) {
        Integer costoTotal;
        Camion camion1 = new Camion("KFQ717", "JAC", 45000, 3);
        System.out.println("Datos del Camion");
        System.out.println("Placa: " + camion1.getPlaca());
        System.out.println("Marca: " + camion1.getMarca());
        System.out.println("Numero de Ejes: " + camion1.getNumeroEjes());
        System.out.println("Precio: " + camion1.getPrecio());
        costoTotal = camion1.calcularCosto(250);
        System.out.println("El costo total mas IVA es de: " + costoTotal + "\n");

        Auto auto1 = new Auto("SMN065", "Chevrolet", 20000, 6, TipoVehiculo.SEDAN);
        System.out.println("Datos del Auto");
        System.out.println("Placa: " + auto1.getPlaca());
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Numero de Air Bags: " + auto1.getNumeroAirBags());
        System.out.println("El tipo es: " + auto1.getTipo());
        System.out.println("Precio: " + auto1.getPrecio());
        costoTotal = auto1.calcularCosto(120);
        System.out.println("El costo total mas IVA es de: " + costoTotal);
        System.out.println("El valor del arancel pagado fue de: " + auto1.calcularArancel(costoTotal));

    }

}
