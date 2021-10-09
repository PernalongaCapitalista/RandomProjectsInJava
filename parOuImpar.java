import java.util.Random;
import java.util.Scanner;

public class parOuImpar {
    public static void main(String[] args){
        System.out.printf("Bem vindo ao jogo de par ou impar\n");
        System.out.printf("Você escolhe PAR ou IMPAR?\n");

        Scanner sx = new Scanner(System.in);
        String parOUImpar = sx.next();
        System.out.printf("Ok, digite seu número. O programa vai digitar um numero tambem\n");
        int jogador = sx.nextInt();

        sx.close();

        int rrr = 0;
        int rr = random(rrr);
        System.out.println("O número escolhido pelo programa é: " + rr);

        if(parOUImpar.equals("PAR")){
            if ((rr + jogador) % 2 != 0) {
                System.out.printf("Que pena, você perdeu :(\n");
            }else {
                System.out.printf("Parabéns, você venceu :D\n");
            }

        }else if(parOUImpar.equals("IMPAR")){
            if((rr + jogador ) % 2 != 0){
                System.out.printf("Parabéns, você venceu :D\n");
            }else {
                System.out.printf("Que pena, você perdeu :(\n");
            }

        }else {
            System.out.printf("Parametro invalido :/ tente novamente");
            System.exit(0);
        }
    }

    public static int random(int rrr){
        Random rr = new Random();

        rrr = rr.nextInt(100);
        return rrr;
    }


}
