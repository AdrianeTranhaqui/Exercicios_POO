public final class Caminhao extends Veiculo {

    private double CapacidadeCarga;

    public Caminhao(String placa, String marca, double valorLocacaoDiaria, int anoFabricacao, double precoFipe) {
        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);
    }


    public void alugarVeiculo(){

    }

    public double calcularIpva(){

        return 0;
    }

    @Override
    public String alugarVeiculo(double pesoCarga, int dias) {
        return "";
    }
}
