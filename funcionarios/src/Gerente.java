import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Gerente extends Funcionario{
    private int numeroDeFuncionariosGerenciados;
    private int senha;

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
        return this.salario * 1.4 + 1000;
    }



}
