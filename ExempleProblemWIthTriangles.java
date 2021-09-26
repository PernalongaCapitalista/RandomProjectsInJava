import java.util.Scanner;

public class ExempleProblemWIthTriangles {
    public static void main(String[] args){
        Scanner sx = new Scanner(System.in);

        System.out.printf("Enter the measures of triangle X:\n");
        double x, y, z;
        x = sx.nextDouble();
        y = sx.nextDouble();
        z = sx.nextDouble();

        System.out.printf("Enter the measures of triangle Y\n");
        double a, b, c;
        a = sx.nextDouble();
        b = sx.nextDouble();
        c = sx.nextDouble();

        sx.close();

         double area1 = areaX(x, y, z);
         double area2 = areaY(a, b, c);
         double larger = max(area1, area2);


        String XY = "";
        if(area1 > area2){
            XY = "X";
        }else{
            XY = "Y";
        }

         System.out.printf("Triangle X area: %.4f\n", area1);
         System.out.printf("Triangle Y area: %.4f\n", area2);
         System.out.printf("Larger area: %.4f\n", larger);
         System.out.printf("Larger triangle: %.4s\n", XY);
    }

    public static double areaX(double x, double y, double z){
        double p = (x + y + z) / 2;
        double areaX = Math.sqrt(p * (p - x) * (p-y) * (p - z));
        return areaX;
    }
    public static double areaY(double a, double b, double c){
        double j = (a + b + c) / 2;
        double areaY = Math.sqrt(j * (j - a) * (j-b) * (j - c));
        return areaY;
    }
    public static double max(double areaX, double areaY){
        double aux = Math.max(areaX, areaY);
        return aux;
    }


}
