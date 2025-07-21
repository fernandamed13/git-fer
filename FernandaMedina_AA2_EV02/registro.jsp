<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registro de Usuario</title>
</head>
<body>
    <h1>Formulario De Registro</h1>
    <form action="registro-usuario" method="POST">
       Nombre: <input class="controls" type="text"  name="Nombre"  id="Nombre" placeholder="Ingrese su Nombre"><br>
      <br>
       Apellido: <input class="controls"  type="text"  name="Apellido"  id="Apellido" placeholder="Ingrese su Apellido"><br>
       <br>
       Correo: <input class="controls" type="email"  name="Correo"  id="Correo" placeholder="Ingrese su Correo"><br>
       <br>
       Teléfono: <input class="controls" type="number"  name="Teléfono"  id="Número de Teléfono" placeholder="Número de Teléfono"><br>
       <br>
       Contraseña: <input class="controls" type="password"  name="Contraseña"  id="Contraseña" placeholder="Ingrese su Contraseña"><br>
       <br>
       <input type="submit" value="Enviar">
    </form>
</body>
</html>