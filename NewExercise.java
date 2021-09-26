import java.util.Scanner;

public class NewExercise {
    public static void main(String[] args){
        Scanner sx = new Scanner(System.in);

        System.out.println("Enter trhee numbers: ");
        int x, y, z;
        x = sx.nextInt();
        y = sx.nextInt();
        z = sx.nextInt();

        sx.close();

    int higher = max(x, y, z);
    showResult(higher);

    }

    public static int max(int x, int y, int z){
        int aux;
        aux = Math.max(Math.max(x, y), z);
        return aux;
    }

    public static void showResult(int aux){
        System.out.printf("Higher = %d\n", aux);
    }

}
