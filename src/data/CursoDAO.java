package data;
import java.util.Collection;
import util.CursoDTO;
import util.CursoAssembler;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class CursoDAO extends HibernateDaoSupport {
 public boolean insert(CursoDTO profDTO) {
   getHibernateTemplate().saveOrUpdate(profDTO);
   return true;
 }
 public boolean delete(CursoDTO profDTO) {
   getHibernateTemplate().delete(profDTO);
   return true;
 }
 public CursoDTO findById(int id) {
   CursoDTO prof;
   prof = (CursoDTO)getHibernateTemplate().get(CursoDTO.class,new Integer(id));
   return prof;
 }
 public boolean update(CursoDTO profDTO) {
   getHibernateTemplate().saveOrUpdate(profDTO);
   return true;
 }
 public Collection findAll() {
   return getHibernateTemplate().find("from CursoDTO");
 }
}