import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        System.out.println("Sistema para cadastro de contas bancárias");
        Conta conta = new Conta();
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        conta.setNumero(Integer.parseInt(sc.nextLine()));

        System.out.print("Digite o nome do cliente: ");
        conta.setCliente(sc.nextLine());

        System.out.print("Digite o número da agência: ");
        conta.setAgencia(sc.nextLine());

        System.out.print("Digite o saldo da conta: ");
        var saldo = sc.nextLine();
        try {
            conta.setSaldo(Double.parseDouble(saldo));
        } catch (NumberFormatException e) {
            saldo = saldo.replace(",", ".");
            conta.setSaldo(Double.parseDouble(saldo));
        }

        System.out.println(String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                conta.getCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo()));

        sc.close();
    }
}
