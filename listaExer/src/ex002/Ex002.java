package ex002;

import java.lang.reflect.Array;
import java.util.ArrayList;

import ex002.pessoa.Pessoa;

public class Ex002 {
    public static void main(String[] args) {
        ArrayList<Pessoa> bebes = new ArrayList<>();
        ArrayList<Pessoa> criancas = new ArrayList<>();
        ArrayList<Pessoa> adolescentes = new ArrayList<>();
        ArrayList<Pessoa> adultos = new ArrayList<>();
        ArrayList<Pessoa> idosos = new ArrayList<>();

        Pessoa pessoa = new Pessoa(" ", 0);

        pessoa.setNome("Fabio"); 
        pessoa.setIdade(2);

        if((pessoa.getIdade()>0) && (pessoa.getIdade()<3)){
            bebes.add(pessoa);
        }else{
            if((pessoa.getIdade()>=3) && (pessoa.getIdade()<10)){
                criancas.add(pessoa);
            }else{
            if((pessoa.getIdade()>=10) && (pessoa.getIdade()<20)){
                adolescentes.add(pessoa);
            }else{
                if((pessoa.getIdade()>=20) && (pessoa.getIdade()<65)){
                    adultos.add(pessoa);    
                }else{
                    if((pessoa.getIdade()>=65)){
                        idosos.add(pessoa);    
                    }
                    }
                }
            }
        }
        System.out.println("Bebes: " + bebes);
        System.out.println("Crianças: " + criancas);
        System.out.println("Adolescentes: " + adolescentes);
        System.out.println("Adultos: " + adultos);
        System.out.println("Idosos: " + idosos);

    }
}
