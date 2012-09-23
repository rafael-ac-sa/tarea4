package domain;

public class CursoFactory {
  public Curso Create(int id,int numero,String nombre,String sigla) {
    try {
      Curso cur = new Curso();
      cur.setId(id);
      cur.setNombre(nombre);
      cur.setNumero(numero);
      cur.setSigla(sigla);
      return cur;
    } catch (Exception e) {
      return null;
    }
  }
}