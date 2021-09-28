import java.util.Scanner;

public class Atividade_casa_Switch {
    public static void main(String[] args) {

        //Criação dos Scanners, uma para Strings e outro para Int
        Scanner sc = new Scanner(System.in);
        Scanner scint = new Scanner(System.in);

        //Criação das variáveis

        String nome, genero, rua, bairro, cep;
        int swtc, numero, idade, ano;

        //As variáveis foram instanciadas para funcionar dentro do Switch

        ano = 0;
        numero = 0;
        idade = 0;
        nome = "____________";
        genero = "____________";
        rua = "____________";
        bairro = "____________";
        cep = "____________";


        System.out.println("Escolha a opção:");
        System.out.println("(1) Cadastro Aluno");
        System.out.println("(2) Cadastro Endereço");
        System.out.println("(3) Mostrar Aluno");
        System.out.println("(4) Mostrar endereço");
        System.out.println("(5) Sair");
        //O "menu" está adicionando um valor a swtc que é o regulador do switch
        swtc = scint.nextInt();

        switch (swtc){
            case 1:

                System.out.println("Digite o nome");
                nome = sc.nextLine();
                System.out.println("Digite a idade");
                idade = scint.nextInt();
                System.out.println("Ano de Nascimento");
                ano = scint.nextInt();
                System.out.println("Digite o Genero");
                genero = sc.nextLine();

                //Não foi adicionado o break para dar andamento ao sistema, se tivesse colocado um break,
                //Pois queremos adicionar informações ao mesmo.

            case 2:

                System.out.println("Digite o nome da rua");
                rua = sc.nextLine();
                System.out.println("Digite o número");
                numero = scint.nextInt();
                System.out.println("Digite o nome da bairro");
                bairro = sc.nextLine();
                System.out.println("Digite o nome da cep");
                cep = sc.nextLine();

            case 3:
                System.out.println("##################ALUNO##################");
                System.out.println("Nome: " + nome + " Idade: " + idade);
                System.out.println("Genero: " + genero + " Ano: " + ano);


            case 4:
                System.out.println("#################ENDEREÇO#################");
                System.out.println("Rua: " + rua + " Nº: " + numero);
                System.out.println("Bairro: " + bairro + " CEP: " + cep);
                //Aqui o break é utilizado pois o sistema encerrou seu ciclo.
                break;
            default:
                System.out.println("Obrigado!");
                break;
        }


        }
    }

