<%@ page import="java.util.Map" %>
<%@ page import="util.*" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Sistema Universitario</title>
  </head>
  <h1>Sistema Universitario</h1>
  <h2>Detalle de Curso</h2>
  <% CursoDTO cur = (CursoDTO)request.getAttribute("Curso"); %>
  <form name="ActualizarCurso" action="/universidad/actualizarCurso" method="get">
  <input type="hidden" name="id" value="<%= cur.getId() %>"/>
  <table>
    <tr><td>Nombre:</td><td><input type="text" name="nombre" value="<%= cur.getNombre() %>"/></td></tr>
    <tr><td>Numero:</td><td><input type="text" name="numero" value="<%= cur.getNumero() %>"/></td></tr>
    <tr><td>Sigla:</td><td><input type="text" name="sigla" value="<%= cur.getSigla() %>"/></td></tr>
    <tr><td></td><td><input type="submit" value="Actualizar" /></td></tr>
  </table>
  </form>
</html>