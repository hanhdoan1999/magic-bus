package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BenDoDao;
import dto.BenDoDto;


@WebServlet(urlPatterns = "/search-line")
public class SearchLineServlet extends AbstractServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)

			throws ServletException, IOException {
		BenDoDao busStopDao = new BenDoDao(connection);
		List<BenDoDto> busStops = busStopDao.selectAll();
		req.setAttribute("busStops", busStops);
		return "/WEB-INF/pages/search/line.jsp";
	}
}