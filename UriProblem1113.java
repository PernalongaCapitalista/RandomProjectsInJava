package src;

import java.util.Scanner;

public class UriProblem1113 {
    public static void main(String[] args){
        Scanner sx = new Scanner(System.in);
        int x = sx.nextInt();
        int y = sx.nextInt();

        while(x != y){
            if(x < y){
                System.out.printf("Crescente\n");

            }else{
                System.out.printf("Decrescente\n");

            }
            x = sx.nextInt();
            y = sx.nextInt();
        }

        sx.close();

    }
}
