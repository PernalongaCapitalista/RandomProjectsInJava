import java.util.Scanner;

public class AplicacaoUriProblem1114 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int senha = 0, j = 0;
        do {
            senha = scan.nextInt();
            j++;
        } while (senha != 2002);

        for (int i = 0; i < j-1; i++) {
            System.out.println("Senha invalida");

        }

        System.out.println("Acesso permitido");
        scan.close();
    }
}
//A mensagem vai ser exibida no mesmo numero de
// vezes em que tu errar pq o valor j tambem e
// usado no mesmo bloco while onde o valor do
// scanner entra.

/*debug:
* 1- Um valor eh digitado pelo usuario
* 2- Uma variavel J recebe zero, em seguida recebe ela
* mesma + 1, porem esse +1 soh vai ser atribuido no passo 7
* 3- Se for diferente de 2002 eh digitado dnv
* 4- Continua sendo digitado ateh ser igual a 2002
* 5- Valor == 2002: fim da aplicacao
* 6- Variavel i recebe 0, se for menor que (J - 1) => "Senha invalida"
* 7- Variavel J recebe ela mesma + 1, variavel i recebe ela mesma + 1
* 8- Se a condicao iniciada em 6- for verdadeira vai percorrer do 6 - 7 e reiniciar
* 9- Se for falsa, o processo acaba
* 10- Imprime na tela as mensagens da condicao 6 e "Acesso permitido"*/