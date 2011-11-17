package jspacg;

import beans.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginForm
 */
@WebServlet("/LoginForm")
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String utype  = request.getParameter("utype");
		
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		String na=null;
		int n =0;
//		if(utype.equals("consumer")){
//		   if(Consumer.chekin(name,"", password))
//		   {
//		          Consumer consumer =  new Consumer(name, "", password);
//		          Consumer consumers[] = consumers.getAll();
//		          consumer.setID(iD);
//		          request.getSession(true).setAttribute("Id", name);
//		   }
//			out.println(utype);
//		   response.sendRedirect("Jsp/consuIntfac.jsp");
//		   return;
//		}
//		else if (utype.equals("bussiniss")){
//	 	if(Bussiniss.chekin(name, password))
//		   {
//	          request.getSession(true).setAttribute("BussId", name);
//	          request.getSession().setAttribute("Busseslist", Bussiniss.getAllBuss());
//	          request.getSession().setAttribute("l", Bussiniss.getAllBuss().length);
//	          out.print("<h1>"+name+"<h1>");
//	          out.close();
//		   }
//			 response.sendRedirect("Jsp/businisIntfac.jsp");
//			 return;
//		}
//		else if(utype.equals("manager")){
//			response.sendRedirect("Jsp/managerIntfac.jsp");
//			return;
//		}
//		else{
//			response.sendRedirect("Jsp/login.jsp");
//			return;
//			}
//		}

		//   request.getSession().setAttribute("Busseslist", Bussiniss.getAllBuss());
		   request.getSession(true).setAttribute("BussId", name);
	     // request.getSession().setAttribute("l", Bussiniss.getAllBuss().length);
		 //  request.getSession().setAttribute("l", Bussiniss.getBussById(1).getName());
		   Db2Conn  coonn = new Db2Conn();
		   try {
			int rt = coonn.execupdate("create table SSSS(shit int)");
			//rt.last();
			n = rt;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//   	   	//conn_tmp.execupdate("create table SSSS(cloumn1, int)");
//		   Statement st = null;
//		   String na =null;
//		try {
//			st = coonn.getDb2conn().createStatement();
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		   try {
//			    st.executeUpdate("create table SSSS(cloumn1 int)");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	       out.print("<h1>"+  n+"</h1>");
//	       out.print("<h2>"+ request.getSession().getAttribute("BussId")+ "</h2>");
	}
}

