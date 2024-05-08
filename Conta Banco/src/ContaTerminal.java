import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try{
        Scanner tc = new Scanner(System.in);

        System.out.println("Olá, por favor digite o número da conta");
        int numero = tc.nextInt();

        System.out.println("Agora digite o Número da sua Agencia");
        String agencia = tc.next();

        System.out.println("Agora digite o seu nome completo");
        String nome = tc.next();
        
        System.out.println("Agora informe o seu saldo em conta");
        double saldo = tc.nextDouble();

        System.out.println("Olá " + nome +
        ", obrigado por criar uma conta em nosso banco, sua agência é: "  + agencia + 
        ", conta: " + numero + " e seu saldo é de: R$" + saldo + 
        " já está disponível para saque");
        tc.close();
    }
    catch (InputMismatchException e) {
        System.out.println("Os campos número da conta e saldo precisam ser númericos");

    }
}
}