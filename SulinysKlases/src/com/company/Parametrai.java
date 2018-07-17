package com.company;
import java.util.Scanner;
public class Parametrai {
  public void parametrai() {

    //Šulinio vandens kubatūros skaičiuoklė.
    Scanner klavetura = new Scanner(System.in);

    //Šulinio deametras metrais.
    double deametras;
    System.out.println("Įveskite šulinio deametra metrais: ");
    deametras = klavetura.nextDouble();

    //Vandens gylis metrais.
    double gylis;
    System.out.println("Įveskite šulinio vandens gylį metrais: ");
    gylis = klavetura.nextDouble();

  }
}
