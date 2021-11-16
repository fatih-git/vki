import java.util.Scanner;

/**
 * @author fatih-git
 */

public class VKİ {

    public static void main(String[] args) {

        double kilo, boy, index;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen kilonuzu giriniz(kg.): ");
        kilo=input.nextDouble();

        System.out.print("Lütfen boyunuzu giriniz(m.): ");
        boy=input.nextDouble();

        index=(kilo/(boy*boy));

        System.out.println("Vücut kitle indeksiniz:"+index);

    }

}
