public class Auto extends Vehiculo implements Iarancel {
    private Integer numeroAirBags;
    private TipoVehiculo tipo;

    public Auto(String placa, String marca, Integer precio, Integer numeroAirBags, TipoVehiculo tipo) {
        super(placa, marca, precio);
        this.numeroAirBags = numeroAirBags;
        this.tipo = tipo;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public Integer getNumeroAirBags() {
        return numeroAirBags;
    }

    public void setNumeroAirBags(Integer numeroAirBags) {
        this.numeroAirBags = numeroAirBags;
    }

    @Override
    public Integer calcularCosto(Integer factor) {
        Integer costoAuto = this.precio + (this.numeroAirBags * factor);
        costoAuto = costoAuto + super.calcularCosto(10);
        return costoAuto = costoAuto + (costoAuto * IVA / 100);
    }

}
