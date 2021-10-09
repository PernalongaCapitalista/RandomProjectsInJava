import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int primos[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 };
        int soma[] = new int[11];

        for(int i = 0; i < 11; i++ ){
            soma[i] = 0;
            for(int j = 0; j <= i; j++){
            soma[i] += primos[j];

            System.out.println(soma[i]);
            }

        }

    }
}
