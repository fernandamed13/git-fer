
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Alertas - GuardianGo</title>
</head>
<body>
    <h1>Listado de Alertas</h1>

    <table border="1">
        <tr>
            <th>ID</th>
            <th>Descripcion</th>
            <th>Placa</th>
            <th>Fecha</th>
        </tr>
        <c:forEach var="alerta" items="${alertas}">
            <tr>
                <td>${alerta.id}</td>
                <td>${alerta.descripcion}</td>
                <td>${alerta.placa}</td>
                <td>${alerta.fecha}</td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="${pageContext.request.contextPath}/nueva-alerta">
    <button>Agregar Nueva Alerta</button>
    </a>

</body>
</html>

