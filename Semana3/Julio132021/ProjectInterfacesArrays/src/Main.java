public class Main {
    public static void main(String[] args) {

        Vehiculo[] vehiculos = new Vehiculo[4];

        vehiculos[0] = new Auto("SMN065", "Chevrolet", 20000, 6, TipoVehiculo.SEDAN);
        vehiculos[1] = new Camion("KFQ717", "JAC", 45000, 3);
        vehiculos[2] = new Vehiculo("IRY256", "HondaMoto", 1800);
        vehiculos[3] = new Vehiculo("PPP", "BYKE", 300);

        Total respuesta = new Total(vehiculos);
        respuesta.presentarTotales();

    }

}
