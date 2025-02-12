class PessoaFisica extends Pessoa{

    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public void exibirDados() {
        System.out.println("Pessoa Física:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}
