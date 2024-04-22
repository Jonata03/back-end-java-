import lombok.*;

@Getter
@Setter
//CLASSE ABSTRATA
public abstract  class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;


    //METODO ABSTRATO
    public double getBonificacao(){
        return this.salario * 0.10+ 1000;
    }
}
