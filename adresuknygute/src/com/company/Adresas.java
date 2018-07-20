package com.company;

/**
 * i klase adresas rasom
 * salis
 * miestas
 * gatve
 * namas
 * @author Mindaugas
 *
 */
public class Adresas {

private String salis;
private String miestas;
private String gatve;
private String namas;

  /**
   * metodas gauna sali
   * @return salis
   */
  public String getSalis(){
  return salis;
}

  /**
   * metodas priskirti saliai
   * @param salis
   */
  public void setSalis(String salis){
  this.salis = salis;
}

  public String getMiestas(){
    return miestas;
  }
  public void setMiestas(String miestas){
    this.miestas = miestas;
  }

  public String getGatve(){
    return gatve;
  }
  public void setGatve(String gatve){
    this.gatve = gatve;
  }

  public String getNamas(){
    return namas;
  }
  public void setNamas(String namas){
    this.namas = namas;
  }
}
