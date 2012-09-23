package domain;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public interface CursoRepository {
  public boolean insertCurso(Curso cur);
  public boolean deleteCurso(Curso cur);
  public Curso findCurso(int id);
  public boolean updateCurso(Curso cur);
  public Collection findAllCurso();
}