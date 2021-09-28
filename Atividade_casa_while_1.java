import java.util.Scanner;

public class Atividade_casa_while_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner scint = new Scanner(System.in);

        int n1 = 0, n2;
        String nome;

        System.out.println("Digite o nome: ");
        nome = sc.nextLine();

        System.out.println("Numero de repetições: ");
        n2 = scint.nextInt();


        while (n1 != n2){
            System.out.println(nome);
            n1++;
        }


    }
}
