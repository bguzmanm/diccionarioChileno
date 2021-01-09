package cl.awakelab.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.awakelab.model.Palabra;
import cl.awakelab.model.dao.PalabraDAOImpl;

/**
 * Servlet implementation class edicionPalabra
 */
@WebServlet("/crearPalabra")
public class crearPalabra extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public crearPalabra() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher("/view/newPalabra.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Palabra p = new Palabra(Integer.parseInt(request.getParameter("id")), request.getParameter("nombre"), 
				request.getParameter("significado"), request.getParameter("referencia"));
		
		PalabraDAOImpl pDAO = new PalabraDAOImpl();
		pDAO.createPalabra(p);
		
		getServletContext().getRequestDispatcher("/Inicio").forward(request, response);
		
	}

}
