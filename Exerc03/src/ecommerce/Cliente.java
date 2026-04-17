package ecommerce;

public class Cliente {

    private String nome;
    private String CPF;
    private String email;

    public Cliente(String nome, String CPF, String email) {
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
    }

    public String getNome() { return nome; }

    public String getCPF() { return CPF; }

    public String getEmail() { return email; }

}
