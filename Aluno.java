package Entidades;

public class Aluno {

    public String nome;
    public String CPF;
    public int idade;
    public String genero;
    public double salario;

    /**
     * Método para mostrar informações do usuário
     */
    public void imprimirInformacoes(){
        System.out.println("---------------USUARIO---------------");
        System.out.println("Nome: " + this.nome + " Idade: " + this.idade +  " Genero: " + this.genero);
        System.out.println( " CPF: " + this.CPF + " Salario: " +this.salario);
        System.out.println("-------------------------------------");
    }

    /**
     * Método de lancamento de valores Debito e Crédito
     * @param valor
     * @param tipo
     * @param descricao
     */
    public void lancamentoInformacoes(double valor, String tipo, String descricao){

        if (valor<this.salario){
            if (tipo.equalsIgnoreCase("debito")){
                this.salario -= valor;
            }else if (valor>this.salario){
                System.out.println("Saldo Insuficiente");
            }
            if(tipo.equalsIgnoreCase("credito")){
                this.salario += valor;
            }


        }

    }
    public void transferenciaPagante(double valor){
        if(this.salario>valor){
            this.salario -= valor;
        }else{
            System.out.println("Saldo Insuficiente");
        }
    }

    public void transferenciaRecebido(double valor){
        this.salario += valor;
    }

}
