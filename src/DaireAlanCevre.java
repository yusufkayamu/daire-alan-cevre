

import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        double r , pi = 3.14 , merkeza ;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yari capini giriniz =");
        r = input.nextDouble();

        System.out.print("merkez acısının olcusunu giriniz (tam ise 360 yazınız) =");
        merkeza = input.nextDouble();

        Double c = 2 * pi * r;
        Double a = (pi * r * r * merkeza) / 360 ;

        System.out.println("alan =" + a);
        System.out.println("cevre =" + c);







    }
}
