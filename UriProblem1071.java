import java.util.Scanner;

public class UriProblem1071 {
    public static void main(String[] args){
        Scanner sx = new Scanner(System.in);

        int x = sx.nextInt(); int y = sx.nextInt();

        int a = Math.max(x, y);
        int b = Math.min(x, y);

        int s = 0;

        for(int i = b + 1; i < a; i++){
            if(i % 2 != 0){
                s += i;
            }
        }

        System.out.printf("%d\n", s);

        sx.close();
    }
}
