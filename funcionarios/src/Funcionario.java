import lombok.*;

@Getter
@Setter
//CLASSE ABSTRATA
public abstract  class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;


    //METODO ABSTRATO
    public abstract double getBonificacao();
}
