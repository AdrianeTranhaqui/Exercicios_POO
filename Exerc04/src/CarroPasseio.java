public final class CarroPasseio extends Veiculo {

    private static final double CARGA_MAXIMA_KG = 0.0;  // não transporta carga
    private static final double ALIQUOTA_IPVA   = 0.04; // 4%

    public CarroPasseio(String placa, String marca, double valorLocacaoDiaria,
                        int anoFabricacao, double precoFipe) {

        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);
    }


    @Override
    public double alugarVeiculo(double pesoCarga, int dias) {
        if (pesoCarga < 0)
            throw new IllegalArgumentException(
                    "Peso da carga não pode ser negativo. Recebido: " + pesoCarga);
        if (pesoCarga > CARGA_MAXIMA_KG)
            throw new IllegalArgumentException(
                    "CarroPasseio não suporta carga. Peso informado: " + pesoCarga);
        if (dias <= 0)
            throw new IllegalArgumentException(
                    "Número de dias deve ser positivo. Recebido: " + dias);

        return valorLocacaoDiaria * dias;
    }


    @Override
    public double calcularIpva() {
        if (isIsento()) return 0.0;
        return precoFipe * ALIQUOTA_IPVA;
    }

    @Override
    public String toString() {
        return "CarroPasseio " + super.toString();
    }
}
