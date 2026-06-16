import java.util.Locale;
import java.util.Scanner;


public class Javinha {

    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner1 = new Scanner(System.in);


        double largura = scanner1.nextDouble();
        double comprimento = scanner1.nextDouble();
        double metroquadrado = scanner1.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroquadrado;


        System.out.println("AREA = " + area);
        System.out.println("PRECO = " + preco);

        scanner1.close();


    }


}
