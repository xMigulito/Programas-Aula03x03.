package ex005.fabricante;

public class Fabricante {
    String nome;
    int cnpj;
    String nomeFantasia;
    String logradouro;
    String bairro;
    int cep;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCnpj() {
        return cnpj;
    }
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public int getCep() {
        return cep;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    public Fabricante(String nome, int cnpj, String nomeFantasia, String logradouro, String bairro, int cep) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cep = cep;
    }
    @Override
    public String toString() {
        return "Fabricante [nome=" + nome + ", cnpj=" + cnpj + ", nomeFantasia=" + nomeFantasia + ", logradouro="
                + logradouro + ", bairro=" + bairro + ", cep=" + cep + "]";
    }

    
}
