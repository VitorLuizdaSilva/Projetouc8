package br.com.senai.servelet01.classes;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse; 



@WebServlet(urlPatterns = "/camisetas")

public class Camisetas extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
		throws ServletException, IOException {
		PrintWriter saida = arg1.getWriter();
		saida.println("<!DOCTYPE html>");
		saida.println("<HTML lang=en>");
		saida.println("<Head>");
		saida.println("<meta charset=\"ISO-8859-1\">");
		saida.println("</Head>");
		saida.println("<body>");		
		saida.println("<img src=\"https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcSt3elXVxwCETiqiHvjvudMC4iTbjohuALJ38IraK3_PUfZH03_-pvyLdSxXo6MzuryCcbBz4XHN3p67EDmR_EGMNM26h0iiQ&usqp=CAE\"atl=\"Camiseta\"/>");
		saida.println("<p>Camiseta Tshirt Estampada Rosa dos Ventos preto</p>");
		saida.println("<img src=\"https://cdnv2.moovin.com.br/casadotenista/imagens/produtos/original/camiseta-d2m-plain-branca-adidas-6c7d9bb6698510363596d852890ee1bc.jpg\" alt=\""
				+ "Camiseta D2M Plain Branca - Adidas\"></img>");
		saida.println("<p><b>Camiseta D2M Plain Branca - Adidas</b></p>");
		saida.println("</body>");
		saida.println("</HTML>");

}		
}
