package br.com.senai.servelet01.classes;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/calcas")
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
		saida.println("<img src=\"https://t-static.dafiti.com.br/26cK_gNljuE7EhEvK6AjQ3KqD_E=/fit-in/427x620/static.dafiti.com.br/p/ks-casual-%2526-sport-cal%25c3%25a7a-jeans-silver-m%25c3%25a9dio-masculino-azul-v-8142-53680701-1-product.jpg\"atl=\""
				+ "Calca jeans\"/>");
		saida.println("<p><b>CALCA JEANS SILVER MEDIO MASCULINO AZUL V</b></p>");
		saida.println("<img src=\"https://images.tcdn.com.br/img/img_prod/763957/calca_jogger_masculina_bege_basica_53_1_3343fccfb7cef2d102d0b5caf12b9424.jpg\" "
				+ "alt=\"Calca jogger\"></img>");
		saida.println("<p><b>Calca Jogger Masculina BEGE Basica</b></p>");
		saida.println("</body>");
		saida.println("</HTML>");
				
		
		
	}
}
