import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Gerente extends Funcionario implements Autenticavel{
    private int numeroDeFuncionariosGerenciados;
    private int senha;

    public boolean autentica(int senha){
        if(this.senha != senha){
            return false;
        }else{
            return true;
        }
    }
    @Override
    public double getBonificacao(){
        return this.salario * 1.4 + 1000;
    }



}
