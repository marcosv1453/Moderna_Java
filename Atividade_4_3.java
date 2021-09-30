import java.util.Scanner;

public class Atividade_4_3 {
    public static void main(String[] args) {
        //Scanner
        Scanner scTexto = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        //variáveis
       String nome, sexo, estadoCivil, s1 = "f", s2 = "m";
       int idade, salario;

       //alocação de informações nas variáveis
//
//        System.out.println("Informe o nome");
//        nome = scTexto.nextLine();
//        //Utilizado .length para fazer a contagem dos caracteres, se for menor que 3 entra na condição
//        while (nome.length() < 3){
//            System.out.println("O número não pode conter menos que 3 caracteres" );
//            nome = scTexto.nextLine();
//        }

        System.out.println("Informe o sexo: F ou M");
        sexo = scTexto.nextLine();
        //enquanto o valor digitado for diferente de F ou M continua no looping
        while (!sexo.equals(s1)){
            if (!sexo.equals(s2)){
                System.out.println("Apenas f ou m");
                sexo = scTexto.nextLine();
            }
        }

        System.out.println("Informe o Estado civil: s, c, v ou d");
        estadoCivil = scTexto.nextLine();
        //enquanto o valor digitado for diferente de s, c, v ou d continua no looping
        while (estadoCivil != "s" || estadoCivil != "c" || estadoCivil != "v" || estadoCivil != "d"){
            System.out.println("Apenas s, c, v ou d");
            estadoCivil = scTexto.nextLine();
        }

        System.out.println("Informe a idade");
        idade = sc.nextInt();
        //enquanto idade for maior que 150 e menor que zero continua no looping
        while (idade>150 || idade <0){
            System.out.println("A idade inválida, digite uma idade entre 0 e 150");
            idade = sc.nextInt();
        }

        System.out.println("Informe o salário");
        salario = sc.nextInt();
        //enquanto salário for menor que zero continua no looping
        while (salario<0){
            System.out.println("Informe um número maior que 0");
        }
        //fim
        System.out.println("Obrigado");

    }
}
