package projekti.control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.LaskuriDAO;
import projekti.model.Lasku;

@WebServlet("/laskulistaus")
public class LaskuListausServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LaskuriDAO laskudao = new LaskuriDAO();
		ArrayList<Lasku> laskut  = laskudao.findAll();
		
		// Talletetaan request-olion alle pizzalista, jotta tiedot ovat käytössä jsp:llä
		request.setAttribute("laskut", laskut);
		
		String jsp = "/view/index.jsp"; 
		RequestDispatcher dispather = getServletContext().getRequestDispatcher(jsp);
		dispather.forward(request, response);
	}
}

