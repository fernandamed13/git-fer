<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Registrar nueva alerta</title>
</head>
<body>
    <h2>Registrar nueva alerta</h2>

    <form:form method="POST" action="guardar-alerta" modelAttribute="alerta">
        <p>
            Descripción:<br/>
            <form:input path="descripcion" />
        </p>
        <p>
            Placa:<br/>
            <form:input path="placa" />
        </p>
        <p>
            Fecha:<br/>
            <form:input path="fecha" />
        </p>
        <p>
            <input type="submit" value="Guardar Alerta" />
        </p>
    </form:form>

    <p><a href="alertas">Volver al listado</a></p>
</body>
</html>