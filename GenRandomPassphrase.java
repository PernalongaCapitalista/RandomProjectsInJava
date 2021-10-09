import java.util.Random;
import java.util.Scanner;

public class GenRandomPassphrase {
    public static void main(String[] args) {
        System.out.printf("Escolha de quantos caracteres será sua senha:\n");
        Scanner sx = new Scanner(System.in);

            int n = sx.nextInt();

        sx.close();


        Random random = new Random();

        String charac = "abcdefghijklmnopqrstuvwxyz123456789!@#$%*()-_+=¹²³£¢¬{[]}§'¬ABCDEFGHIJKLMNOPQRSTUV";

        int randomInt = 0;

        char randomChar = 'a';
        i(n, randomInt, random, charac, randomChar);





    }
    public static int i(int n, int randomInt, Random random, String charac, char randomChar){
        switch(n){
            case 8:
                System.out.print("Sua senha é: ");
                for(int i = 0; i < 8; i++){
                    randomInt = random.nextInt(charac.length());
                    randomChar = charac.charAt(randomInt);
                    System.out.print(randomChar);
                }
            break;
            case 9:
                System.out.print("Sua senha é: ");
                for(int i = 0; i < 9; i++){
                    randomInt = random.nextInt(charac.length());
                    randomChar = charac.charAt(randomInt);
                    System.out.print(randomChar);
                }
            break;
            case 10:
                System.out.print("Sua senha é: ");
                for(int i = 0; i < 10; i++){
                    randomInt = random.nextInt(charac.length());
                    randomChar = charac.charAt(randomInt);
                    System.out.print(randomChar);
                }
        }

        return 0;
    }

}