package domain;

public class Curso {
  private int id;
  private int numero;
  private String sigla;
  private String nombre;

  public Curso () {};
  public void setId(int id) {this.id=id;}
  public void setNumero(int numero) {this.numero=numero;}
  public void setNombre(String nombre) {this.nombre=nombre;}
  public void setSigla(String sigla) {this.sigla=sigla;}
  
  public int getId() {return id;}
  public int getNumero() {return numero;}
  public String getNombre() {return nombre;}
  public String getSigla() {return sigla;}
}