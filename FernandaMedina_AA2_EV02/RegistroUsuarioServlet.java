/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.guardiangoweb;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registro-usuario")
public class RegistroUsuarioServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("Nombre");
        String apellido = request.getParameter("Apellido");
        String correo = request.getParameter("Correo");
        String telefono = request.getParameter("Teléfono");
        String contraseña = request.getParameter("Contraseña");

        // Aquí podrías validar y guardar datos, si tuvieras una BD

        // Enviar mensaje a resultado.jsp
        request.setAttribute("mensaje", "Registro exitoso de " + nombre + " " + apellido);

        // Redireccionar al JSP
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}

