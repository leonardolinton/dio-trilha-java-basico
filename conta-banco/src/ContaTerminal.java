import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o numero da Agencia: ");
        String agencia = scanner.next();
        
        System.out.print("Digite o numero da Conta: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponivel para saque.");
    }
}
