public final class Caminhao extends Veiculo {

    private final double capacidadeCargaToneladas;

    private static final double TAXA_SOBRECARGA = 0.10; // 10%
    private static final double ALIQUOTA_IPVA   = 0.015; // 1,5%


    public Caminhao(String placa, String marca, double valorLocacaoDiaria,
                    int anoFabricacao, double precoFipe,
                    double capacidadeCargaToneladas) {

        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);

        if (capacidadeCargaToneladas <= 0)
            throw new IllegalArgumentException(
                    "Capacidade de carga deve ser positiva. Recebido: " + capacidadeCargaToneladas);

        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
    }

    @Override
    public double alugarVeiculo(double pesoCarga, int dias) {
        if (pesoCarga < 0)
            throw new IllegalArgumentException(
                    "Peso da carga não pode ser negativo. Recebido: " + pesoCarga);
        if (dias <= 0)
            throw new IllegalArgumentException(
                    "Número de dias deve ser positivo. Recebido: " + dias);

        double totalDiarias = valorLocacaoDiaria * dias;

        if (pesoCarga > capacidadeCargaToneladas) {
            double sobrecarga = totalDiarias * TAXA_SOBRECARGA;
            System.out.printf(
                    "  [SOBRECARGA] Carga de %.2f t excede a capacidade de %.2f t. " +
                            "Acréscimo: R$ %.2f%n",
                    pesoCarga, capacidadeCargaToneladas, sobrecarga);
            totalDiarias += sobrecarga;
        }

        return totalDiarias;
    }


    @Override
    public double calcularIpva() {
        if (isIsento()) return 0.0;
        return precoFipe * ALIQUOTA_IPVA;
    }

    public double getCapacidadeCargaToneladas() { return capacidadeCargaToneladas; }

    @Override
    public String toString() {
        return "Caminhao " + super.toString()
                + String.format(" | Capacidade: %.1f t", capacidadeCargaToneladas);
    }
}