package tp1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CMonImcex4
 */
@WebServlet("/CMonImcex4")
public class CMonImcex4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CMonImcex4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tailleStr = request.getParameter("taille");
        String poidsStr = request.getParameter("poids");

        if (tailleStr == null || tailleStr.trim().isEmpty() || poidsStr == null || poidsStr.trim().isEmpty()) {
            throw new IllegalArgumentException("Les valeurs de taille et de poids sont obligatoires.");
        }

        double taille = Double.parseDouble(tailleStr);
        double poids = Double.parseDouble(poidsStr);

        Imc imc = new Imc(taille, poids);
        double resultatImc = imc.calcul();

        Cookie cookieTaille = new Cookie("taille", String.valueOf(taille));
        Cookie cookiePoids = new Cookie("poids", String.valueOf(poids));
        Cookie cookieImc = new Cookie("imc", String.valueOf(resultatImc));

        cookieTaille.setMaxAge(60 * 60);  
        cookiePoids.setMaxAge(60 * 60); 
        cookieImc.setMaxAge(60 * 60);   

        response.addCookie(cookieTaille);
        response.addCookie(cookiePoids);
        response.addCookie(cookieImc);

        request.setAttribute("resultatImc", resultatImc);

        request.getRequestDispatcher("resultat.jsp").forward(request, response);
	}

}
