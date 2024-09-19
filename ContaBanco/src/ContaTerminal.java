import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor digite o número da conta!");
        int NumeroConta = scan.nextInt();
        System.out.println("Por favor digite o número da Agência!");
        String Agencia = scan.nextLine();
        System.out.println("Por favor digite o nome do titular da conta!");
        String Titular = scan.nextLine();
        System.out.println("Por favor digite o saldo da conta!");
        double Saldo = scan.nextDouble();

        System.out.println("Olá " + Titular + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia
                + ", conta" + NumeroConta + " e seu saldo " + Saldo + "já está disponível para saque.");
    }
}
