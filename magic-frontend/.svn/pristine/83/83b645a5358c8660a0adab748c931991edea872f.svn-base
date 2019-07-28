package servlet;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DanhSachDatChoDao;
import dto.DanhSachDatChoDto;



@WebServlet(urlPatterns = "/danhsachdatcho")
public class DanhSachDatChoServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	String idHoiVien=req.getParameter("idHoiVien");
    	DanhSachDatChoDao dao = new DanhSachDatChoDao(connection);
        List<DanhSachDatChoDto> danhsach = dao.danhsachdatcho(idHoiVien);
        req.setAttribute("danhsach", danhsach);
        req.setAttribute("soluongcho", danhsach.size());
        return "/WEB-INF/pages/DanhSachDatCho.jsp";
    }

}