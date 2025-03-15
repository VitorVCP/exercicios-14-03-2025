
import java.util.Scanner;

public class atividade1 {
public static void main(String[] args) {
    int a, b, c;
    Scanner scanner = new Scanner(System.in);
    System.out.println("escreva três numeros" );
a = scanner.nextInt();
b = scanner.nextInt();
c = scanner.nextInt();
    System.out.println("a média será " + ((a+b+c)/3));
}
}