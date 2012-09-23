package util;

public class CursoDTO {
  private int id;
  private int numero;
  private String nombre;
  private String sigla;

  public int getId() {return id;}
  public int getNumero() {return numero;}
  public String getNombre() {return nombre;}
  public String getSigla() {return sigla;}
  
  public void setId(int id) {this.id=id;}
  public void setNumero(int numero) {this.numero=numero;}
  public void setNombre(String nombre) {this.nombre=nombre;}
  public void setSigla(String sigla) {this.sigla=sigla;}
}