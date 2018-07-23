package com.company;
import jdk.nashorn.api.tree.ContinueTree;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class Main {

  public static void main(String[] args) {

    System.out.println("Labas.");
    System.out.println("Koks tavo vardas?");
    System.out.println("?????????????????");

    String tavoVardas;
    Scanner vardas = new Scanner(in);
    tavoVardas = vardas.nextLine();

    System.out.println("Labas " + tavoVardas.toUpperCase());
    System.out.println("Kiek tau metu? ");

    int kiekMetu;
    Scanner metai = new Scanner(in);
    kiekMetu = metai.nextInt();

    if (kiekMetu < 18) {
      System.out.println("TU NEPILNAMETIS IR NEGALI ZAISTI AZARTINIU ZAIDIMU");
      return;
    } else {
      System.out.println(tavoVardas.toUpperCase() + " tau reikes atspeti skaiciu nuo nulio iki desimt");
    }

    Scanner spejimuKiekiui = new Scanner(in);
    int kiekKartu;
    System.out.println("Is kiek kartu galvoji, kad atspesi?");
    kiekKartu = spejimuKiekiui.nextInt();
    if (kiekKartu < 0 || kiekKartu > 20) {
      System.out.println(tavoVardas.toUpperCase() + " nu negi tiek kartu speliosi?");
      System.out.println("Gerai bandyk dar karta");
      return;
    } else {

      while (kiekKartu > 0) {

        System.out.println("Gerai spek jau sugalvojau.");

        int r = (int) (Math.random() * 10);
        Scanner klavetura = new Scanner(in);
        int skaicius = klavetura.nextInt();
        if (skaicius == r) {
          System.out.println("++++++++++++");
          System.out.println("------------");
          System.out.println("++++++++++++");

          System.out.println(tavoVardas.toUpperCase());
          System.out.println();
          System.out.println("SVEIKINAM TAVE!!!");
          System.out.println("++++++++++++");
          System.out.println("------------");
          System.out.println("++++++++++++");
          break;
        }
        //cia klaida
        else if (kiekKartu < 0 || r > 10) {
          System.out.println(tavoVardas.toUpperCase() + " ZIUREK KA VEDI.");
          System.out.println("Gerai bandyk dar karta");
          return;
        //iki cia turbut
      }
        else {
          System.out.println("Bandykite dar karta :(");
          System.out.println(r);
        }

        kiekKartu--;
      }
      }
    }
  }
