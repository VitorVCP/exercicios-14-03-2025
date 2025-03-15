import java.util.Scanner;

public class atividade7{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Float reais, taxa;
System.out.println("Digite o valor em reais para a conversão: ");
reais = scanner.nextFloat();
System.out.println("Digite a taxa atual de conversâo");
taxa = scanner.nextFloat();
System.out.println("Os " + reais + " reais se tornarão " + (reais /taxa)+ " euros");
}
}