import java.util.Scanner;

public class atividade2 {
public static void main(String[] args) {
Float  a, b, c, d;
Scanner scanner = new Scanner(System.in);
System.out.println("Digite o valor dos 4 boletos: ");
a = scanner.nextFloat();
b = scanner.nextFloat();
c = scanner.nextFloat();
d = scanner.nextFloat();
System.out.println("O valor total a ser pago será: " + (a + b + c + d));
}
}