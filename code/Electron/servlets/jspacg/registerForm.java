package jspacg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Consumer;

/**
 * Servlet implementation class registerForm
 */
@WebServlet("/registerForm")
public class registerForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerForm() {
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
		response.setCharacterEncoding( "gbk");
		PrintWriter out = response.getWriter();
		out.print("<HTML><TITLE>ע����Ϣ</TITLE><BODY>");
		String phoneNmr = request.getParameter("phoneNmr");
		String passwrd  = request.getParameter("password");
	    //  ע��
		 String  regis_info = Consumer.register(phoneNmr, passwrd);
		//if ()
		out.print("ע��ɹ���<br> ע����ϢΪ��"+regis_info +"<br>");
		out.print("ע��ʧ�ܣ�<br> ע����ϢΪ��"+regis_info +"<br>");
		out.print("</BODY></HTML>");
		out.close();
	}

}
