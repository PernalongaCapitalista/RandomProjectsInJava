import java.util.Scanner;
import java.util.Locale;

public class Exercise4 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sx = new Scanner(System.in);

        String decisao = "";
        do {

            System.out.println("Digite a temperatura em Celsius:");
            double x = sx.nextDouble();

            double f = 9 * x / 5 + 32;

            System.out.printf("Equivalente em Fahrenheit: %.1f\n", f);
            System.out.println("Deseja repetir (s/n)?");
            decisao = sx.next();

        }while(decisao.equals("s"));

        sx.close();
    }
}
