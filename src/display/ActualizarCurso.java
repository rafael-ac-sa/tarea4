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

public class ActualizarCurso extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
      CursoRepository curesores = (CursoRepository) context.getBean("curesorRepository");
    try {
        String id = request.getParameter("id");
        int idCur = Integer.parseInt(id);
        int numero = Integer.parseInt(request.getParameter("numero"));
        String nombre = request.getParameter("nombre");
        String sigla = request.getParameter("sigla");
        String area = request.getParameter("area");
        String telefono = request.getParameter("telefono");
        Curso cur = curesores.findCurso(idCur);
        try {
            cur.setNumero(numero);
            if (nombre!=null) cur.setNombre(nombre);
            if (sigla!=null) cur.setSigla(sigla);
        } catch (Exception e) {}
        response.sendRedirect("listaCursoes");
    } catch (Exception e) {
        request.setAttribute("mensaje",e.getMessage());
        forward("/paginaError.jsp",request,response);
    }
  }
}