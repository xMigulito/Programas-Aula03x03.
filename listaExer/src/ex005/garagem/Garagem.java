package ex005.garagem;

import java.util.ArrayList;
import java.util.Arrays;

import ex005.veiculo.Veiculo;

public class Garagem {
    int nVagaOcupadas;
    int nVagaDisponiveis;
    Veiculo[] vagas = new Veiculo[10];
    
    public Veiculo[] getVagas() {
        return vagas;
    }
    public void setVagas(Veiculo[] vagas) {
        this.vagas = vagas;
    }
    public Garagem(Veiculo[] vagas) {
        this.vagas = vagas;
    }
    @Override
    public String toString() {
        return "Garagem [vagas=" + Arrays.toString(vagas) + "]";
    }

    public void estacionar(int vaga, Veiculo veiculo){
        if(vagas[vaga] != null){
            System.out.println("Ocupada");
        }
        else{
            vagas[vaga] = veiculo;
        }
    }

    public ArrayList<Integer> vagasLivres(){
        ArrayList<Integer> lista = new ArrayList();
        for(int i = 0; i < 10; i++){
            if(vagas[i] == null){
                lista.add(i);
            }
        }
        return lista;
    }

    public Veiculo remover(int nVaga){
        Veiculo x = vagas[nVaga];
        vagas[nVaga] = null;
        return x;
    }

    public ArrayList<Veiculo> carrosEstacionados(){
        ArrayList<Veiculo> lista = new ArrayList();
        for(int i = 0; i < 10; i++){
            if(vagas[i] != null){
                lista.add(vagas[i]);
            }
        }
        return lista;
    }

    public Veiculo verificarVaga(int nVaga){
        Veiculo x = vagas[nVaga];
        if(vagas[nVaga] == null){
            System.out.println("Vaga Disponivel");
            return null;
        }
        else{
            return x;
        }
    }
}