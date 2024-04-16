public class Main{
    public static void main(String[] args){
        //Imprima todos os números de 150 a 300.
        /*for(int i = 150 ;i<=300;i++){
            System.out.println(i);
        }*/

        //Imprima a soma de 1 até 1000.
        /*int soma = 0;
        for (int i = 1;i <= 1000;i++){
            soma += i;
        }
        System.out.println(soma);*/

        //Imprima todos os múltiplos de 3, entre 1 e 100.
        /*for(int i = 1 ; i <= 100;i++){
            if (i %3 == 0){
                System.out.println(i);
            }
        }*/
        //Imprima os fatoriais de 1 a 10.
        long fatorial = 1;
        for (long n = 1;n <= 40 ; n++){
            fatorial *= n;
            System.out.println(fatorial);
        }
    }
}