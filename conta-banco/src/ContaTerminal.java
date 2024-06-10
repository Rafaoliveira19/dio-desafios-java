import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        //Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuario
        System.out.println("Bem vindo ao Banco Santander, siga os passos abaixo para criar a sua conta");
        //Obter pela Scanner os valores digitados pelo usuario
        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor digite o numero da Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor digite o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o seu saldo inicial: ");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem da conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ",conta " + numero + "e seu saldo " + saldo + " já está disponivel para saque.");
    }
}