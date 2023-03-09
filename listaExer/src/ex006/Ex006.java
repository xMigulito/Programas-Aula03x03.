package ex006;

import javax.swing.JOptionPane;

import ex006.fabricante.Fabricante;
import ex006.veiculo.Veiculo;
import ex006.garagem.Garagem;

public class Ex006 {
    public static void main(String[] args) {
    Garagem garagem = new Garagem(new Veiculo[10]);
    Veiculo veiculo = new Veiculo(null, null, null, null, null, 0, 0, null, null);
    Fabricante fabricante = new Fabricante(null, 0, null, null, null, 0);
    boolean flag = true;
    int valor;
    while(flag){
        String cond = JOptionPane.showInputDialog(null, "Digite a opção desejada: \n 1-Adicionar veiculo \n 2-Verificar vagas \n 3-Remover veiculo \n 4-Verificar veiculos estacionados \n 5-Verificar dispobilidade");
        if(cond.equals("")){
            flag = false;
            
        }
        else{
            valor = Integer.parseInt(cond);
            switch(valor){
                case 1:{
                    garagem.estacionar(3,veiculo);
                    garagem.estacionar(5,veiculo);
                    break; 
                }
                case 2:{
                    System.out.println(garagem.vagasLivres());
                    break;
                }
                case 3:{
                    System.out.println(garagem.remover(3));
                    break;
                }
                case 4:{
                    System.out.println(garagem.carrosEstacionados());
                    break;
                }
                case 5:{
                    String vaga = JOptionPane.showInputDialog(null, "Insira o numero da vaga para verificar ");
                    System.out.println(garagem.verificarVaga(Integer.parseInt(vaga)));
                }
            }
        }
    }
    }
}
