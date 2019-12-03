package projekti.control;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.LaskuriDAO;
import projekti.model.Lasku;

@WebServlet("/lisaalasku")
public class LisaaLaskuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jsp = "/view/uusilaskulomake.jsp";
		RequestDispatcher dispather = getServletContext().getRequestDispatcher(jsp);
		dispather.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nimi = request.getParameter("nimi");
		String saaja = request.getParameter("saaja");
		String tilinro = request.getParameter("tilinro");
		String viitenro = request.getParameter("viitenro");
		String viesti = request.getParameter("viesti");
		String erapvm = request.getParameter("erapvm");
		
		//luodaan uusi pizza edellisillä parametreillä
		Lasku lasku = new Lasku(nimi, saaja, tilinro, viitenro, viesti, erapvm);
		
		LaskuriDAO laskudao = new LaskuriDAO();
		
		String text = null;
		try {
			laskudao.addLasku(lasku);
		} catch (Exception e) {
			text = "Tapahtui tietokantavirhe";
		}
		if(text != null) {
			String koodattuTeksti = URLEncoder.encode(text, "UTF-8");
			response.sendRedirect("laskulistaus?viesti=" + koodattuTeksti);
		} else {
			response.sendRedirect("laskulistaus");
		}
	}


}
