import java.util.Scanner;

public class Exercício_While_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 1, mult = 0, num = 0;
        //String nome = "Hello Word";

        System.out.println("Digite o número para a tabuada: ");
        num = sc.nextInt();

        while (cont <= 12) {

            mult = cont * num;
            System.out.println(cont + "*" + num + "=" + mult);
            cont++;
        }
    }
}