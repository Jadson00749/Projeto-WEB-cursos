package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
		//criar as variaveis
		int idformulario;
		int tipoformulario;
		
		idformulario = Integer.parseInt(request.getParameter("idformulario"));
		tipoformulario = Integer.parseInt(request.getParameter("tipoformulario"));
		
		if(idformulario == 1) {
			
			
		}
		else if(idformulario == 2) {
			
			
		}
		else if(idformulario == 3) {
			
			
			
		}
	}

}
