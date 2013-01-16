package davidou.org;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/hello.view")
public class helloservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    processRequest(request, response);
	}


	private void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		 try {
			  // 說明瀏覽器送來之使用者所輸入資料的編碼
	          request.setCharacterEncoding("UTF-8");  
         
	          request.setAttribute("name", "davidou");
	          // 準備將程式的執行順序移轉到 /ch01/goodLuck.jsp 
	          RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
	          rd.forward(request, response);
	          return ;
	       } catch(UnsupportedEncodingException e) {
	          throw new ServletException(e); 
	       }
	}

}
