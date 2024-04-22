public class Diretor extends Funcionario implements Autenticavel{
    @Override
    public double getBonificacao() {
        return 0;
    }

    @Override
    public boolean autentica(int senha) {
        return false;
    }

}
