package servlet;

import java.io.IOException;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import dao.BenDoDao;
import dao.LineDao;
import dto.BenDoDto;
import dto.LineBusComplexDto;
import util.DBConnectUtil;

@WebServlet(urlPatterns = "/search-result")
public class SearchLineGetResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Connection connection = DBConnectUtil.getConnection();
		String day = req.getParameter("day");
		String month = req.getParameter("month");
		String year = req.getParameter("year");
		String idDiemDi = req.getParameter("from");
		String idDiemDen = req.getParameter("to");

		BenDoDao dao1 = new BenDoDao(connection);
		BenDoDto benxuatphat = dao1.selectById(idDiemDi);

		BenDoDao dao2 = new BenDoDao(connection);
		BenDoDto benden = dao2.selectById(idDiemDen);

		String date1 = year + "-" + month + "-" + day;	
		String diemDi = benxuatphat.getTinhThanh();
		String diemDen = benden.getTinhThanh();		
		Date date = Date.valueOf(date1);

		LineDao lineDao = new LineDao(connection);
		List<LineBusComplexDto> lines = lineDao.searchLine(diemDi, diemDen, date);
		Gson gson = new Gson();
		JsonElement element = gson.toJsonTree(lines, new

		TypeToken<List<LineBusComplexDto>>() {
		}.getType());

		JsonArray jsonArray = element.getAsJsonArray();
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().println(jsonArray);
	}
}