public class Gerente extends Funcionario{
    private int senha;
    private int numeroDeFuncionariosGerenciados;
   /* public void setSenha(int senha){
        this.senha = senha;
    }*/

    public void setSenha(int senha) {
        this.senha = senha;
    }


    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Acesso Permitido!");
            return true;
        }else{
            System.out.println("Acesso negado!");
            return false;
        }
    }
    @Override
    public double getBonificacao(){
        return super.getBonificacao() + 1000;
    }



}
