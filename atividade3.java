import java.util.Scanner;

public class atividade3 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Vamos calcular sua idade, você tem quantos anos? ");
int anos;
anos = scanner.nextInt();
System.out.println("Você já viveu " + (anos * 365 * 24) + " segundos em toda sua vida.");
}
}