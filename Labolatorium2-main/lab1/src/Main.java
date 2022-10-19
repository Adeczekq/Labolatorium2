import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // if(czypalidrom("ala")) System.out.println(" To jest palidrom");

        // else  System.out.println(" To nie  jest palidrom");
        // funkcjakw(2,3,5);
        // pogoda();
        //car();
        dzial();

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
    public static boolean Input2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj n: ");
        boolean n = input.nextBoolean();
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

    public static void Zadanie3() {
        double n = Input();
        double liczba, suma = 0;
        if (n > 0) {
            while (n > 0) {
                liczba = Input();
                if (liczba % 2 == 0) suma += liczba;
                n--;
            }
            System.out.println("suma liczb parzystych:" + suma);
        } else System.out.println(" ciag musi miec conajmniej jedna liczbe");
    }

    public static void Zadanie4() {
        double n = Input();
        double liczba, suma = 0;
        Random rand = new Random();

        if (n > 0) {
            while (n > 0) {
                liczba = rand.nextInt(56) - 10;
                liczba = Input();
                if (liczba % 2 == 0) suma += liczba;
                n--;
            }
            System.out.println("suma liczb parzystych:" + suma);
        } else System.out.println(" ciag musi miec conajmniej jedna liczbe");
    }

    public static boolean czypalidrom(String text) {
        int end = text.length() - 1;
        text.toLowerCase(Locale.ROOT);
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(end)) return false;
            end--;
        }
        return true;
    }

    public static void funkcjakw(double a, double b, double c) {
        double delta, x1, x2;
        System.out.println("Podaj a b i c:  ");
        a = Input();
        b = Input();
        c = Input();
        delta = (b * b) - (4 * a * c);
        System.out.println("Funkcja kwadratowa : y = " + a + "^2+" + b + "x+" + c);

        if (delta > 0) {
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("x1= " + x1 + " x2= " + x2);
        }
        if (delta == 0) {
            x1 = (-1) * b / (2 * a);
            System.out.println("x1= " + x1);
        }
        if (delta < 0) System.out.println(" Delta ujemna nie posiada miejsc zerowych ");
    }
public static void pogoda(){
        boolean deszcz,autobus;
        System.out.println("Jeżli pada deszcz wpisz true jeżeli nie pada wpisz false");
        deszcz=Input2();
        System.out.println("Jeżli jest autobus wpisz true jeżeli nie ma wpisz false");
        autobus=Input2();
        if(deszcz&&autobus) System.out.println("Weź parasol, Dostaniesz się na uczelnie");
        if(deszcz&&!autobus) System.out.println("Nie dostaniesz się na uczelnie");
        if(!deszcz&&autobus) System.out.println("Dostaniesz się na uczelnie , Miłego dnia i pieknej pogody");
}
public static void car(){
        boolean znizka,premia;
        System.out.println("Jeżli otrzymałes premie wpisz true jeżeli nie  false");
        premia=Input2();
        System.out.println("Jeżli jest znizka na samochod wpisz true jeżeli nie wpisz false");
        znizka=Input2();
        if(!znizka||premia) System.out.println("Możesz kupić samochód ! Zniżki na samochód nie ma");
        if(!znizka||!premia) System.out.println("Zakup samochód trzeba odłożyć na później... Zniżki na samochód nie ma");
        if(znizka||premia) System.out.println("Możesz kupić samochód !Możesz kupić samochód !");
}
public static void dzial(){

        double a,b,wynik;
    Scanner input = new Scanner(System.in);
    System.out.println("Podaj znak działania: ");
    char n = input.next().charAt(0);
    System.out.println("podaj 2 liczby");
    a=Input();
    b=Input();
    if(n=='+'){
        wynik=a+b;
        System.out.println("Wynik dodawania: "+wynik);
    }

    if(n=='-'){
        wynik=a-b;
        System.out.println("Wynik odejmowania: "+wynik);
    }
    if(n=='/'){
        wynik=a/b;
        System.out.println("Wynik dzielenia: "+wynik);

    }
    if(n=='*'){
        wynik=a*b;
        System.out.println("Wynik mnożenia: "+wynik);

    }
    if(n=='%') {
        wynik=a%b;
        System.out.println("Wynik reszty z dzielenia: "+wynik);
        
    }
}
}










