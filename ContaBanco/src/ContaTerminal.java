import java.util.Scanner;

public class ContaTerminal {
    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaTerminal novaConta = new ContaTerminal();
        System.out.println("Insira seu nome: ");
        novaConta.nomeCliente = sc.next();

        System.out.println("Insira o número da conta: ");
        novaConta.numero = sc.nextInt();

        System.out.println("Insira o número da agência: ");
        novaConta.agencia = sc.next();

        System.out.println("Insira o saldo: ");
        novaConta.saldo = sc.nextDouble();

        System.out.println("Olá " + novaConta.nomeCliente + ", obrigado por criar uma conta em " +
                "nosso banco, sua agência é " + novaConta.agencia + ", conta "
                + novaConta.numero + " e seu saldo " +
                novaConta.saldo + " já está disponível para saque");
    }

}
