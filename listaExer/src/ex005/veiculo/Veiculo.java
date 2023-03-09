package ex005.veiculo;

import ex005.fabricante.Fabricante;

public class Veiculo {
    String nome;
    String placa;
    String chassi;
    String cor;
    String modelo;
    int nPortas;
    int nRodas;
    Fabricante fabricante;
    
    public String getNome() {
        return nome;
    }
    public int getnRodas() {
        return nRodas;
    }
    public void setnRodas(int nRodas) {
        this.nRodas = nRodas;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getnPortas() {
        return nPortas;
    }
    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }
   
    public Veiculo(String nome, String placa, String chassi, String cor, String modelo, int nPortas, int nRodas,
            Fabricante fabricante) {
        this.nome = nome;
        this.placa = placa;
        this.chassi = chassi;
        this.cor = cor;
        this.modelo = modelo;
        this.nPortas = nPortas;
        this.nRodas = nRodas;
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Veiculo [nome=" + nome + ", placa=" + placa + ", chassi=" + chassi + ", cor=" + cor + ", modelo="
                + modelo + ", nPortas=" + nPortas + ", nRodas=" + nRodas + ", fabricante=" + fabricante + "]";
    }

    public Fabricante getFabricante() {
        return fabricante;
    }
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    
}
