package servlet;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TuyenDuongComplexDao;
import dao.TuyenDuongDao;
import dto.TuyenDuongComplexDto;
import dto.TuyenDuongDto;

@WebServlet(urlPatterns = "/danhsachtuyen")
public class DanhSachTuyenServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	TuyenDuongComplexDao dao = new TuyenDuongComplexDao(connection);
        List<TuyenDuongComplexDto> TuyenDuongs = dao.selectAll();
        req.setAttribute("TuyenDuongs", TuyenDuongs);  
        return "/WEB-INF/pages/DanhSachTuyen.jsp";
    }

}