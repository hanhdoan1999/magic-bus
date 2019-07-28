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


@WebServlet(urlPatterns = "/hien-thi-tuyen-theo-idbus")
public class HienThiTuyenTheoIdBusServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	String idBus= req.getParameter("idBus");
    	TuyenDuongComplexDao dao = new TuyenDuongComplexDao(connection);
        List<TuyenDuongComplexDto> TuyenDuongs = dao.danhSachTuyenTheoIdBus(idBus);
        req.setAttribute("TuyenDuongs", TuyenDuongs);  
        return "/WEB-INF/pages/DanhSachTuyenTheoIdBus.jsp";
    }

}