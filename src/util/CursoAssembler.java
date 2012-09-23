package util;
import domain.Curso;

public class CursoAssembler {
  public static CursoDTO CreateDTO(Curso cur) {
    CursoDTO dto = new CursoDTO();
    dto.setId(cur.getId());
    dto.setNumero(cur.getNumero());
    dto.setNombre(cur.getNombre());
    dto.setSigla(cur.getSigla());
    return dto;
  }
  public static void Update(Curso prof, CursoDTO dto) {
    try {
      prof.setId(dto.getId());
      prof.setNumero(dto.getNumero());
      prof.setNombre(dto.getNombre());
      prof.setSigla(dto.getSigla());
    } catch (Exception e) {
    }
  }
}