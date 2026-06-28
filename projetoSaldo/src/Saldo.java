import java.util.Scanner;

public class Saldo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double saldo = 2500.00;
        String nomeUsuario = "Renan";
        int opcoes = 0;
        String tipoConta = "corrente";

        System.out.println("*********** DADOS BANCÁRIOS *************\n");

        System.out.println("Bem vindo ao sistema de saldo bancário");
        System.out.println("Dados da conta: ");
        System.out.println("Nome do usuario: " + nomeUsuario);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo disponivel na conta: " + saldo + "\n");

        while (opcoes !=4 ){

           String menu = """
                   MENU DE OPÇÕES
                   
                   1 - Consultar seu saldo
                   2 - Receber valor
                   3 - Transferir valor
                   4 - Sair
                   
                   Informe a opção desejada:\s
                   """;

            System.out.println(menu);
            opcoes = entrada.nextInt();

            switch (opcoes) {
                case 1:
                    System.out.println("Seu saldo disponivel é " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    double valorReceber = entrada.nextDouble();
                    saldo += valorReceber;
                    System.out.println("Valor recebido, seu saldo agora é " + saldo);
                    break;
                case 3:
                    System.out.println("Quantos reais você gostaria de transferir?: ");
                    double transferirDinheiro = entrada.nextDouble();

                    if (transferirDinheiro > saldo){
                        System.out.println("O valor da transferência é maior do que o do saldo, não será possivel transferir");
                    } else {
                        saldo -= transferirDinheiro;
                        System.out.println("Você transferiu " + transferirDinheiro + " reais. Seu saldo agora é de " + saldo);
                    }

                    break;
                case 4:
                    System.out.println("Encerrando aplicação");
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente");
                    break;

            }
        }
                entrada.close();
    }
}