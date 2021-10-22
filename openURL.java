import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Random;
import java.awt.Desktop;
import java.net.URI;

public class openURL {
    public static void main(String[] args) throws URISyntaxException, IOException {
        Random r = new Random();
        String url = "http://www.google.com";

        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else{
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("xdg-open " + url);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        }

    }

















/*    public static void r(Random r, String a) throws URISyntaxException, IOException {

        if(Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)){
            Desktop.getDesktop().browse(new URI("google.com"));
        }
    }
}

 */
/*Runtime rt = Runtime.getRuntime();
        String url = "https://google.com";
        String[] browsers = {"brave", "opera", "firefox"};

        StringBuffer cmd = new StringBuffer();
        for(int i = 0; i < browsers.length; i++){
            if(i == 0){
                cmd.append(String.format(    "%s \"%s\"", browsers[i], url));
            }else {
                cmd.append(String.format(" || %s \"%s\"", browsers[i], url));
            }

        rt.exec(new String[] {"sh", "-c", cmd.toString()});*/

/*  String url = "https://google.com";
            Runtime rt = Runtime.getRuntime();
            rt.exec("/home/pernalonga/AUR-packages/brave/brave-browser.desktop -new-window" + url);*/
/*  try {
            //Set your page url in this string. For eg, I m using URL for Google Search engine
            String url = "http://www.google.com";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        }
        catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }*/