import java.util.Scanner;

public class UriProblem1066 {
    public static void main(String[] args){
        Scanner sx = new Scanner(System.in);

        int a = 0;
        int par = 0; int impar = 0; int pos = 0; int neg = 0;

        for(int i = 0; i < 5; i++){
            a = sx.nextInt();
            if(a > 0){
                pos++;

            }else if(a < 0){
                neg++;
            }

            if(Math.abs(a) != 0 && a % 2 == 0){
                par++;

            }else if(Math.abs(a) != 0){
                impar++;
            }

        }
        sx.close();
        System.out.printf("%d valor(es) par(es)\n", pos);
        System.out.printf("%d valor(es) impar(es)\n", impar);
        System.out.printf("%d valor(es) positivo(s)\n", pos);
        System.out.printf("%d valor(es) negativo(s)\n", neg);
    }


}