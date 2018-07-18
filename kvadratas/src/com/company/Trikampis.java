package com.company;
public class Trikampis {

private double pirma;
private double antra;
private double trecia;

  public Trikampis(double pirma, double antra, double trecia) {
    this.pirma = pirma;
    this.antra = antra;
    this.trecia = trecia;

  }

  public Trikampis (){
    this(0, 0, 0);
  }

  public double imtiTrikampioPerimetra(){
    return pirma+antra+trecia;
  }

  @Override
  public String toString() {
    return "Trikampis{" +
            "pirma=" + pirma +
            ", antra=" + antra +
            ", trecia=" + trecia +
            '}';

  }


}