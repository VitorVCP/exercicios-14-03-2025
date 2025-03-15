import java.util.Scanner;

public class atividade8{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Float l1, c1, l2, c2, l3, c3;
System.out.println("Digite a largura, depois o comprimento do primeiro cômodo");
l1 = scanner.nextFloat();
c1 = scanner.nextFloat();
System.out.println("Digite a largura, depois o comprimento do segundo cômodo (se não tiver, marque como 0)");
l2 = scanner.nextFloat();
c2 = scanner.nextFloat();
System.out.println("Digite a largura, depois o comprimento do terceiro cômodo (se não tiver, marque como 0)");
l3 = scanner.nextFloat();
c3 = scanner.nextFloat();
System.out.println("Sua área total: " + (l1 * c1 + l2 * c2 + l3 * c3));
}
}