package resumepackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class JobServlet
 */
@WebServlet("/JobServlet")
public class JobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JobServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession thisSession = request.getSession();
		Person me = (Person) thisSession.getAttribute("me");
		Job thisJob = new Job();
		thisJob.setJcompany((String) request.getAttribute("jcompany"));
		thisJob.setJtitle((String)request.getAttribute("jcompany"));
		thisJob.addJobtoDB(me.getPersonid());
		me.addJob(thisJob);
		System.out.println("Saved to database. Your form is working!");
		
	}

}
