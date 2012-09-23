package data;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import domain.CursoRepository;
import util.CursoDTO;
import util.CursoAssembler;
import domain.Curso;

public class CursoRepositoryDAOImpl implements CursoRepository {
 private CursoDAO curDAO;
 CursoRepositoryDAOImpl(CursoDAO curDAO) {
   this.curDAO = curDAO;
 }
 public boolean insertCurso(Curso cur) {
   CursoDTO curDTO = CursoAssembler.CreateDTO(cur);
   return (curDAO.insert(curDTO));
 }
 public boolean deleteCurso(Curso cur) {
   CursoDTO curDTO = CursoAssembler.CreateDTO(cur);
   return (curDAO.delete(curDTO));
 }
 public Curso findCurso(int id) {
   CursoDTO curDTO = curDAO.findById(id);
   if (curDTO!=null) {
     Curso cur = new Curso();
     System.out.println(curDTO.getNombre());
     CursoAssembler.Update(cur,curDTO);
     return cur;
   }
   return null;
 }
 public boolean updateCurso(Curso cur) {
   CursoDTO curDTO = CursoAssembler.CreateDTO(cur);
   return (curDAO.update(curDTO));
 }
 public Collection findAllCurso() {
   Collection cursDTO = curDAO.findAll();
   List curList = new ArrayList();
   Iterator itr = cursDTO.iterator();
   while (itr.hasNext()) {
     Curso cur = new Curso();
     CursoDTO curDTO = (CursoDTO)itr.next();
     CursoAssembler.Update(cur,curDTO);
     curList.add(cur);
   }
   return curList;
 }
}