public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(5000);

        gerente.setNome("Joao da Silva");
        System.out.println(gerente.getBonificacao());
        gerente.setSenha(4321);
    }
}
