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
 * Servlet implementation class EditPalabra
 */
@WebServlet("/EditPalabra")
public class EditPalabra extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditPalabra() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		PalabraDAOImpl pDAO = new PalabraDAOImpl();
		Palabra p = pDAO.readOne(id);
		
		request.setAttribute("p", p);
		
		getServletContext().getRequestDispatcher("/view/editPalabra.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Este es el id: " + request.getParameter("id"));
		
		
		Palabra p = new Palabra(Integer.parseInt(request.getParameter("id")), request.getParameter("nombre"), 
				request.getParameter("significado"), request.getParameter("referencia"));
		
		PalabraDAOImpl pDAO = new PalabraDAOImpl();
		pDAO.updatePalabra(p);
		
		getServletContext().getRequestDispatcher("/Inicio").forward(request, response);
	}

}
