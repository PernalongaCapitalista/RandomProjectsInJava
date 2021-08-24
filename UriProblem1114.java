import java.util.Scanner;

public class UriProblem1114 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            int senha = 0, j = 0;
            do{
                senha = scan.nextInt();
            }while(senha != 2002);

            for(int i = 0; i < j; i++){
                System.out.println("Senha invalida");

            }

            System.out.println("Acesso permitido");
        scan.close();
    }
}
