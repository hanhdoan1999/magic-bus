package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public abstract class AbstractServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doExecute(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doExecute(req, resp);
	}

	private void doExecute(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		String oneTimeMessage = (String)session.getAttribute("oneTimeMessage");
		if(oneTimeMessage != null){
			req.setAttribute("oneTimeMessage", oneTimeMessage);
			session.removeAttribute("oneTimeMessage");
		}

		Connection con = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost/magic_bus", "postgres", "postgres");
			con.setAutoCommit(false);
			String next = execute(req, resp, con);
			con.commit();

			
			
			if(next != null){
				//begin xác thực người dùng
				if(session.getAttribute("idQuanLy")==null) {
					RequestDispatcher dispartcher =req.getRequestDispatcher("/WEB-INF/pages/QuanLyDangNhap.jsp");
					dispartcher.forward(req, resp);
					
				}	
				//end xác thực người dùng
				if(next.startsWith("redirect:")){
					String nextPath = next.replaceFirst("redirect:", "");
					resp.sendRedirect(nextPath);
				}
				else{
					RequestDispatcher dispatcher = req.getRequestDispatcher(next);
					dispatcher.forward(req, resp);
				}
			}
		} catch (SQLException e) {
			if(con != null){
				try {
					con.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace(System.err);
				}
			}
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} finally{
			if(con != null){
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace(System.err);
				}
			}
		}
	}

	public abstract String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
			throws ServletException, IOException;
}
