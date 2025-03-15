import java.util.Scanner;

public class atividade4 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Digite a sua altura em metros: ");
Float altura;
altura = scanner.nextFloat();
System.out.println("Sua Altura em pés: " + (altura * 30.48 * 100));
System.out.println("Sua Altura em polegadas: " + (altura * 100 * 2.54));

}
}