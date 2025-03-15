import java.util.Scanner;

public class atividade6 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Float produto1, produto2, produto3, valor;
System.out.println("Qual o valor de cada dos 3 produtos:");
produto1 = scanner.nextFloat();
produto2 = scanner.nextFloat();
produto3 = scanner.nextFloat();
System.out.println("Qual o valor entregado:");
valor = scanner.nextFloat();
System.out.println("O soma dos valores dos produtos são: " + (produto1 + produto2 + produto3 + ", e seu troco será: " + (produto1 - produto2 - produto3 + valor)));
}
}