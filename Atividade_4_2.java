import java.util.Scanner;

public class Atividade_4_2 {
    public static void main(String[] args) {
        //Criação do objeto Scanner
        Scanner sc = new Scanner(System.in);

        //Variáveis
       String nome, senha;

       //Alocação de informações nas variáveis
        System.out.println("Informe o nome de usuário");
        nome = sc.nextLine();

        System.out.println("Informe a senha");
        senha = sc.nextLine();

        //enquanto nome for igual a senha executa novamente o código para realocação dos valores. Utilização do equals pois "==" não estava funcional nesse sistema
        while (nome.equals(senha)){
        System.out.println("Login e senha não podem ser iguais" );
            System.out.println("                         ");
            System.out.println("Informe o nome de usuário");
            nome = sc.nextLine();

            System.out.println("Informe a senha");
            senha = sc.nextLine();
        }
        //Fim
        System.out.println("Obrigado");
    }
}
