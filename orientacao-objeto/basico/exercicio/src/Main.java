class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;

    void depositar(double valor) {
        this.saldo += valor;
    }

    boolean sacar(double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    void mostraConta() {
        System.out.println(
                this.titular + " "+
                        this.numero +" "+
                        this.agencia +" "+
                        this.saldo
        );
    }
//    double calculaRendimento(){
//        return redimento;
//    }
}

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.titular = "stuart";
        conta1.numero = 00000;
        conta1.agencia = "13123123";
        conta1.saldo = 10;

        conta1.depositar(100);
        conta1.sacar(50);
        conta1.mostraConta();
    }
}