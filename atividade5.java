import java.util.Scanner;

public class atividade5 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Float C;
System.out.println("Qual sua temperatura em Celsius");
C = scanner.nextFloat();
System.out.println("Sua temperatura em Fahrenheit é: " + (1.8 * C +32));
}
}