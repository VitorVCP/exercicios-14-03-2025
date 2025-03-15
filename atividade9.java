import java.util.Scanner;

public class atividade9{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Float produto;
System.out.println("Você recebeu um desconto de 15%, qual o valor do produto?");
produto = scanner.nextFloat();
System.out.println("Seu produto ficou por: " + (produto * 85 / 100) + " reais.");
}
}