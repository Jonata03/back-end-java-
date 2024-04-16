/*class Cliente{
    String nome;
    String sobrenome;
    String cpf;
}
class Conta {
    int numero;
    Cliente titular;
    double saldo;

    boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;

        }
    }

    void deposita(double quantidade) {
        this.saldo += quantidade;
    }

    boolean transfere(Conta destino, double valor){
        boolean retirou = this.saca(valor);
        if (!retirou){
            return false;
        }else{
            destino.deposita(valor);
            return true;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        Cliente c = new Cliente();
        minhaConta.titular = c;
        minhaConta.titular.nome = "duke";

        System.out.println(minhaConta.titular.nome);
    }
}*/


        //        minhaConta.titular = "duke";
//        minhaConta.saldo = 1000;





/* Conta conta2 = new Conta();
        conta2.titular = "kevinho";
        conta2.saldo = 10;

        if(minhaConta.saca(100)){
            System.out.println("sacou");
        }else {
            System.out.println("nao sacou");
        }
        minhaConta.transfere(conta2, 50);
        System.out.println(minhaConta.saldo +" "+ conta2.saldo);*//*

    }
}*/

class Cliente{
    String nome;
    String sobrenome;
    String cpf;
}
class Conta {
    int numero;
    Cliente titular = new Cliente();
    double saldo;
}
public class Main{
    public static void main(String[] args){
        Conta conta1 = new Conta();
        Cliente cliente1 = new Cliente();

        conta1.titular = cliente1;
    }
}
