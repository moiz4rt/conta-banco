import java.util.Scanner;

public class ContaTerminal
{
    public static void main(String[] args) throws Exception
    {
        // TODO: Conhecer e importar a classe Scannel
        // Exibir as mensagens para o nosso usuário
        // Obter pela Scanner os valores digitados no terminal
        // Exibir a mensagem de conta criada

        int numeroConta, agencia;
        String nomeCliente;
        double saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo ao nosso Banco!");
        System.out.print("Por favor, digite seu nome para começarmos: ");
        nomeCliente = scanner.next();
        System.out.print("\nPor favor, digite o número da agência de sua conta: ");
        agencia = scanner.nextInt();
        System.out.print("\nagora digite o número de sua conta: ");
        numeroConta = scanner.nextInt();
        System.out.print("\nQual o valor do primeiro depósito: ");
        saldo = scanner.nextDouble();
        System.out.println("Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
