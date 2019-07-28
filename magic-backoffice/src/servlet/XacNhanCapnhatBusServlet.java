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

import util.ValidationUtil;

@WebServlet(urlPatterns = "/xacnhancapnhatbus")
public class XacNhanCapnhatBusServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
        String idBus= req.getParameter("idBus");
        int soHang = Integer.parseInt(req.getParameter("soHang"));
        int soGheMoiHang = Integer.parseInt(req.getParameter("soGheMoiHang"));
        String kiHieuDiaPhuong = req.getParameter("kiHieuDiaPhuong");
        String bienSoDangKi = req.getParameter("bienSoDangKi");
        int soThuTuDangKi = Integer.parseInt(req.getParameter("soThuTuDangKi"));
      
        BusDao dao = new BusDao(connection);
        BusDto bus = dao.selectById(idBus);
        req.setAttribute("bus", bus);
        return "/WEB-INF/pages/XacNhanCapNhatBus.jsp";
    }
}