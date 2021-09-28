import java.util.Scanner;

public class Atividade_casa_if {
    public static void main(String[] args) {
        int n1, n2,n3, n4, n5, menor = 0, maior;

        Scanner sc = new Scanner(System.in);

        System.out.println("digite um número: ");
        n1 = sc.nextInt();
        maior = n1;
        menor = n1;
        System.out.println("digite outro número: ");
        n2 = sc.nextInt();
        if(n2 > maior){
            maior = n2;
        }if(n2 < menor){
            menor = n2;
        }
        System.out.println("digite outro número: ");
        n3 = sc.nextInt();
        if(n3 > maior){
            maior = n3;
        }if(n3 < menor){
            menor = n3;
        }
        System.out.println("digite outro número: ");
        n4 = sc.nextInt();
        if(n4 > maior){
            maior = n4;
        }if(n4 < menor){
            menor = n4;
        }
        System.out.println("digite outro número: ");
        n5 = sc.nextInt();
        if(n5 > maior){
            maior = n5;
        }if(n5 < menor){
            menor = n5;
        }

        System.out.println("o maior: " + maior);
        System.out.println("o menor: " + menor);
    }
}
