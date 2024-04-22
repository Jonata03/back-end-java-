public class Main {
    public static void main(String[] args) {
        ControleDeBonificacoes controle = new ControleDeBonificacoes();

        Gerente funcionario1 = new Gerente();
        funcionario1.setSalario(5000);
        controle.registra(funcionario1);

        Gerente funcionario2 = new Gerente();
        funcionario2.setSalario(5000);
        controle.registra(funcionario2);


        System.out.println(controle.getTotalDeBonificacoes());
        /*Gerente gerente = new Gerente();
        Funcionario funcionario = gerente;
        */

/*
        funcionario.setSalario(5000);

        gerente.setNome("robert");
        gerente.setSalario(5000);
        gerente.setSenha(5000);

        System.out.println(gerente.getBonificacao());
        System.out.println(funcionario.getBonificacao());
*/

    }
}