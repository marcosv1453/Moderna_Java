import java.util.Scanner;

public class Atividade_casa_while {
    public static void main(String[] args) {

        //Criação dos Scanners, uma para Strings e outro para Int

        Scanner sc = new Scanner(System.in);
        Scanner scint = new Scanner(System.in);

        //Criação das variáveis

        String nome, genero, rua, bairro, cep;
        int swtc, numero, idade, ano;

        //As variáveis foram instanciadas para funcionar dentro do Switch

        swtc = 0; //Variável reguladora do while e switch
        ano = 0;
        numero = 0;
        idade = 0;
        nome = "____________";
        genero = "____________";
        rua = "____________";
        bairro = "____________";
        cep = "____________";

        //Aqui declaramos que a reguladora se for menor diferente 5 vai repetir o "menu"

        while (swtc != 5) {
            System.out.println("                        ");
            System.out.println("Escolha a opção:");
            System.out.println("(1) Cadastro Aluno");
            System.out.println("(2) Cadastro Endereço");
            System.out.println("(3) Mostrar Aluno");
            System.out.println("(4) Mostrar endereço");
            System.out.println("(5) Sair");
            swtc = scint.nextInt();

            switch (swtc) {
                case 1://Cadastro do aluno
                    System.out.println("Digite o nome");
                    nome = sc.nextLine();
                    System.out.println("Digite a idade");
                    idade = scint.nextInt();
                    System.out.println("Ano de Nascimento");
                    ano = scint.nextInt();
                    System.out.println("Digite o Genero");
                    genero = sc.nextLine();
                    break;//Utilizando o break para esse case fazendo com que volte para o "menu"

                case 2:

                    System.out.println("Digite o nome da rua");
                    rua = sc.nextLine();
                    System.out.println("Digite o número");
                    numero = scint.nextInt();
                    System.out.println("Digite o nome da bairro");
                    bairro = sc.nextLine();
                    System.out.println("Digite o nome da cep");
                    cep = sc.nextLine();
                    break;
                case 3:
                    System.out.println("##################ALUNO##################");
                    System.out.println("Nome: " + nome + " Idade: " + idade);
                    System.out.println("Genero: " + genero + " Ano: " + ano);
                    System.out.println("#########################################");
                    break;

                case 4:
                    System.out.println("#################ENDEREÇO#################");
                    System.out.println("Rua: " + rua + " Nº: " + numero);
                    System.out.println("Bairro: " + bairro + " CEP: " + cep);
                    System.out.println("#########################################");

                    break;

                default:
                    System.out.println("Obrigado!");
                    break;
            }
        }

    }
}

