package resumepackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ResumeServlet
 */
@WebServlet("/ResumeServlet")
public class ResumeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResumeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession thisSession = request.getSession();

		String fname = (String) request.getAttribute("fname");
		String lname = (String) request.getAttribute("lname");
		String email = (String) request.getAttribute("email");
		Person me = new Person(fname,lname,email);
		me.addMe();
		thisSession.setAttribute("me",me);
		getServletContext().getRequestDispatcher("/NewJob.jsp").forward(request, response);
	}

}
