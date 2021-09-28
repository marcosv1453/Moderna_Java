import java.util.Scanner;

public class Exercício_For_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, contador, intervalo= 0;

        for (contador=1;contador<=10;contador++){
            System.out.println("Digite um número");
            n1 = sc.nextInt();

            if (n1>=10 && n1<=20){
                intervalo++;
            }
        }
        System.out.println("Dentro do intervalo: " + intervalo);
        System.out.println("Fora do intervalo: " + (10-intervalo));
    }
}
