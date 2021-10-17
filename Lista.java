import java.util.Scanner;

public class Lista {
    public static void main(String[] args){
        Scanner sx = new Scanner(System.in);

        String dia[] = {"01/01/2021", "02/01/2021", "03/01/2021"};
        String alunos[] = {"fulano", "clicano", "deltano"};

        String chamada[][] = new String[dia.length][alunos.length];

        sx.close();

        for(int i = 0; i < dia.length; i++){
            System.out.println("Chamada do dia " + dia[i]);
            System.out.println("Aluno " + alunos[i] + " está presente?(sim/não)");
            String yn = sx.next();
            if(yn.equals("sim")){
                System.out.println("Ok");

            }else{
                System.out.println("Ok, falta marcada");
            }
        }
    }
}
