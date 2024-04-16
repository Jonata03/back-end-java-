class Conta {
    String titular;
    int numero;
    private double saldo;

    void deposito(int valor){
        this.saldo += valor;
    }
    double saldo(){
        return this.saldo;
    }
}

public class Main{
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        //Não compila! Você não pode acessar o atributo privado de outra classe.
        minhaConta.deposito(10);
        System.out.println(minhaConta.saldo());
    }
}