package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.BusDao;
import dto.BusDto;

@WebServlet(urlPatterns = "/danhsachbus")
public class BusServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
        BusDao BusDao = new BusDao(connection);
        List<BusDto> buss = BusDao.selectAll();
        req.setAttribute("buss", buss);
        return "/WEB-INF/pages/DanhSachBus.jsp";
    }
}