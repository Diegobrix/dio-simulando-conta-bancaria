import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal
{
   public static void main(String[] args) throws Exception
   {
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      int numeroConta;
      String agencia;
      String nome;
      DecimalFormat formatoDeSaldo = new DecimalFormat();
      formatoDeSaldo.applyPattern("R$ #,##0.00");

      double saldo;

      System.out.print("Digite seu nome: ");
      nome = scanner.next();
      System.out.print("Por favor, digite o número da Agência: ");
      agencia = scanner.next();
      System.out.print("Digite o número da conta: ");
      numeroConta = scanner.nextInt();
      System.out.print("Por favor, digite o saldo dessa conta: ");
      saldo = scanner.nextDouble();

      scanner.close();
      System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + formatoDeSaldo.format(saldo) + " já está disponível para saque");
   }
}