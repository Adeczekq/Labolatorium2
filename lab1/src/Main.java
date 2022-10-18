import java.util.Random;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        if(czypalidrom("ala")) System.out.println(" To jest palidrom");

        else  System.out.println(" To nie  jest palidrom");

    }

    private static void Zadanie2() {
        double sumad = 0, sumau = 0, iledot = 0, ileu = 0, liczba;
        for (int i = 0; i < 10; i++) {
            liczba = Input();
            if (liczba >= 0) {
                sumad += liczba;
                iledot++;
            } else {
                ileu++;
                sumau += liczba;
            }
        }
        System.out.println("Suma liczb dodatnich= " + sumad + "ilosc liczb " + iledot);
        System.out.println("Suma liczb ujemnych= " + sumau + "ilosc liczb" + ileu);
    }


    public static double Input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj n: ");
        double n = input.nextDouble();
        return n;
    }

    public static void zadanie1() {
        double ilStud = Input();
        double pkt;
        int a = 0, b = 40, suma = 0, ile = 0;
        if (ilStud > 0) {
            while (ilStud > 0) {
                System.out.println("Podaj lp.pkt 0-40 ");
                pkt = Input();
                if (pkt >= a && pkt <= b) {
                    suma += pkt;
                    ile++;
                    ilStud--;
                }
            }
            System.out.println("Suma pkt" + suma);
            System.out.println("Srednia " + suma / ile);

        } else System.out.println("grupa musi liczyc co najmniej 1go studenta");


    }
    public static void Zadanie3(){
        double n=Input();
        double liczba,suma=0;
        if(n>0){
            while(n>0) {
                liczba = Input();
                if (liczba % 2 == 0) suma += liczba;
                n--;
            }
            System.out.println("suma liczb parzystych:"+suma);
        }
        else System.out.println(" ciag musi miec conajmniej jedna liczbe");
    }
    public static void Zadanie4(){
        double n=Input();
        double liczba,suma=0;
        Random rand=new Random();

        if(n>0){
            while(n>0) {
                liczba=rand.nextInt(56)-10;
                liczba = Input();
                if (liczba % 2 == 0) suma += liczba;
                n--;
            }
            System.out.println("suma liczb parzystych:"+suma);
        }
        else System.out.println(" ciag musi miec conajmniej jedna liczbe");
    }
    public static boolean czypalidrom(String text){
        int end=text.length()-1;
        text.toLowerCase(Locale.ROOT);
        for (int i = 0; i <text.length()/2 ; i++) {
            if(text.charAt(i)!=text.charAt(end)) return false;
            end--;
        }
        return true;
    }
}






