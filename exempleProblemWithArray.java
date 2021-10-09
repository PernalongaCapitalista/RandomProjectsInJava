import java.util.Scanner;

public class exempleProblemWithArray {
    public static void main(String[] args){
        Scanner sx = new Scanner(System.in);

            int n = sx.nextInt();
            int x = 0;
            int a[] = new int[n];
            int i;

            for(i = 0; i < n; i++){
                x = sx.nextInt();
                a[i] = x;
            }

            for(int j = 0; j < n; j++){
                if(a[j] < 0){
                    System.out.printf("%d\n", a[j]);
                }
            }

        sx.close();
    }


}
