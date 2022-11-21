package Uber;
import Uber.Viagem.*;
import Uber.Passageiro.*;
import Uber.Motorista.*;

public class CalcularTarifa {
        // Atributos
        double preco;

        // Métodos
        
        public void setTarifa(double preco) {

            // R$1,00 POR KM RODADO!
            this.preco = preco * 1;

        }

        public double getTarifa() {
            return preco;
        }
}
