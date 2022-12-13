import java.util.Scanner;

public class Main {


    public static void  main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        myVariables();
        ex6();
        ex7();

    }
    public static void ex1() {
        System.out.println("Imi place Java");
    }
    public static void ex2() {
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
    }
    public static void ex3() {
        int varstaAna = 24;
        int diferentadevarstaDavid = 6;
        System.out.println("Varsta lui David: " + (varstaAna - diferentadevarstaDavid));
    }
    public static void ex4() {
        System.out.println("Numar de la tastatura");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Numar de la tastatura" + text);
    }
    public static void  myVariables() {
        int intreg = 1;
        System.out.println("Nr intreg " + intreg);
        String text = "test";
        System.out.println("Text " + text);
        boolean adevarat = true;
        System.out.println("Adevarat " + adevarat);

    }
    public static void ex6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar intrg");
        int numarIntreg = scanner.nextInt();
        System.out.println("Introduceti al doilea numar ");
        double numarDouble = scanner.nextDouble();
        System.out.println("intreg " + numarIntreg);
        System.out.println("Double" + numarDouble);

    }
    public static void ex7() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ex7 Introduceti un numar intreg");
        int numar = input.nextInt();
        int suma = numar -5;
        double diferenta = numar - 12.3;
        double inmultire = numar * -3.2;
        double impartire = numar / 4;
        int modul = numar % 6;
        System.out.println(" Suma " + suma + " Diferenta " + diferenta + " Inmultire " + inmultire + " Impartire " + impartire + " modul " + modul);

    }


}