package br.com.senai.servelet01.classes;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class OlaMundo extends HttpServlet {
	/**
	 *Vitor Luiz da Silva Couto
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		PrintWriter saida = arg1.getWriter();
		saida.println("<!DOCTYPE html>");
		saida.println("<HTML lang=en>");
		saida.println("<Head>");
		saida.println("<meta charset=\"ISO-8859-1\">");
		saida.println("</Head>");
		saida.println("<body>");
		saida.println("<h1>Produtos</h1>");
		saida.println("<p>Arroz</p>");
		saida.println("<p>Macarrao</p>");
		saida.println("<p>Coca</p>");
		saida.println("</body>");
		saida.println("</HTML>");
				
		
		
	}
}
