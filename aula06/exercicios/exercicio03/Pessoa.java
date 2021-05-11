abstract class Pessoa {
    private String nome, telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }

    //um metodo abstract é obrigatorio 
    public abstract String exibir();
}
