import Entidades.Aluno;

import java.util.Scanner;

public class Atividade_casa_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);

        Aluno usuarioA = new Aluno();
        Aluno usuarioB = new Aluno();
        int n = 0;
        double valor = 0;
        String tipo = "";
        String descricao = "";

        /**
         * O Intanciamento das variáveis no objeto usuárioA com o scan.
         */
        while (n != 8){
            System.out.println("(1) Cadastro usuário A");
            System.out.println("(2) Cadastro usuário B");
            System.out.println("(3) Lançamento Usuário A");
            System.out.println("(4) Lançamento Usuário B");
            System.out.println("(5) Transferencia de A para B");
            System.out.println("(6) Transferencia de B para A");
            System.out.println("(7) Imprimir informações dos usuários");
            System.out.println("(8) Sair");
            n=scInt.nextInt();

            switch (n){
                case 1:
                    //Instanciamento das variaveis do usuarioA com o scan
                    System.out.println("------Usuário A ------");
                    System.out.println("Digite o nome: ");
                    usuarioA.nome = sc.nextLine();
                    System.out.println("Digite o cpf: ");
                    usuarioA.CPF = sc.nextLine();
                    System.out.println("Digite a idade");
                    usuarioA.idade = scInt.nextInt();
                    System.out.println("Digite o Genero: ");
                    usuarioA.genero = sc.nextLine();
                    System.out.println("Digite o seu salário: ");
                    usuarioA.salario = scInt.nextDouble();
                    break;
                case 2:
                     //Instanciamento das variaveis do usuarioB com o scan
                    System.out.println("------Usuário B ------");
                    System.out.println("Digite o nome do usuarioB: ");
                    usuarioB.nome = sc.next();
                    System.out.println("Digite o cpf: ");
                    usuarioB.CPF = sc.nextLine();
                    System.out.println("Digite a idade");
                    usuarioB.idade = scInt.nextInt();
                    System.out.println("Digite o Genero: ");
                    usuarioB.genero = sc.nextLine();
                    System.out.println("Digite o seu salário: ");
                    usuarioB.salario = scInt.nextDouble();

                    break;
                case 3:
                    //Atribuir valores do scan o método lancamentoInformações do usuárioA
                    System.out.println("Valor de Lançamento: ");
                    valor = scInt.nextDouble();
                    System.out.println("Debito ou Crédito?");
                    tipo = sc.nextLine();
                    System.out.println("Descrição da transação");
                    descricao = sc.nextLine();

                    usuarioA.lancamentoInformacoes(valor, tipo, descricao);
                    break;
                case 4:
                    //Atribuir valores do scan o método lancamentoInformações do usuárioA
                    System.out.println("Valor de Lançamento: ");
                    valor = scInt.nextDouble();
                    System.out.println("Debito ou Crédito?");
                    tipo = sc.nextLine();
                    System.out.println("Descrição da transação");
                    descricao = sc.nextLine();

                    usuarioB.lancamentoInformacoes(valor, tipo, descricao);
                    break;
                case 5:
                    System.out.println("Digite o valor da Transferencia: ");
                    valor = scInt.nextDouble();
                    usuarioA.transferenciaPagante(valor);

                    usuarioB.transferenciaRecebido(valor);

                    System.out.println("Saldo Usuário A: " + usuarioA.salario);
                    System.out.println("Saldo Usuário B: " + usuarioB.salario);
                    break;
                case 6:
                    System.out.println("Digite o valor da Transferencia: ");
                    valor = scInt.nextDouble();
                    usuarioB.transferenciaPagante(valor);

                    usuarioA.transferenciaRecebido(valor);

                    System.out.println("Saldo Usuário A: " + usuarioA.salario);
                    System.out.println("Saldo Usuário B: " + usuarioB.salario);
                    break;
                case 7:
                        usuarioA.imprimirInformacoes();
                        usuarioB.imprimirInformacoes();
                    break;
                case 8:
                    System.out.println("Obrigado!");
                    break;
            }
        }


    }
}
