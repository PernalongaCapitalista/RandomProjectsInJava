import java.util.Scanner;

public class UriProblem1078 {

    public static void main(String[] args){
        Scanner sx = new Scanner(System.in);

        int n = sx.nextInt();
        int x = 1;
        int y = 0;

        for(int i = 0; i < 10; i++){
            y = n * x;
            System.out.printf("%d x %d = %d\n", x, n, y);
            x++;

        }

        sx.close();
    }
}
