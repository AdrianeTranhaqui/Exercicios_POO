public class Main {

    public static void main(String[] args) {

        System.out.println("=".repeat(60));
        System.out.println("       SISTEMA DE VEÍCULOS — TESTES");
        System.out.println("=".repeat(60));

        Caminhao caminhao;
        CarroPasseio carro;
        CarroPasseio carroAntigo;

        try {
            caminhao    = new Caminhao("ABC1D23", "Scania", 800.00, 2020, 350_000.00, 10.0);
            carro       = new CarroPasseio("XYZ9A87", "Toyota", 150.00, 2022, 90_000.00);
            carroAntigo = new CarroPasseio("OLD0000", "VW", 80.00, 2000, 20_000.00);

            System.out.println("\n--- Veículos criados ---");
            System.out.println(caminhao);
            System.out.println(carro);
            System.out.println(carroAntigo);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro na criação: " + e.getMessage());
            return;
        }


        System.out.println("\n--- Locação: caminhão (carga normal) ---");
        try {
            double valor = caminhao.alugarVeiculo(8.0, 3);
            System.out.printf("  Carga: 8 t | Dias: 3 > R$ %.2f%n", valor);
        } catch (IllegalArgumentException e) {
            System.err.println("  Erro: " + e.getMessage());
        }


        System.out.println("\n--- Locação: caminhão (sobrecarga) ---");
        try {
            double valor = caminhao.alugarVeiculo(12.5, 5);
            System.out.printf("  Carga: 12,5 t | Dias: 5 > R$ %.2f%n", valor);
        } catch (IllegalArgumentException e) {
            System.err.println("  Erro: " + e.getMessage());
        }


        System.out.println("\n--- Locação: carro de passeio ---");
        try {
            double valor = carro.alugarVeiculo(0, 7);
            System.out.printf("  Dias: 7 > R$ %.2f%n", valor);
        } catch (IllegalArgumentException e) {
            System.err.println("  Erro: " + e.getMessage());
        }


        System.out.println("\n--- IPVA ---");
        System.out.printf("  Caminhão (%d): R$ %.2f%n",
                caminhao.getAnoFabricacao(), caminhao.calcularIpva());
        System.out.printf("  CarroPasseio (%d): R$ %.2f%n",
                carro.getAnoFabricacao(), carro.calcularIpva());
        System.out.printf("  CarroAntigo (%d, >20 anos - isento): R$ %.2f%n",
                carroAntigo.getAnoFabricacao(), carroAntigo.calcularIpva());


        System.out.println("\n--- Tratamento de exceções ---");


        try {
            new Caminhao("ERR0001", "MAN", 500.0, 2030, 200_000.0, 5.0);
        } catch (IllegalArgumentException e) {
            System.out.println("  [OK] Ano inválido: " + e.getMessage());
        }


        try {
            new CarroPasseio("ERR0002", "Honda", -100.0, 2019, 50_000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("  [OK] Diária negativa: " + e.getMessage());
        }


        try {
            caminhao.alugarVeiculo(5.0, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("  [OK] Dias zero: " + e.getMessage());
        }


        try {
            carro.alugarVeiculo(100.0, 3);
        } catch (IllegalArgumentException e) {
            System.out.println("  [OK] Carro com carga: " + e.getMessage());
        }


        try {
            caminhao.alugarVeiculo(-2.0, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("  [OK] Peso negativo: " + e.getMessage());
        }


        try {
            new Caminhao("", "Ford", 400.0, 2018, 180_000.0, 8.0);
        } catch (IllegalArgumentException e) {
            System.out.println("  [OK] Placa vazia: " + e.getMessage());
        }

    }
}

