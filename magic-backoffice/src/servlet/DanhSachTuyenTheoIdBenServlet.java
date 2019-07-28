package servlet;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TuyenDuongComplexDao;
import dto.TuyenDuongComplexDto;


@WebServlet(urlPatterns = "/danh-sach-tuyen-theo-id-ben")
public class DanhSachTuyenTheoIdBenServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	String idBen= req.getParameter("idBen");
    	TuyenDuongComplexDao dao = new TuyenDuongComplexDao(connection);
        List<TuyenDuongComplexDto> TuyenDuongs = dao.danhSachTuyenTheoIdBen(idBen);
        req.setAttribute("TuyenDuongs", TuyenDuongs);  
        return "/WEB-INF/pages/DanhSachTuyenTheoIdBen.jsp";
    }

}