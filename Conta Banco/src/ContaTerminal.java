import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner tc = new Scanner(System.in);

        System.out.println("Olá, por favor digite o número da conta");
        int numero = tc.nextInt();
        tc.nextLine();

        System.out.println("Agora digite o Número da sua Agencia");
        String agencia = tc.nextLine();

        System.out.println("Agora digite o seu nome completo");
        String nome = tc.nextLine();
        
        System.out.println("Agora informe o seu saldo em conta");
        double saldo = tc.nextDouble();

        System.out.println("Olá " + nome +
        ", obrigado por criar uma conta em nosso banco, sua agência é: "  + agencia + 
        ", conta: " + numero + " e seu saldo é de: R$" + saldo + " já está disponível para saque");

        tc.close();

    }
}
