package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner klavetura = new Scanner(System.in);

        System.out.println("irasyk kiek krastiniu skaiciuosi");

        int pasirinkimas = klavetura.nextInt();
        Trikampis trik1 = new Trikampis();
        Trikampis trik = new Trikampis();
        Keturkampis ket = new Keturkampis();
        Keturkampis ket1 = new Keturkampis();

        double pirma;
        double antra;
        double trecia;
        double ketvirta;

//        klavetura = new Scanner(System.in);

        if (pasirinkimas == 3){
            System.out.println("ivesk krastines ");
            pirma = klavetura.nextDouble();
            antra = klavetura.nextDouble();
            trecia = klavetura.nextDouble();

            trik = new Trikampis(pirma, antra, trecia);
            System.out.println(trik.toString());
            System.out.println(trik.imtiTrikampioPerimetra());

//            trik1 = new Trikampis(pirma, antra, trecia);
//            System.out.println(trik1.toString());
//            System.out.println(trik1.imtiTrikampioPerimetra());

        }

        else {
            System.out.println("ivesk keturkampio krastines ");
            pirma = klavetura.nextDouble();
            antra = klavetura.nextDouble();
            trecia = klavetura.nextDouble();
            ketvirta = klavetura.nextDouble();

            ket = new Keturkampis(pirma, antra, trecia, ketvirta);
            System.out.println(ket.toString());
            System.out.println(ket.imtiKeturkampioPerimetra());
        }

//        klavetura = new Scanner(System.in);

        System.out.println("irasyk kiek krastiniu skaiciuosi");

        pasirinkimas = klavetura.nextInt();

        if (pasirinkimas == 3){
            System.out.println("ivesk trikampio krastines ");
            pirma = klavetura.nextDouble();
            antra = klavetura.nextDouble();
            trecia = klavetura.nextDouble();

//            trik = new Trikampis(pirma, antra, trecia);
//            System.out.println(trik.toString());
//            System.out.println(trik.imtiTrikampioPerimetra());

            trik1 = new Trikampis(pirma, antra, trecia);
            System.out.println(trik1.toString());
            System.out.println(trik1.imtiTrikampioPerimetra());

        }

        else {
            System.out.println("ivesk keturkampio krastines ");
            pirma = klavetura.nextDouble();
            antra = klavetura.nextDouble();
            trecia = klavetura.nextDouble();
            ketvirta = klavetura.nextDouble();

            ket1 = new Keturkampis(pirma, antra, trecia, ketvirta);
            System.out.println(ket1.toString());
            System.out.println(ket1.imtiKeturkampioPerimetra());
        }
        System.out.println("------------------------------------");
        System.out.println("trik: "+trik.imtiTrikampioPerimetra());
        System.out.println("trik1: "+trik1.imtiTrikampioPerimetra());
        System.out.println("ket: "+ket.imtiKeturkampioPerimetra());
        System.out.println("ket1: "+ket1.imtiKeturkampioPerimetra());

        double suma = trik.imtiTrikampioPerimetra()+ket1.imtiKeturkampioPerimetra();
        System.out.println("suma: "+suma);



//        Trikampis obj = new Trikampis();
//        double trikampioPerimetras = obj.perimetras();
//        Keturkampis obj1 = new Keturkampis();
//        double keturkampioperimetras = obj1.perimetras();

    }
}
