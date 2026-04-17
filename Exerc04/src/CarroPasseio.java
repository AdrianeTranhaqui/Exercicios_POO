public final class CarroPasseio extends Veiculo {

    public CarroPasseio(String placa, String marca, double valorLocacaoDiaria, int anoFabricacao, double precoFipe) {
        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);
    }

    public void alugarCarro(){

    }

    public void calculoIpva(){

    }

    @Override
    public String alugarVeiculo(double pesoCarga, int dias) {
        return "";
    }

    @Override
    public double calcularIpva() {
        return 0;
    }
}
