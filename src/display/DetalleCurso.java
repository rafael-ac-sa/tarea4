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

public class DetalleCurso extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
      CursoRepository cursos =
        (CursoRepository) context.getBean("cursoRepository");
    try {
      String id = request.getParameter("id");
      int idCur = Integer.parseInt(id);
      Curso cur = cursos.findCurso(idCur);
      CursoDTO dto = CursoAssembler.CreateDTO(cur);
      request.setAttribute("curso",dto);
      forward("/detalleCurso.jsp",request,response);
    } catch (Exception e) {
      request.setAttribute("mensaje",e.getMessage());
      forward("/paginaError.jsp",request,response);
    }
  }
}