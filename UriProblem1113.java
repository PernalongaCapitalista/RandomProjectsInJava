package src;

import java.util.Scanner;

public class UriProblem1113 {
    public static void main(String[] args){
        Scanner sx = new Scanner(System.in);
            int x = 0, y = 0;
            String msg = "";

        do{
            x = sx.nextInt();
            y = sx.nextInt();

            if(x < y){msg = "Crescente"; }else if(y > y){msg = "Decrescente";}

            System.out.printf("%s\n", msg);

        }while(x != y);


        sx.close();

    }
}
