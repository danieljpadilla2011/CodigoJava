public interface Iarancel {
    public default Double calcularArancel(Integer costoTotal) {
        return costoTotal * 0.35;
    }

}
