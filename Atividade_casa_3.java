import java.sql.SQLOutput;
import java.util.Scanner;

public class Atividade_casa_3 {
    public static void main(String[] args) {
        Scanner sctxt = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);


        String status1 = "";
        String status2 = "";
        int a = 0;

        //Aluno 1
        String nomeAluno1 = "";
        String cpfAluno1 = "";
        int idadeAluno1 = 0;
        String ruaAluno1 = "";
        String numeroAluno1 = "";
        double nota1Aluno1 = 0;
        double nota2Aluno1 = 0;

        //Aluno 2
        String nomeAluno2 = "";
        String cpfAluno2 = "";
        int idadeAluno2 = 0;
        String ruaAluno2 = "";
        String numeroAluno2 = "";
        double nota1Aluno2 = 0;
        double nota2Aluno2 = 0;

        while(a != 5){

            System.out.println("-------MENU-------");
            System.out.println("(1) - Cadastro Aluno 1");
            System.out.println("(2) - Cadastro Aluno 2");
            System.out.println("(3) - Imprimir informações");
            System.out.println("(4) - Informar aprovados");
            System.out.println("(5) - Sair");
            a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.println("Insira o nome do aluno");
                    nomeAluno1= sctxt.nextLine();
                    System.out.println("Insira o cpf");
                    cpfAluno1= sctxt.nextLine();
                    System.out.println("Insira a Idade ");
                    idadeAluno1= sc.nextInt();
                    System.out.println("Insira o nome da rua");
                    ruaAluno1= sctxt.nextLine();
                    System.out.println("Insira o numero ");
                    numeroAluno1= sctxt.nextLine();
                    System.out.println("Insira a primeira nota");
                    nota1Aluno1= sc.nextDouble();
                    System.out.println("Insira a segunda nota");
                    nota2Aluno1= sc.nextDouble();
                    System.out.println("Aluno Cadastrado");
                    System.out.println("_________________");
                    break;
                case 2:
                    System.out.println("Insira o nome do aluno");
                    nomeAluno2= sctxt.nextLine();
                    System.out.println("Insira o cpf");
                    cpfAluno2= sctxt.nextLine();
                    System.out.println("Insira a Idade ");
                    idadeAluno2= sc.nextInt();
                    System.out.println("Insira o nome da rua");
                    ruaAluno2= sctxt.nextLine();
                    System.out.println("Insira o numero ");
                    numeroAluno2= sctxt.nextLine();
                    System.out.println("Insira a primeira nota");
                    nota1Aluno2= sc.nextDouble();
                    System.out.println("Insira a segunda nota");
                    nota2Aluno2= sc.nextDouble();
                    System.out.println("Aluno Cadastrado");
                    System.out.println("_________________");
                    break;
                case 3:
                    System.out.println("--------Aluno 1--------");
                    System.out.println("Nome: " + nomeAluno1 + " CPF: " + cpfAluno1);
                    System.out.println("Idade: " + idadeAluno1);
                    System.out.println("Rua: " + ruaAluno1 + " Nº: " + numeroAluno1);
                    System.out.println("Primeira nota: " + nota1Aluno1 );
                    System.out.println("Segunda nota: " + nota2Aluno1 );
                    System.out.println("--------Aluno 2--------");
                    System.out.println("Nome: " + nomeAluno2 + "CPF: " + cpfAluno2);
                    System.out.println("Idade: " + idadeAluno2);
                    System.out.println("Rua: " + ruaAluno2 + "Nº: " + numeroAluno2);
                    System.out.println("Primeira nota: " + nota1Aluno2 );
                    System.out.println("Segunda nota: " + nota2Aluno2 );
                    System.out.println("---------------------------");
                    break;
                case 4:
                    if (((nota1Aluno1+nota2Aluno1)/2) >= 6){
                        status1 = "Aprovado";
                    }else{
                        status1 = "Reprovado";
                    }
                    if (((nota1Aluno2+nota2Aluno2)/2) >= 6){
                        status2 = "Aprovado";
                    }else{
                        status2 = "Reprovado";
                    }

                    System.out.println("Aluno: " + nomeAluno1 + " Situação: " + status1 + " Média: " + ((nota1Aluno1+nota2Aluno1)/2));
                    System.out.println("Aluno: " + nomeAluno2 + " Situação: " + status2 + " Média: " + ((nota1Aluno2+nota2Aluno2)/2));
                    break;
                case 5:
                    System.out.println("Obrigado");
                    break;
                default:
                    System.out.println("Digite um número válido");
            }
        }



    }
}
