import java.util.Random;
import java.util.Scanner;

public class genRandomPassPhraseOPTMIZED {
    public static void main(String[] args){
        Scanner sx = new Scanner(System.in);

        System.out.println("De quantos caracteres sera sua senha: ");
        int c = sx.nextInt();


        Random r = new Random();

        String charac = "";

        int randomInt = 0; char randomChar = 'a';

        passPhrase(c, r, charac, randomInt, randomChar);

        sx.close();
    }

    public static int passPhrase(int c, Random r, String charac, int randomInt, char randomChar){
        charac = "qwertyuiopasdfghjklçzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890!@#$%*()-=_+'¹²³£¢¬{[]}§ªº~´─°<|";
        System.out.print("Sua senha eh: ");
        for(int i = 8; i < 21; i++){
                if(c == i){
                for(int j = 0; j < i; j++){
                    randomInt = r.nextInt(charac.length());
                    randomChar = charac.charAt(randomInt);
                    System.out.print(randomChar);
                }

            }
        }

        return 0;
    }
}
