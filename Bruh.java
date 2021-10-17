import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Bruh {
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();

        int y = r.nextInt(25);

        System.out.println("Hacking NASA... " + y + "%");

            

            y = r.nextInt(50);
            while(y < 25){
                y = r.nextInt(50);

            }
            System.out.println("Hacking NASA... " + y + "%");
            int h = r.nextInt(5) + 1;
            TimeUnit.SECONDS.sleep(h);

            y = r.nextInt(75);
            while(y < 50){
                y = r.nextInt(75);

            }
            System.out.println("Hacking NASA... " + y + "%");
            h = r.nextInt(5) + 1;
            TimeUnit.SECONDS.sleep(h);

            y = r.nextInt(100);
            while(y < 75){
                y = r.nextInt(100);

            }
            System.out.println("Hacking NASA... " + y + "%");
            h = r.nextInt(5) + 1;
            TimeUnit.SECONDS.sleep(h);
            System.out.println("Hacking NASA... 99%");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("NASA hacked succesfull");

    }


}
