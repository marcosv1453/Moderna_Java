import java.util.Scanner;

public class Atividade_4_1 {
    public static void main(String[] args) {
        //criação do objeto Scanner
        Scanner sc = new Scanner(System.in);

        //variáveis
        int n1;

        //Alocação de um número na variável
        System.out.println("Informe um valor entre 0 e 10");
        n1 = sc.nextInt();

        //Enquanto n1 for maior que 10 e n1 menor que zero entra na condição para ser inserido novamente
        while(n1 > 10 || n1 < 0){
            System.out.println("Erro, informe um numero de 1 a 10!");
            n1 = sc.nextInt();
        }
        //Fim
        System.out.println("Obrigado");

    }
}
