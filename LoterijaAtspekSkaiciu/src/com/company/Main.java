package com.company;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

  public static void main(String[] args) {

    System.out.println("Labas.");
    System.out.println("Koks tavo vardas?");
    System.out.println("?????????????????");

    String tavoVardas;
    Scanner vardas = new Scanner(in);
    tavoVardas = vardas.nextLine();


    System.out.println("Labas "+tavoVardas);
    System.out.println("Kiek tau metu? ");

    int kiekMetu;
    Scanner metai = new Scanner(in);
    kiekMetu = metai.nextInt();

    Scanner spejimuKiekiui = new Scanner(in);
    int kiekKartu;
    System.out.println("Is kiek kartu galvoji, kad atspesi?");
    kiekKartu = spejimuKiekiui.nextInt();

    while (kiekKartu>0){

      System.out.println("Atspek skaiciu nuo 0 iki 10 ");

      int r = (int)(Math.random()*10);
      Scanner klavetura = new Scanner(in);
      int skaicius = klavetura.nextInt();
      if (skaicius == r){
        System.out.println("Sveikinam!!!");
        System.out.println("------------");
        break;
      }
      else {
        System.out.println("Bandykite dar karta :(");
        System.out.println(r);
      }
      kiekKartu--;
    }
  }
}
