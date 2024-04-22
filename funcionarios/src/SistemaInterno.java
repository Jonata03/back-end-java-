public class SistemaInterno {
    Autenticavel a = new Gerente();
    public void login(Autenticavel a){
        int senha = 12321;
        boolean ok = a.autentica(senha);
    }
}
