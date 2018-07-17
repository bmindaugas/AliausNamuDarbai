package com.company;
public class Keturkampis {

  private double pirma;
  private double antra;
  private double trecia;
  private double ketvirta;

  public Keturkampis(double pirma, double antra, double trecia, double ketvirta) {
    this.pirma = pirma;
    this.antra = antra;
    this.trecia = trecia;
    this.ketvirta = ketvirta;
  }

  public double imtiKeturkampioPerimetra() {
    return pirma + antra + trecia + ketvirta;
  }

  @Override
  public String toString() {
    return "Keturkampis{" +
            "pirma=" + pirma +
            ", antra=" + antra +
            ", trecia=" + trecia +
            ", ketvirta=" + ketvirta +
            '}';
  }
}
