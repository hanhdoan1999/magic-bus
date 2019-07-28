package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SampleDao;
import dto.SampleDto;

@SuppressWarnings("serial")
public class SampleServlet extends AbstractServlet{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
			throws ServletException, IOException {
		System.out.println("SampleServlet");
		SampleDao dao = new SampleDao(connection);
		List<SampleDto> sampleDtos = dao.selectAll();
		req.setAttribute("sampleDtos", sampleDtos);
		return "/WEB-INF/pages/sample.jsp";
	}

}
