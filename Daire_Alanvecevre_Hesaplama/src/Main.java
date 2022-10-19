import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pi=3.14,r,aci,Alan;

        Scanner inp = new Scanner(System.in);

        System.out.print("r değerini giriniz");
        r = inp.nextDouble();

        System.out.print("Açı değerini giriniz");
        aci = inp.nextDouble();

        Alan = (pi*(r*r)*aci)/360;

        System.out.println("Daire diliminin alanı: " + Alan);



    }
}