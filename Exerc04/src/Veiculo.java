abstract sealed class Veiculo implements Fretavel, Tributavel permits Caminhao, CarroPasseio {

    protected String placa;
    protected String marca;
    protected double valorLocacaoDiaria;
    protected int anoFabricacao;
    protected double precoFipe;

    private static final int ANO_ATUAL = 2026;
    private static final int LIMITE_ISENCAO_ANOS = 20;

    public Veiculo(String placa, String marca, double valorLocacaoDiaria, int anoFabricacao, double precoFipe) {
        this.placa = placa;
        this.marca = marca;
        this.valorLocacaoDiaria = valorLocacaoDiaria;
        this.anoFabricacao = anoFabricacao;
        this.precoFipe = precoFipe;

        if (placa == null || placa.isBlank())
            throw new IllegalArgumentException("Placa não pode ser nula ou vazia.");

        if (marca == null || marca.isBlank())
            throw new IllegalArgumentException("Marca não pode ser nula ou vazia.");

        if (valorLocacaoDiaria <= 0)
            throw new IllegalArgumentException("Valor de locação diária deve ser positivo. Recebido: " + valorLocacaoDiaria);

        if (anoFabricacao < 1886 || anoFabricacao > ANO_ATUAL)
            throw new IllegalArgumentException("Ano de fabricação inválido: " + anoFabricacao);

        if (precoFipe <= 0)
            throw new IllegalArgumentException("Preço FIPE deve ser positivo. Recebido: " + precoFipe);

    }

    protected boolean isIsento() {
        return (ANO_ATUAL - anoFabricacao) > LIMITE_ISENCAO_ANOS;
    }



    public String getPlaca() {return placa;}
    public String getMarca() {return marca;}
    public double getValorLocacaoDiaria() {return valorLocacaoDiaria;}
    public int getAnoFabricacao() {return anoFabricacao;}
    public double getPrecoFipe() {return precoFipe;}



    public void setValorLocacaoDiaria(double valor) {
        if (valor <= 0)
            throw new IllegalArgumentException(
                    "Valor de locação diária deve ser positivo. Recebido: " + valor);
        this.valorLocacaoDiaria = valor;
    }

    public void setPrecoFipe(double preco) {
        if (preco <= 0)
            throw new IllegalArgumentException(
                    "Preço FIPE deve ser positivo. Recebido: " + preco);
        this.precoFipe = preco;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s | Ano: %d | Diária: R$ %.2f | FIPE: R$ %.2f",
                placa, marca, anoFabricacao, valorLocacaoDiaria, precoFipe);
    }
}
