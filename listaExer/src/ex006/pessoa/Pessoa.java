package ex006.pessoa;

public class Pessoa {
    String nome;
    String cpf;
    String genero;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Pessoa(String nome, String cpf, String genero) {
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
    }
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", genero=" + genero + "]";
    }

    
}
