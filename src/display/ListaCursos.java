package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.CursoRepository;
import domain.Curso;
import util.CursoDTO;
import util.CursoAssembler;

public class ListaCursos extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
      CursoRepository cursos = (CursoRepository) context.getBean("cursoRepository");
    try {
        Collection lista = cursos.findAllCurso();
        List data = new ArrayList();
        Iterator itr = lista.iterator();
        while (itr.hasNext()) {
            Curso cur = (Curso)itr.next();
            CursoDTO dto = CursoAssembler.CreateDTO(cur);
            data.add(dto);
        }
      request.setAttribute("cursos",data);
      forward("/listaCursos.jsp",request,response);
    } catch (Exception e) {
        request.setAttribute("mensaje",e.getMessage());
        forward("/paginaError.jsp",request,response);
    }
  }
}