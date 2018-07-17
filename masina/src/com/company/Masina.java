package com.company;

public class Masina {
  private int dureles;     // durelių skaičius
  private double variklis;   // variklis
  private char spalva;    // spalva
  private double greitis;
  /**
   * Konstruktorius
   * @param dureles   - pradinis durelių skaičius
   * @param variklis    - pradinis variklis
   * @param spalva   - pradinė spalva
   */
  public Masina(int dureles, double variklis, char spalva) {
    this.dureles = dureles;
    this.variklis = variklis;
    this.spalva = spalva;
    this.greitis = 0;
  }

  public void persidazom(char spalva) {
    this.spalva = spalva;
  }

  /**
   * Metodas didina greitį
   * @param kiek - kokiu dydžiu didiname
   */
  public void gazuojam(double kiek){
    greitis += kiek;
  }

  /**
   * Metodas mažina greitį
   * @param kiek - kokiu dydžiu mažiname greitį
   */
  public void stabdom(double kiek){
    this.greitis -= kiek;
    if(this.greitis < 0){
      this.greitis = 0;
    }
  }

  /**
   * Gražina automobilio greitį
   * @return greitis
   */
  public double koksGreitis() {
    return greitis;
  }

  /**
   * Metodas padidina greitį 5 (
   */
  public void gazuojam() {
    this.greitis += 5;
  }

}
