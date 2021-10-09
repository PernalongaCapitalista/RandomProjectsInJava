import java.util.List;
import java.util.Arrays;

public class StringProject {
    public static void main(String[] args){
        String textoRei = "oo ratoato roeuoeu aa roupaoupa dodo reiei dee romaooma";
        System.out.println(processText(textoRei));
        String textoBanana = "banana";
        System.out.println(processText(textoBanana));
    }

    public static String processText(String texto){
        List<String> textList = Arrays.asList(texto.split(""));
        String retorno = "";
        for(String textos: textList){
            String concatenaLetras = "";
            String restoTexto = "";
            for(int i = 0; i < textos.length(); i++){
                concatenaLetras += textos.substring(i, i+1);
                restoTexto = textos.substring(i+1, textos.length());
                if(concatenaLetras.contains(restoTexto)){
                    retorno += concatenaLetras + "";
                    break;
                }
            }
        }
        return retorno.trim() + "";
    }
}
