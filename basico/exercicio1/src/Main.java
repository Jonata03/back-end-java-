public class Main {
    public static void main(String[] args) {
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;
        int despesaTotal = janeiro + fevereiro + marco;
        double mediaMensal = (double) despesaTotal / 3;
        System.out.println(despesaTotal);
        System.out.println(mediaMensal);
    }
}