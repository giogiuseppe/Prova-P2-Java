package Uber;
import Uber.Motorista.*;
import Uber.Passageiro.*;
import Uber.Viagem.*;

public class exec {
    // Executando o Polimorfismo
    public static void main(String[] args) {
        Motorista motoca = new Motorista();
        Passageiro passageiro = new Passageiro();
        Viagem viagem = new Viagem();
        CalcularTarifa calcTF = new CalcularTarifa();

        motoca.setNome("Alberto da Silva");
        motoca.setCarro("Meriva");
        motoca.setCelular("POCO F3 5G");

        passageiro.setNome( "Giovanni");
        passageiro.setCelular("iPhone 14 Pro Max");
        passageiro.setDestino("Manoel Ribas - PR");
        passageiro.setPartida("Londrina - PR");

        viagem.setDestino(passageiro.getDestino());
        viagem.setPartida(passageiro.getPartida());
        viagem.setDistancia(450.24);

        calcTF.setTarifa(viagem.getDistancia());
        
        System.out.println(passageiro.getNome()+" fez uma viagem com o motorista "+motoca.getNome());
        System.out.println(motoca.getNome()+" utilizou o seu carro "+motoca.getCarro());
        System.out.println(motoca.getNome()+" aceitou a corrida pelo celular "+motoca.getCelular());
        System.out.println(passageiro.getNome()+" tem como destino "+passageiro.getDestino());
        System.out.println(passageiro.getNome()+" partiu de "+passageiro.getPartida());
        System.out.println("Foram percorridos "+viagem.getDistancia()+" KM");
        System.out.println("O preço total da corrida foi de R$"+calcTF.preco);
    }
    
}
