

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LivreController
 */
@WebServlet("/LivreController")
public class LivreController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LivreController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titre = request.getParameter("titre");
		String catégorie = request.getParameter("categorie");
		int isbn = Integer.parseInt(request.getParameter("isbn"));
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		PrintWriter out = response.getWriter();
		out.write("<html><head></head><body>");
		out.write("<h1>Validation d'un livre</h1><br/>");
		out.write("<h2>Le livre</h2><br/>");
		out.write("Titre = "+titre+"<br/>");
		out.write("Catégorie = "+catégorie+"<br/>");
		out.write("Numéro ISBN = "+isbn+"<br/>");
		out.write("<h2>l'auteur ...</h2><br/>");
		out.write("Nom = "+nom+"<br/>");
		out.write("Prènom = "+prenom+"<br/>");
		out.write("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
