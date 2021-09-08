import java.util.Scanner;
import java.util.Locale;

public class Exercise2 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sx = new Scanner(System.in);
        int x = sx.nextInt();
        int z = 0;
        int y = 0;

        while(x > 0){
            if(x < 0){
                System.out.printf("impossivel calcular\n");
            }else{
                z += x;
                y++;
                x = sx.nextInt();
            }
        }

        if(y > 0) {
            double w =(double) z / y;
            System.out.printf("%.2f\n", w);

        }
        sx.close();
    }
}
